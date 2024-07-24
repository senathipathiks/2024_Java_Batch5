<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
			body{
                background-color: aliceblue;
            }
           
            h2{
                color:rgba(15,77,134,255);
            }
            table{
                background-color:rgba(15,77,134,255);
                color: aliceblue;
                padding: 10px 10px;
                border-radius: 25px;
                font-weight: bold;
                font-size: 15px;
                border-width:10px;
                border-style:double;
                border-color: white;
                margin-left:300px;
            }
            
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="LMSMain" method="get" >
<table>
<center><h1>Find By ID<h1><br>
<td>Enter traineeid : <input type="text" name="id"></td> <br>
<td><input type="submit" value="FindByID" name="find"></td>
<td><input type="submit" value="View" name="vw"></center></td>
</form>
</table>
</body>
</html>