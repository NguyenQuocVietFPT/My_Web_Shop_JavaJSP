<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
  </head>
  <body>
    <table class="table table-bordered">
      <thead>
        <tr class="text-center">
          <th scope="col">Id</th>
          <th scope="col">Category Code</th>
          <th scope="col">Category Code</th>
          <th scope="col">Hành động</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${categoryList}" var="category">
          <tr>
            <td>${category.cate_id}</td>
            <td>${category.cate_code}</td>
            <td>${category.cate_name}</td>
            <td>
              <a class="btn btn-secondary"
                 href="/admin-home/view-category-information?id=${category.cate_id}">
                Detail
              </a>
              <a class="btn btn-success"
                 href="/admin-home/view-category-update?id=${category.cate_id}">
                Update
              </a>
              <a class="btn btn-danger"
                 href="/admin-home/category-delete?id=${category.cate_id}">
                Delete
              </a>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
