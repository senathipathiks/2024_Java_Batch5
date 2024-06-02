<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script>
 
function check(){
var no = document.forms["Insform"]["empid"].value;
var name = document.forms["Insform"]["empname"].value;
var des = document.forms["Insform"]["empdesig"].value;
var dept = document.forms["Insform"]["empdept"].value;
if(no === null ||no === "" || no === " " || name=="" || des==""||dept==""){
	alert("please fill all fields!!!");
	event.preventDefault();
}
 
}
</script>
</head>
<body>
<form action="MainServlet" method="post" name="Insform"  onsubmit="return check();">
<center>
     <h1>Insertion Page</h1><br>
     <table  cellpadding="10px" border="7">
        <tr>
            <td>Employee Id :  </td>
            <td><input type="number" name="empid" ></td>
        </tr>
        <tr>
            <td>Employee Name : </td>
            <td><input type="text" name="empname" ></td>
        </tr>
        <tr>
            <td>Designation :</td>
            <td><input type="text" name="empdesig" > </td>
        </tr>
        <tr>
            <td>Department :</td>
            <td><input type="text" name="empdept" ></td>
        </tr>
     </table><br>
     <input type="submit" value="Insert" name="Button">
   </form>
</center>
</body>
</html>