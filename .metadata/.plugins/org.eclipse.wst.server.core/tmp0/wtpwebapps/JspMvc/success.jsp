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
      <h1>Successfully Logged in...!</h1>
      <%
      Employee e=  (Employee)request.getAttribute("emp");
      %>
      <h3><% out.println(e.getEmpid()+" "+e.getEmpname()); %></h3>
    </p>
</body>
</html>