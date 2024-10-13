<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.guru.Student"%>
<jsp:useBean id="obj" class="com.guru.Student"></jsp:useBean>
<jsp:setProperty property="id" name="obj" value="5" />
<jsp:setProperty property="name" name="obj" value="Guru" />

<jsp:useBean id="myObj" class="com.guru.Student"></jsp:useBean>
<jsp:setProperty property="*" name="myObj"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<label>Your name is:</label>
	<jsp:getProperty property="name" name="myObj" /></br>
	<label>Your id is:</label>
	<jsp:getProperty property="id" name="myObj" />
</body>
</html>