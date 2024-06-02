<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Image Swapping Example</title>
</head>
<body>
    <h1>Image Swapping Example</h1>
    
    
    <img id="image1" src="${pageContext.request.contextPath}/1.jpg" alt="Image 1" >
    <img id="image2" src="${pageContext.request.contextPath}/2.jpg" alt="Image 2" style=" display: none;"><br>

    
    <button onclick="swapImages()">Swap Images</button>

    
    <script>
        function swapImages() {
            var img1 = document.getElementById('image1');
            var img2 = document.getElementById('image2');

            // Toggle visibility
            img1.style.display = img1.style.display === 'none' ? 'block' : 'none';
            img2.style.display = img2.style.display === 'none' ? 'block' : 'none';
        }
    </script>
</body>
</html>