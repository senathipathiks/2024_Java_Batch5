<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ToggleHandler.jsp">
<center>
<h1>Toggle Image Application</h1>
<input type="button" onclick="handle()" id="btn" value="Toggle"> <br>
<div>
<br>

</div>
</center>
</form>

<script>
function handle(){
	
	var img1 = "https://w0.peakpx.com/wallpaper/908/670/HD-wallpaper-dhoni-sports-uniform-cricket-ms-dhoni-mahendra-singh-dhoni-thumbnail.jpg";
	var img2 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7-k254imJ_vmkiMjVctPEQ_RmaMdG-d0k3x-K2TjUJA&s";
	var btn = document.getElementById("btn");
	
	if(btn.clicked){
		document.write(img1);
	}
	else{
		document.write(img2);
	}
		
	}
}
</script>
</body>
</html>