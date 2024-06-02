<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <style>
        body {
            margin: 2%;
            overflow: hidden;
            
            
        } 
        #nav {
    overflow: auto;
    padding: 10px 10px;
    width: 100%;
    
}
  
#nav a {
    float: left;
    color: #000000;
    text-align: center;
    padding: 10px 14px;
    width: 70%;
    border-radius: 10px;
    text-decoration: none;
    font-size: 17px;
}

#nav a:hover {
    background-color:  #8AAAE5;
    color: white;
}
#nav a.active {
    background-color: #04AA6D;
    color: white;
}
#nav input {
    float: left;
    color: #000000;
    text-align: center;
    padding: 10px 14px;
    width: 85%;
    border-radius: 10px;
    text-decoration: none;
    font-size: 17px;
    border: none;
    background-color: white;
    
}

#nav input:hover {
    background-color:  #8AAAE5;
    color: white;
}
 #nav input.active {
    background-color: #04AA6D;
    color: white;
}


    </style>
    <style>
body {
 background-image: url("123.jpg");
 background-color: #cccccc;
	height: 100%;

  /* Center and scale the image nicely */
  
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body style="background-color: #FFFFFF">
<form id="nav" >
<a href="Insert.jsp" target="frame3">Insert</a><br>
<a href="Update.jsp" target="frame3">Update</a><br>
<a href="Delete.jsp" target="frame3">Delete</a><br>
<a href="Find.jsp" target="frame3">Find</a>
</form>
<form id="nav" action="MainServlet" method="post">
<input type="submit" formtarget="frame3" value="FindAll" name="Button">
</form>

</body>
</html>