<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<html>
<head>
<style>
       script {
           width: 200px;
           height: 200px;
       }
</style>
    <title>Image Toggle </title>
    <script>
        function toggleImage() {
            var image = document.getElementById('myImage');
            if (image.src.endsWith('image1.jpg')) {
                image.src = 'image2.jpg';
            } else {
                image.src = 'image1.jpg';
            }
        }
    </script>
</head>
<body>
    <img id="myImage" src="image1.jpg" width="500px" heigth="800px" onclick="toggleImage()" />
    <button onclick="toggleImage()">Toggle Image</button>
</body>
</html>
