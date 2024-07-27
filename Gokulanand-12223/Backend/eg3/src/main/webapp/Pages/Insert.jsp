<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
</head>

<style>
form
{
margin-left: 30px;
margin-top: 150px;

}
.custom-input {
max-width: 190px;
background-color: #121212;
border: 0px solid;
box-shadow: 1px 1px 1px 1px rgb(131, 133, 129),
-1px -1px 1px 1px rgb(100, 100, 100);
border-radius: 4px;
padding: 10px;
color: whitesmoke;
caret-color: white;
outline: none;
font-size: 16px;
transition: background-color 0.3s ease;
}
.custom-input:focus {
background-color: #222;
border: 1.5px solid rgb(189, 189, 189);
}
.custom-input:hover {
box-shadow: 1px 1px 1px 1px rgb(149, 151, 147),
-1px -1px 1px 1px rgb(124, 124, 124);
}
.custom-input:hover::placeholder {
color: #999999;
}
.custom-input::placeholder {
color: #727272;
}
.button {
text-decoration: none;
position: relative;
border: none;
font-size: 14px;
font-family: sans-serif;
cursor: pointer;
color: #fff;
width: 9em;
height: 3em;
line-height: 2em;
text-align: center;
background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, 
#03a9f4);
background-size: 300%;
border-radius: 30px;
z-index: 1;
}
.button:hover {
animation: ani 8s linear infinite;
border: none;
}
@keyframes ani {
0% {
background-position: 0%;
}
100% {
background-position: 400%;
}
}
.button:before {
content: "";
position: absolute;
top: -5px;
left: -5px;
right: -5px;
bottom: -5px;
z-index: -1;
background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, 
#03a9f4);
background-size: 400%;
border-radius: 35px;
transition: 1s;
}
.button:hover::before {
filter: blur(20px);
}
.button:active {
background: linear-gradient(32deg, #03a9f4, #f441a5, #ffeb3b, 
#03a9f4);
}
</style>

<body>
<form align = "center" action = "Insertion" method = "post"
modelAttribute = "bean">
<h3 style="font-family: sans-serif;">Student Name</h3>
<input placeholder="eg: kunjan" type="text" name="name"
class="custom-input" />
<h3 style="font-family: sans-serif;">Student City</h3>
<input placeholder="eg: periyapoolaambatti" type="text" name="city"
class="custom-input" />
<br>
<br>
<input type="submit" class="button" value="Insert" name="button">
</form>
<%
String result = (String)request.getAttribute("Action");
if(result!=null)
{
if(result.equals("Success"))
{
out.print("<h3 align=center style=font-family: sans-serif><font color = green> Record Inserted Successfully </font> </h3>");
}
else
{
out.print("<h3 align=center style=font-family: sans-serif><font color = red> Insertion Failed...Retry... </font> </h3>");
}
}
%>
</body>
</html>