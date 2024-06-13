<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
    <style>
        body {
            margin: 0%;
            background-color:gainsboro;
        } 
        #nav {
    background-color:gainsboro;
    overflow: auto;
    padding: 10px 10px;
    width: 85%;
    height: 650px;
}
  
#nav a {
    float: left;
    color: #000000;
    text-align: center;
    padding: 10px 14px;
    width: 85%;
    border-radius: 10px;
    text-decoration: none;
    font-size: 17px;
}

#nav a:hover {
    background-color: rgb(173, 235, 228);
    color: rgb(216, 81, 77);
}
  

#nav a.active {
    background-color: #04AA6D;
    color: white;
}
    </style>
</head>
<body>
	 <div id="nav">
            <a href="Insert" target="frame3" >Insert</a><br>
            <a href="Delete" target="frame3" >Delete</a><br>
            <a href="Update" target="frame3" >Update</a><br>
            <a href="ViewAll" target="frame3" >Display</a><br>

        </div>
</body>
</html>