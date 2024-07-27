<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</head>
<style>
.btn-group-vertical
{
border-radius:20px;
margin-left:50px;
margin-top:100px;
}
</style>
<body>
	<div class="btn-group-vertical" role="group" aria-label="Vertical button group">
  	<a href="Insert.jsp" target="frame3"><input type="submit" class="btn btn-primary" value="Insert"></a>
  	<br><br>
  	<a href="Update.jsp" target="frame3"><input type="submit" class="btn btn-primary" value="Update" name=update></a>
  	<br><br>
  	<a href="Delete.jsp" target="frame3"><input type="submit" class="btn btn-primary" value="Delete"></a>
  	<br><br>
  	<a href="ViewAll.jsp" target="frame3"><input type="submit" class="btn btn-primary" value="View All"></a>
	<br><br>
  	<a href="Find.jsp" target="frame3"><input type="submit" class="btn btn-primary" value="Find"></a>
	</div>
</body>
</html>