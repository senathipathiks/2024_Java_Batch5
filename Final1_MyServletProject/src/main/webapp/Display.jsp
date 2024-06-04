<!DOCTYPE html>
<html>
 
<head>
    <meta charset="UTF-8">
    <title>Disco Light Effect</title>
  
    <link rel="stylesheet" type="text/css" href="styles.css">
<style>
body {
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%;
    background: linear-gradient(45deg, #f06, #0c6, #60f, #fc0);
    /* Gradient with changing colors */
    animation: rotateColors 3s infinite alternate;
    display: flex;
    justify-content: center;
    align-items: center;
}
 
@keyframes rotateColors {
    0% {
        background: linear-gradient(45deg, #f06, #0c6, #60f, #fc0);
    }
 
    100% {
        background: linear-gradient(45deg, #fc0, #60f, #0c6, #f06);
    }
}
 
.content-container {
    text-align: center;
}
 
h1,
img {
    position: relative;
    z-index: 1;
    color: white;
    text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
    max-width: 90%;
    max-height: 90%;
    margin: 0 auto;
    padding: 20px;
}
 
img {
    border: 2px solid #333;
    border-radius: 10px;
    box-shadow: 5px 5px 10px rgba(0, 0, 0, 0.3);
    animation: rise 2s ease forwards;
}
 
@keyframes rise {
    from {
        transform: translateY(100%);
    }
 
    to {
        transform: translateY(0);
    }
}

</style>

</head>
 
<body>
    <div class="content-container">
        <h1>Welcome to the Leave Management System</h1>
<img src="https://th.bing.com/th/id/R.892bb645c09c766efcc5bc4d0c93094a?rik=slmcvUaa5yToAw&riu=http%3a%2f%2fwww.wallpapers13.com%2fwp-content%2fuploads%2f2015%2f12%2fNature-Lake-Bled.-Desktop-background-image.jpg&ehk=c2raFC95S12P3OL0%2fwdM60ro3oUxsSEajkuGEN%2fsjbo%3d"
            alt="Lake Bled">
    </div>
</body>
 
</html>