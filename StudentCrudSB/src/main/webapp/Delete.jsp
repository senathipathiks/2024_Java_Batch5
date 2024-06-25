<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
<style>
            body{
                background-color: aliceblue;
            }
            h2{
                color:rgba(15,77,134,255);
            }
            table{
                background-color: rgba(15,77,134,255);
                color: aliceblue;
                padding: 10px 10px;
                border-radius: 25px;
                font-weight: bold;
                font-size: 15px;
                border-width:10px;
                border-style:double;
                border-color: aliceblue;
            }
            table td{
                padding: 10px 10px;
                border: none;
            }
            .sid{
            	color:rgba(15,77,134,255);
                font-size:small;
                background-color: aliceblue;
                padding: 5px;
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
            ::placeholder{
                color:rgba(15,77,134,255);
                font-size:small;
                background-color: aliceblue;
                padding: 5px;
            }
            input{
                border-radius: 10px;
                padding: 5px 5px;
                border-color:black;
                border-width: 4px;
            }

            .button:hover{
                transform: scale(1.2);
            }
            
        </style>
</head>
<body>

<h2 align="center">Delete Student By ID</h2>
<form action="Deletion" method="get">

<table border="1" align="center">
            <tr>
            	<td>ID:</td>
                <td><select name="sid" class="sid">
						<option selected>Select ID</option>
						<c:forEach items="${IdList}" var="sid">
							<option value="${sid}">${sid}</option>
						</c:forEach>
					</select>
				</td>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="action" id="action" value="Delete" ></td>
            </tr>
</table>
</form>
<center>
<%
String result = (String) request.getAttribute("Action1");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Deletion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Deletion Operation is Failure</font></h3></div>");
}
 
} 
%>
</center>

<h2 align="center">Delete Student By Name</h2>
<form action="DeletionByName" method="get">
<table border="1" align="center">
            <tr>
            	<td>Name:</td>
                <td><select name="sname" class="sname">
						<option selected>Select Name</option>
						<c:forEach items="${NameList}" var="sname">
							<option value="${sname}">${sname}</option>
						</c:forEach>
					</select>
				</td>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="action" id="action" value="Delete" ></td>
            </tr>
</table>
</form>
<center>
<%
String result2 = (String) request.getAttribute("Action2");
 
if(result2!=null){
	
if(result2.equals("Success")){
	 out.print("<h3><font color=green>Deletion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Deletion Operation is Failure</font></h3></div>");
}
 
} 
%>
</center>
</body>
</html>