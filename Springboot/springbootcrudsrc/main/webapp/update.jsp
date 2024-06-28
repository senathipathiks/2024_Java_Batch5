<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
            
            body{
                background: rgb(238,174,202);
background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
                
            }
            table, input{
            background-color : rgba(208, 238, 242);
            }
           
            .button:hover{
            background: rgb(238,174,202);
background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
            }
            table{
            border-radius : 10px;
            }
            table{
            text-decoration: none;
  position: relative;
  border: none;
  font-size: 14px;
  font-family: inherit;
  cursor: pointer;
  color: #fff;
  width: 44em;
  height: 3em;
  line-height: 2em;
  text-align: center;
  background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
  background-size: 470%;
  border-radius: 30px;
  z-index: 1;
            }
            form{
            text-decoration: none;
  position: relative;
  border: none;
  font-size: 14px;
  font-family: inherit;
  cursor: pointer;
  color: #fff;
  width: 44em;
  height: 13em;
  line-height: 2em;
  text-align: center;
  background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
  background-size: 470%;
  border-radius: 30px;
  z-index: 1;
            }

        </style>
</head>
<body>
<center><h1>Update Student Result by ID</h1>
<form action="fetch" method="post">

ID               :
<select name="id">
	   <option selected>Select ID </option>
	   <c:forEach items="${IdList}" var="id" >
      <option value="${id}">${id}</option>
      </c:forEach>
      </select>
	  
	  <br><br><input type="Submit" value="fetch" class="button">
</form>
<center><h1>Update Student Result Details</h1></center>
<form action = "updation" method = "post" modelAttribue = "bean">

<table align="center" cellpadding = "10px" >
            <tr>
                
                <td><input type="hidden" placeholder="Enter Student ID" name="id" value = ${stud.getId()} ></td>
            </tr><br>
            <tr>
                <td>Enter Student Name:</td>
                <td><input type="text" placeholder="Enter Student Name" name="name" value = ${stud.getName()}></td>
            </tr>
            <tr>
                <td>Enter Student Roll No :</td>
                <td><input type="text" placeholder="Enter Student Roll No" name="rollno" value = ${stud.getRollno()}></td>
            </tr>
            <tr>
                <td>Enter Student Marks :</td>
                <td><input type="text" placeholder="Enter Student Marks" name="marks" value = ${stud.getMarks()}></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="upd" value="Update" ></td>
            </tr>
</table>
</form>
<%
 
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Updation Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Updation Operation is Failure</font></h3>");
}
 
}
%>
 
</center>
</body>
</html>