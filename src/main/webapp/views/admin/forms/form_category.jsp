<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <div class="row form-add mt-4" style="height: 10cm !important;">
    <div class="col-sm"></div>
    <div class="col-sm">
      <div class="form-title text-center">
        <span class="admin-home">
          Thêm mới loại sản phẩm
        </span>
      </div>

      <div class="form-body">
        <form action="/admin-home/save-category" method="post">
          <div class="form-group mt-4">
            <label for="categoryCode">Nhập mã</label>
            <input type="text" class="form-control" name="categoryCode" id="categoryCode">
          </div>

          <div class="form-group mt-4">
            <label for="categoryName">Nhập tên</label>
            <input type="text" class="form-control" name="categoryName" id="categoryName">
          </div>

          <div class="form-button mt-4">
            <button type="submit" class="btn btn-success">Thêm mới</button>
            <a class="btn btn-danger" href="/admin-home">Quay lại</a>
          </div>
        </form>
      </div>
    </div>
    <div class="col-sm"></div>
  </div>
</body>
</html>
