<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="stu1" class = "com.gana.bean.Student"></jsp:useBean>
<jsp:setProperty property="*" name="stu1"/>
<jsp:getProperty property="studID" name="stu1"/>
<jsp:getProperty property="studName" name="stu1"/>
<jsp:getProperty property="studCity" name="stu1"/>
</body>
</html>