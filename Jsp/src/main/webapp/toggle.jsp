<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Login.jsp" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
   
   
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script>
        $(document).ready(function(){
            $("#toggle").click(function(){
                $("#img1").toggle();
                $("#img2").toggle();
            });
        });
    </script>
</head>
<body>
    <img src="image1.png" id="img1" style="display: none;">
    <img src="image2.png" id="img2">
    <input type="button" id="toggle" value="Toggle">
</body>
</html>