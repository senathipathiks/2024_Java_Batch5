<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Footer Page</title>
</head>

<style>
.container
{
background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr-5STtTrMV0X6WJjlbqpUgxiEK4UmSWxHcQ&s");
}

button {
  color: white;
  text-decoration: none;
  font-size: 25px;
  border: none;
  background: none;
  font-weight: 600;
  font-family: 'Poppins', sans-serif;
}

button::before {
  margin-left: auto;
}

button::after, button::before {
  content: '';
  width: 0%;
  height: 2px;
  background: #f44336;
  display: block;
  transition: 0.5s;
}

button:hover::after, button:hover::before {
  width: 100%;
}
</style>

<body>
<footer>
<div class = "container">
<button>About Us</button>
<button>Review</button>
<button>Ratings</button>
<button>About Us</button>
<button>About Us</button>
</div>
</footer>
</body>
</html>