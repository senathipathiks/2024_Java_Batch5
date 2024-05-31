<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FileUploadHandler.jsp" enctype="multipart/form-data" align="center" method="post">
<input type="file" name="file"> <br>
<input type="checkbox">Overwrite<br>	 
<input type="submit" value="Upload file">
</form>
</body>
</html>