<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="stu1" class="com.Aravind.jsp.Student"></jsp:useBean>
<jsp:setProperty property="*" name="stu1"/>
<jsp:getProperty property="stuID" name="stu1"/>
<jsp:getProperty property="stuName" name="stu1"/>
<jsp:getProperty property="stuCity" name="stu1"/>

</body>
</html>