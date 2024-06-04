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
            table, input{
            background-color : rgba(208, 238, 242);
            }
           
            .button:hover{
            background-color:rgba(100, 164, 189);
            }
            table{
            border-radius : 10px;
            }

        </style>
<script>

function insert(){
var no = document.forms["insertform"]["id"].value;
var name = document.forms["insertform"]["name"].value;
var desig = document.forms["insertform"]["desig"].value;
var dept = document.forms["insertform"]["dept"].value;
if(no === null ||no === ""){
	alert("please fill the id!!!");
	event.preventDefault();
}
if(name === null ||name === ""){
	alert("please fill the name!!!");
	event.preventDefault();
}
if(desig === null ||desig === ""){
	alert("please fill the designation!!!");
	event.preventDefault();
}
if(dept === null ||dept === ""){
	alert("please fill the department!!!");
	event.preventDefault();
}
 
}
</script>
</head>
<body>

<form action="Controller" method="post" name = "insertform" onsubmit = "return insert();">
<center><h1>Insert Employee Details</h1></center>
<table align="center" cellpadding = "10px" >
            <tr>
                <td>Enter Employee ID:</td>
                <td><input type="number" placeholder="Enter ID.." name="id" ></td>
            </tr><br>
            <tr>
                <td>Enter Employee Name:</td>
                <td><input type="text" placeholder="Enter Emp Name.." name="name" ></td>
            </tr>
            <tr>
                <td>Enter Employee Desig:</td>
                <td><input type="text" placeholder="Enter Emp Desig.." name="desig" ></td>
            </tr>
            <tr>
                <td>Enter Employee Dept:</td>
                <td><input type="text" placeholder="Enter Emp Dept.." name="dept" ></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="ins" value="Insert" ></td>
            </tr>
</table>
</form>

</body>
</html>