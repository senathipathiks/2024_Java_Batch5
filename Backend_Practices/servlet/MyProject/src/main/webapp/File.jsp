<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Uploading</title>
</head>
<body>

 <form action="FileServlet" method="post" >
        Select File to Upload: <input type="file" name="fileName">
        <br>
        Overwrite existing file? <input type="checkbox" name="overwrite">
        <br>
        <input type="submit" value="Upload">
</form>
    
</body>
</html>