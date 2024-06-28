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
<script>
function delete(){
var no = document.forms["deleteform"]["id"].value;
if(no === null ||no === ""){
	alert("please fill the id!!!");
	event.preventDefault();
}
</script>
</head>
<body>
<center><h1>Delete Student Result by ID</h1>
<form action="deletion" method="post" name = "deleteform" onsubmit = "return delete();">
<br>
ID               :
<select name="id">
	   <option selected>Select ID </option>
	   <c:forEach items="${IdList}" var="id" >
      <option value="${id}">${id}</option>
      </c:forEach>
      </select>
	  
	  <br><br><input type="Submit" value="delete" class="button">
</form>
<%
 
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Deletion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Deletion Operation is Failure</font></h3>");
}
 
}
%>
 
</center>
</body>
</html>