<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

.navbar {
    display: flex;
    justify-content: space-around;
    background-color: #333;
    padding: 10px 0;
}

.navbar a {
    color: #f2f2f2;
    text-decoration: none;
    font-size: 20px;
    transition: color 0.3s ease;
}

.navbar a:hover {
    color: #ddd;
}

@media (max-width: 600px) {
    .navbar {
        flex-direction: column;
        align-items: center;
    }
}


</style>
</head>
<body>

<div class="navbar">
    <a href="home">Home</a>
    <a href="calculator">Calculator</a>
    <a href="login">Login</a>
    <a href="register">Register</a>
</div>


</body>
</html>