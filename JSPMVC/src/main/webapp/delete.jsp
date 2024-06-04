<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
            
            body{
                background-color:rgba(100, 164, 189);
                
            }
            table,input{
            background-color : rgba(208, 238, 242);
            }
            .button:hover{
            background-color:rgba(100, 164, 189);
            }
            table{
            border-radius : 10px;
            }

        </style>

</head>
<body>

<form action = "Controller" method = "post">
<center>
<h1>Delete Employee Details</h1><br>
<table  align="center" cellpadding = "10px" >
            <tr>
                <td>Enter Employee ID:</td>
                <td><input type="number" placeholder="Enter ID.." name="id" required></td>
            </tr>
            <tr>
            <td colspan="2" align="center"><input type="submit" class="button" name="del" value="Delete" ><br></td>
            </tr>
            </table>
</center>
</form>



</body>
</html>