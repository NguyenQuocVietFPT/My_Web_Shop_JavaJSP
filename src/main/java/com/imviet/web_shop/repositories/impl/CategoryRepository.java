package com.imviet.web_shop.repositories.impl;

import com.imviet.web_shop.models.category;
import com.imviet.web_shop.repositories.ICategoryRepository;
import com.imviet.web_shop.utilities.HibernateUtils;
import jakarta.inject.Inject;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements ICategoryRepository {


    @Override
    public List<category> getAll() {

        List<category> categoryList = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            Query query = session.createQuery("from category ");
            categoryList = query.getResultList();

        } catch (Exception e) {
            categoryList = null;
        }

        return categoryList;
    }

    @Override
    public category save(category cate) {

        Transaction transaction = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            transaction = session.getTransaction();
            transaction.begin();
            session.persist(cate);
            if(checkExist(cate.getCate_code()) == true) {
                cate = null;
                transaction.rollback();
            } else {
                transaction.commit();
            }

        } catch (Exception e) {

            if (transaction != null) {
                cate = null;
                transaction.rollback();
            }

        }
        return cate;
    }

    @Override
    public category findById(Long id) {

        category cateFind = new category();

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            Query query = session.createQuery("from category where id = :id");
            query.setParameter("id",id);
            cateFind  = (category) query.getSingleResult();

        } catch (Exception e) {
            cateFind = null;
        }

        return cateFind;
    }

    @Override
    public List<category> search(String keyWord,String value) {

        List<category> categoryListFind = new ArrayList<>();

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            Query query = session.createQuery("from category where "+keyWord+"=:"+keyWord);
            query.setParameter(keyWord,value);
            categoryListFind = query.getResultList();

        } catch (Exception e) {
            categoryListFind = null;
        }

        return categoryListFind;
    }

    @Override
    public boolean checkExist(String cate_code) {

        Boolean isExisted = false;
        category cateFind = new category();

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            Query query = session.createQuery("from category where cate_code = :cate_code");
            query.setParameter("cate_code",cate_code);
            cateFind  = (category) query.getSingleResult();

            if(cateFind != null) {
                isExisted = true;
            }

        } catch (Exception e) {
        }

        return isExisted;
    }

    @Override
    public void update(category cate) {

        Transaction transaction = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            transaction = session.getTransaction();
            transaction.begin();
            session.merge(cate);
            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

        }
    }

    @Override
    public void delete(category cate) {

        Transaction transaction = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {

            transaction = session.getTransaction();
            transaction.begin();
            session.delete(cate);
            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

        }
    }

}
