<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>TMS</title>
<style>
h1,p,td{
color:white
}
body{
background-image: linear-gradient(#200122,#6f0000);
background-repeat:no-repeat;
background-size: cover;
height:440px;
background-attachment: fixed;
}

#b1:hover,#b2:hover,#b3:hover,#b4:hover,#b5:hover{
transform:scale(1.01);
}
@keyframes ani{
	from{
	opacity:0;
	}
	to{
	opacity:1;
	}
}
#cont{
  animation-name: ani;
  animation-duration: 3s;
  animation-timing-function: ease;
  animation-direction: forwards;
  animation-iteration-count: 1;
}
</style>
</head>
<body>
<form action="Insertion" method="post" modelAttribute="bean">
<h1 align="center" class="display-1">Tender Registration Form</h1>
<hr>
<table align="center">
	
	<tr>
		<td>
			Tender ID:
		</td>
		<td>
			<input type="text" disabled name="tid" plcaeholder="Tender ID"  required>
		</td>
	</tr>
	<tr>
		<td>
			Tender Project Name:
		</td>
		<td>
			<input type="text" name="tname" plcaeholder="Tender Project Name" required>
		</td>
	</tr>
	<tr>
		<td>
			Tender City:
		</td>
		<td>
			<input type="text" name="tcity" placeholder="Project City" required>
		</td>
	</tr>
	<tr>
		<td>
			Tender Budget:
		</td>
		<td>
			<input type="text" name="tbudget" placeholder="Tender Budget" required>
		</td>
	</tr>
	<tr>
		<td>
			Tender Description:
		</td>
		<td>
		<textarea rows="2" cols="23" input type="text" name="tdesc" placeholder="Project Description" required></textarea>
			<!-- <input type="textarea" name="tdesc" placeholder="Project Description" required> -->
		</td>
	</tr>
	<tr>
		<td>
			Tender Acquired by:
		</td>
		<td>
			<input type="text" name="towner" placeholder="Tender Acquired by" required>
		</td>
	</tr>
	
	<br>
</table>
<br>
<div class="text-center">
	<input type="submit" class="btn btn-success" name="button" value="Insert">
</div>

</form>
<%
					String result = (String) request.getAttribute("Action");
					
					if(result!=null){
						
					if(result.equals("Success")){
						 out.print("<h3 align=center><font color=green>Inserted Successfully!</font></h3>");
					}
					else{
						 out.print("<h3 align=center><font color=red>Insertion Operation Failed!!!</font></h3></div>");
					}
					
					}
					
					
%>
</body>
</html>