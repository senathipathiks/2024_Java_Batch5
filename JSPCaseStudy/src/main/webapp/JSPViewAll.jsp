<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Records</title>
<style>
			body{
                background-color: aliceblue;
            }
            
            .button{
            background-color:aliceblue;
            border-color:black;
            border-width: 4px;
            border-radius:10px ;
            color: rgba(15,77,134,255);
            padding: 10px 10px;
            text-align: center;
            text-decoration:none;
            display:inline-block;
            font-size: 15px;
            font-weight: bold;
            }
            
            
            .button:hover{
                transform: scale(1.2);
            }
            
</style>

</head>
<body>
<form action = "Controller" method="get" >
<input type="submit" class="button" name="action" value="View"><br><br>
</form>

</body>
</html>