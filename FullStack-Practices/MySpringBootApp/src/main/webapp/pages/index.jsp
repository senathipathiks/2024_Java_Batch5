<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }

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

        .footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
        }

        .content {
            margin: 20px;
            font-size: 18px;
            line-height: 1.6;
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
        <h1>Welcome to the Home Page!</h1>
        <p>This is a simple home page with a navbar and footer.</p>
    </div>

    <div class="footer">
        <h3>Footer</h3>
    </div>
</body>
</html>
