<%@page import="com.gana.SpringBootCrud.model.Student"%>
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
<center>
<h1>Find Result Details</h1>
<div class="background-wrap">
	  <div class="background"></div>
	</div>
	
	<form action="Searching" method="post">
		<br>
		ID :<select name="id">
			<option selected>Select ID</option>
			<c:forEach items="${IdList}" var="id">
				<option value="${id}">${id}</option>
			</c:forEach>
		</select> <br><br>
		<input type="Submit" value="Find" class="button">
		</center>
	</form>
	
	<center><%
	String result = (String) request.getAttribute("Action");
	Student student = (Student) request.getAttribute("Stud");

	if (result != null) {

		if (result.equals("Success")) {
			out.print("<h3>Id: <font color=green>"
					+ student.getId()
					+"</font></h3><br><h3>Name: <font color=green>"
					+ student.getName()
					+"</font></h3><br><h3>Roll No: <font color=green>"
					+ student.getRollno()
					+"</font></h3><br><h3>Marks: <font color=green>"
					+ student.getMarks()
					+"</font></h3>");
		} else {
			out.print("<h3><font color=red>Find Operation is Failure</font></h3>");
		}
	}
	%></center>
	
	
</body>
</html>