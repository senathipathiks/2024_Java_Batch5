<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<script>
        function validate() {
            var aid = document.forms["alumniForm"]["aid"].value;
            var aname = document.forms["alumniForm"]["aname"].value;
            var adept = document.forms["alumniForm"]["adept"].value;
            var abatch = document.forms["alumniForm"]["abatch"].value;
 
            if (aid === "" || aname === "" || adept === "" || abatch === "") {
                alert("Please fill in all required fields.");
                return false;
            }
        }   
</script>


<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
			body{
                background-color: aliceblue;
            }
           
            h2{
                color:rgba(15,77,134,255);
            }
            table{
                background-color:pink;
                color: aliceblue;
                padding: 10px 10px;
                border-radius: 25px;
                font-weight: bold;
                font-size: 15px;
                border-width:10px;
                
                border-color: white;
                margin-top:-10px;
                margin-left:10px;
                
            }
            table td{
                padding: 10px 10px;
                border-radius:2px;
                border-width:3px;
                border-color: white;
            }
            
            body{
			background-image: url("https://th.bing.com/th/id/OIP.0CxHyuHGnwlkm_199tl1XAHaFY?rs=1&pid=ImgDetMain");
			
			
			background-repeat: no-repeat;
  			background-size: 1200px 600px;
  			color: aliceblue;
  			
  			
        	}
        	
</style>
</head>
<body>
<center>
<form action="Insertion" method="post" modelAttribute="bean">
<table>

<center><h1>Enter the Insertion Details<h1>
<tr>
<center><td><h2>Enter Name  : <input type="text" name="aname" class="in" required><br></td></tr></h2>
<tr>


<td><h2>Enter Batch : <input type="text" name="abatch" class ="in" required></td><br><br></tr></h2>

<td><h2>Enter Dept: <input type="text" name="adept" class ="in" required></td><br><br></tr></h2>

<td><h2><center><input type="Submit" value="Insert" name="button"></td></center></h2>
</form>
</center>
</table>

<%
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=yellow>Insertion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
}
 
}

%>
</body>
</html>