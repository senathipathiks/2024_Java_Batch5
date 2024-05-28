<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
       script {
           width: 200px;
           height: 200px;
       }
</style>
  <script>
        function toggleImage() {
            var image = document.getElementById('myImage');
            if (image.src.endsWith('https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcT65HgZlGkuDfUe0QEv25rsL7QIdJs5VGTkody9wmMUy7YqmZus')) {
                image.src = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAole_1hk_gh98GdCla_WyrTDWIO7tVnMCVIktLDN4TA&s';
            } else {
                image.src = 'https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcT65HgZlGkuDfUe0QEv25rsL7QIdJs5VGTkody9wmMUy7YqmZus';
            }
        }
    </script>
</head>
<body>
<img id="myImage" src="image1.jpg" width="500px" heigth="800px" onclick="toggleImage()" />
<button onclick="toggleImage()">Toggle Image</button>
</body>
</html>