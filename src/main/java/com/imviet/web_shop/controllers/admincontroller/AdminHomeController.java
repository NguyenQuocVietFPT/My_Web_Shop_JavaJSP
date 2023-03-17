package com.imviet.web_shop.controllers.admincontroller;

import com.imviet.web_shop.models.category;
import com.imviet.web_shop.services.ICategoryService;
import com.imviet.web_shop.services.impl.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "admin", value = {
        "/admin-home",
        "/admin-home/bieu-do",
        "/admin-home/view-add-category",
        "/admin-home/view-add-product",
        "/admin-home/save-category",
        "/admin-home/save-product",
        "/admin-home/view-detail-category",
        "/admin-home/view-deatail-product",
})
public class AdminHomeController extends HttpServlet {

    private ICategoryService _categoryService = new CategoryService();
    private List<category> categoryList = new ArrayList<>();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String url = req.getRequestURI();

        if(url.contains("bieu-do")) {
            showChart(req, resp);
        } else if (url.contains("view-add-category")) {
            showFormAddCategory(req, resp);
        }else if (url.contains("view-add-product")) {
            showFormAddProduct(req, resp);
        } else if (url.contains("view-detail-category")) {
            detailCategory(req, resp);
        } else if (url.contains("view-detail-product")) {
            detailProduct(req, resp);
        } else {
            showHomePgae(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String url = req.getRequestURI();

        if(url.contains("save-category")) {
            addCategory(req, resp);
        } else if(url.contains("save-category")) {
            addProduct(req, resp);
        }
    }

    protected void showChart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/admin/chart.jsp").forward(req, resp);
    }

    protected void showHomePgae(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/admin/home.jsp").forward(req, resp);
    }

    protected void showFormAddCategory(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/admin/forms/form_category.jsp").forward(req, resp);
    }

    protected void addCategory(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cateCode = req.getParameter("categoryCode");
        String cateName = req.getParameter("categoryName");

        category categoryFormData = new category();
        categoryFormData.setCate_code(cateCode);
        categoryFormData.setCate_name(cateName);

        _categoryService.addNewCategory(categoryFormData);

        PrintWriter pt = resp.getWriter();
        resp.setContentType("text/html");
        pt.write("<h1>Lưu thàng công</h1>");

    }

    protected void detailCategory(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        categoryList = _categoryService.getAllCategories();
        req.setAttribute("categoryList", categoryList);
        req.getRequestDispatcher("/views/admin/tables/table_category.jsp").forward(req, resp);
    }

    protected void showFormAddProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/admin/forms/form_product.jsp").forward(req, resp);
    }

    protected void addProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/admin/forms/form_product.jsp").forward(req, resp);
    }

    protected void detailProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/admin/forms/form_category.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
