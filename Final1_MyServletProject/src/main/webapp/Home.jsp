<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>

.topview{

background: rgb(34,193,195);
background: linear-gradient(0deg, rgba(34,193,195,1) 0%, rgba(253,187,45,1) 100%);}

<style>
div {
  width: 100px;
  height: 100px;
  background-color: red;
  animation-name: example;
  animation-duration: 4s;
}

@keyframes example {
  0%   {background-color: red;}
  25%  {background-color: yellow;}
  50%  {background-color: blue;}
  100% {background-color: green;}
}
</style>
</style>
 <frameset rows="20%,80%">
            <frame src="Banner.jsp" class="topview" name="f1"></frame>
            <frameset cols="20%,80%">
                <frame src="Links.jsp" name="f2"></frame>
                <frame src="Display.jsp" name="f3"></frame>
            </frameset>
        </frameset>
</head>
<body>

</body>
</html>