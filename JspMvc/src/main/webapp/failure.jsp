<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.guru.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <p>
      <h1>Login Failed...!</h1>
      <%
      Employee e=  (Employee)request.getAttribute("emp");
      %>
      <h3><% out.println(" Welocome User "+e.getEmpname()+"Your are restricted here"); %></h3>
    </p>
    <%@ include file="index.html" %>
</body>
</html>