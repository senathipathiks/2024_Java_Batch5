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
            }
            table td{
                padding: 10px 10px;
                border-radius:2px;
                border-width:3px;
                border-color: white;
            }
</style>
<script>
        function validate() {
            var tid = document.forms["traineeForm"]["id"].value;
            if (tid === "") {
                alert("Please enter the id");
                return false;
            }
        }
        </script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="TMSMain" method="get" name="traineeForm" onsubmit="return validate();">
<center><h1>Enter the Id to delete<h1><br>
Enter Traineeid : <input type="text" name="tid"> <br>
<input type="submit" value="Delete" name="del"></center>

</form>

</body>
</html>