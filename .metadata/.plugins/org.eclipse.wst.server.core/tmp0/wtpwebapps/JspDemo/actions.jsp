<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <jsp:forward page="sample.jsp">
      <jsp:param value="Datta" name="uname" />
   </jsp:forward>
</body>
</html>