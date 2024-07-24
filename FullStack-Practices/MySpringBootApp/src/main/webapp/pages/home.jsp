<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="Navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(-45deg, #23a6d5, #23d5ab, #23a6d5, #23d5ab);
            background-size: 400% 400%;
            animation: gradient 15s ease infinite;
        }

        .navbar {
            display: flex;
            justify-content: space-around;
            background-color: #333;
            padding: 10px 0;
            position: fixed;
            top: 0;
            width: 100%;
            z-index: 1;
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

        .content {
            text-align: center;
            color: white;
            font-size: 2em;
            margin-top: 60px;
        }

        @keyframes gradient {
            0% {
                background-position: 0% 50%;
            }
            50% {
                background-position: 100% 50%;
            }
            100% {
                background-position: 0% 50%;
            }
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

    <div class="content">
        <h1>Welcome to the Landing Page!</h1>
        <p>You have successfully logged in/registered.</p>
    </div>
</body>
</html>
