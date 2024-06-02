<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="utf-8">
    <title>Quản Lý Thông Tin Sinh Viên</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            padding: 20px;
        }
        h4 {
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .btn-group button {
            margin-right: 5px;
        }
    </style>
</head>
<body>
<%
    String formtitle = "QUẢN LÝ THÔNG TIN SINH VIÊN";
%>
<div class="container">
    <h4 class="text-center"><%= formtitle %></h4>
    <form method="post" action='svlSV'>
        <div class="form-group">
            <label for="parmasv">Mã SV</label>
            <input type="text" class="form-control" id="parmasv" name="parmasv" value=''>
        </div>
        <div class="form-group">
            <label for="parhodem">Họ đệm SV</label>
            <input type="text" class="form-control" id="parhodem" name='parhodem' value=''>
        </div>
        <div class="form-group">
            <label for="partensv">Tên SV</label>
            <input type="text" class="form-control" id="partensv" name='partensv' value=''>
        </div>
        <div class="form-group">
            <label for="partelsv">Số điện thoại</label>
            <input type="text" class="form-control" id="partelsv" name='partelsv' value=''>
        </div>
        <div class="form-group">
            <label for="paremailsv">Email</label>
            <input type="text" class="form-control" id="paremailsv" name='paremailsv' value=''>
        </div>
        <div class="btn-group">
            <button type="submit" class="btn btn-primary" name="action" value="create">Create</button>
            <button type="submit" class="btn btn-warning" name="action" value="modify">Modify</button>
            <button type="submit" class="btn btn-danger" name="action" value="delete">Delete</button>
        </div>
    </form>

    <table class="table table-bordered table-striped mt-4">
        <thead>
            <tr>
                <th>MASV</th>
                <th>TENSV</th>
                <th>EMAILSV</th>
                <!-- Add other column headers as needed -->
            </tr>
        </thead>
        <tbody>
            <%-- <c:forEach var="student" items="${students}"> --%>
            <tr>
                <td>${students.masv}</td>
                <td>${students.tensv}</td>
                <td>${students.emailsv}</td>
                <!-- Add other columns as needed -->
            </tr>
            <%-- </c:forEach> --%>
        </tbody>
    </table>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
