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
    <title>Image Toggle Example</title>
    <script>
        function toggleImage() {
            var image = document.getElementById('myImage');
            if (image.src.endsWith('img1.jpg')) {
                image.src = 'img2.jpg';
            } else {
                image.src = 'img1.jpg';
            }
        }
    </script>
</head>
<body>
    <img id="myImage" src="img1.jpg" width="500px" height="800px" onclick="toggleImage()" />
    <button onclick="toggleImage()">Toggle Image</button>
</body>
</html>
 