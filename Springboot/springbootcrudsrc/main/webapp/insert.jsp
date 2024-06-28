<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
           
            .button:hover{
            background: rgb(238,174,202);
background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
            }
            table{
            border-radius : 10px;
            }

        </style>
<script>

function insert(){
var name = document.forms["insertform"]["name"].value;
var rollno = document.forms["insertform"]["rollno"].value;
var marks = document.forms["insertform"]["marks"].value;
if(name === null ||name === ""){
	alert("please fill the name!!!");
	event.preventDefault();
}
if(rollno === null ||rollno === ""){
	alert("please fill the rollno!!!");
	event.preventDefault();
}
if(marks === null ||marks === ""){
	alert("please fill the age!!!");
	event.preventDefault();
}
 
}
</script>
</head>
<body>


<form action="insertion" method="post"  name = "insertform" onsubmit = "return insert();">
<center><h1>Insert Student Result Details</h1></center>
<table align="center" cellpadding = "10px" >
            
            <tr>
                <td>Enter Student Name:</td>
                <td><input type="text"  placeholder="Enter Student Name" name="name" ></td>
            </tr>
            <tr>
                <td>Enter Student Roll No :</td>
                <td><input type="text" placeholder="Enter Student Roll No" name="rollno" ></td>
            </tr>
            <tr>
                <td>Enter Student Marks:</td>
                <td><input type="text" placeholder="Enter Student Marks" name="marks" ></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="ins" value="Insert" ></td>
            </tr>
</table>
</form>
<%
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Insertion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
}
 
}
 
 
%>

</center>
</body>
</html>