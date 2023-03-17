<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">

                <div class="dropdown-list-items">
                    <a class="nav-link admin-home" href="/admin-home">
                    <span class="admin-home bi bi-house-fill">
                        Trang chủ
                    </span>
                    </a>
                </div>

                <div class="dropdown-list-items">
                    <a class="btn btn-success admin-home" href="/admin-home/bieu-do">
                    <span class="admin-home bi bi-bar-chart-fill">
                        Biểu đồ
                    </span>
                    </a>
                </div>

                <div class="dropdown show dropdown-list-items">
                    <a class="admin-home btn btn-primary dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <span class="admin-home bi bi-database-fill">
                            Danh sách dữ liệu
                        </span>
                    </a>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                        <a class="dropdown-item" href="/admin-home/view-detail-category">
                            Category
                        </a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="/admin-home/view-detail-product">
                            Sản phẩm
                        </a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="/admin-home/view-detail-user">
                            Tài khoản người dùng
                        </a>
                    </div>
                </div>

                <div class="dropdown show dropdown-list-items">
                    <a class="admin-home btn btn-danger dropdown-toggle" href="#"
                       role="button" data-toggle="dropdown" aria-haspopup="true" qaria-expanded="false">
                        <span class="admin-home bi bi-book-half">
                            Forms
                        </span>
                    </a>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                        <a class="dropdown-item" href="/admin-home/view-add-category">
                            Category
                        </a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="/admin-home/view-add-product">
                            Sản phẩm
                        </a>
                    </div>
                </div>

            </ul>

            <ul class="navbar-nav ml-auto">
                <li class="nav-item dropdown">
                    <a class="admin-home admin-home nav-link dropdown-toggle" href="#"
                       id="navbarDropdown" role="button" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        <span class="admin-home admin-home bi bi-person-fill">
                            Tài khoản của tôi
                        </span>
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="admin-home dropdown-item" href="/courses/create">
                                    Thông tin
                                </a>
                                <div class="dropdown-divider"></div>
                                <a class="admin-home dropdown-item" href="#">
                                    Đăng xuất
                                </a>
                            </div>
                        </li>
                    </ul>
                </div>
    </div>
</nav>
