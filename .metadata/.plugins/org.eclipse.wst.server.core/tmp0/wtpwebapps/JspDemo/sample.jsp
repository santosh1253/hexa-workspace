<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <jsp:include page="UseBean.jsp"/>
   <%
    Date d=new Date();
    out.println(d.toString());
    String res=request.getParameter("uname");
    out.println("<h1>"+res+"</h1>");
   %>
</body>
</html>