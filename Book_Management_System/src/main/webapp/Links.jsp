<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Links</title>

<style>


*{

background: rgb(34,193,195);
background: linear-gradient(0deg, rgba(34,193,195,1) 0%, rgba(253,187,45,1) 100%);
background-attachment: fixed;
background-repeat: no-repeat;
}

}
button {
  width: 35px;
  height: 35px;
background: rgb(34,193,195);
  animation-name: example;
  animation-duration: 4s;
}

@keyframes example {
  0%   {background-color: red;}
  25%  {background-color: yellow;}
  50%  {background-color: blue;}
  100% {background-color: green;}
}
</style>
</head>
<body>
	<a href="insert.jsp" target="f3"><button>Insert</button></a>
	<br>
	<br>
	<a href="delete.jsp" target="f3"><button>Delete</button></a>
	<br>
	<br>
	<a href="update.jsp" target="f3"><button>Update</button></a>
	<br>
	<br>
	<a href="find.jsp" target="f3">
		<button>Find</button>
	</a>
	<br>
	<br>
	<a href="View.jsp" target="f3"><button>View All</button></a>

</body>
</html>