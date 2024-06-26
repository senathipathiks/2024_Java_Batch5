<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style>
body {
  --s: 25vmin;
  --p: calc(var(--s) / 2);
  --c1: pink;
  --c2: dodgerblue;
  --c3: white;
  --bg: var(--c3);
  --d: 4000ms;
  --e: cubic-bezier(0.76, 0, 0.24, 1);
  
  background-color: var(--bg);
  background-image:
    linear-gradient(45deg, var(--c1) 25%, transparent 25%),
    linear-gradient(-45deg, var(--c1) 25%, transparent 25%),
    linear-gradient(45deg, transparent 75%, var(--c2) 75%),
    linear-gradient(-45deg, transparent 75%, var(--c2) 75%);
  background-size: var(--s) var(--s);
  background-position: 
    calc(var(--p) *  1) calc(var(--p) *  0), 
    calc(var(--p) * -1) calc(var(--p) *  1), 
    calc(var(--p) *  1) calc(var(--p) * -1), 
    calc(var(--p) * -1) calc(var(--p) *  0);
  animation: 
    color var(--d) var(--e) infinite,
    position var(--d) var(--e) infinite;
}

@keyframes color {
  0%, 25% {
    --bg: var(--c3);
  }
  26%, 50% {
    --bg: var(--c1);
  }
  51%, 75% {
    --bg: var(--c3);
  }
  76%, 100% {
    --bg: var(--c2);
  }
}

@keyframes position {
  0% {
    background-position: 
      calc(var(--p) *  1) calc(var(--p) *  0), 
      calc(var(--p) * -1) calc(var(--p) *  1), 
      calc(var(--p) *  1) calc(var(--p) * -1), 
      calc(var(--p) * -1) calc(var(--p) *  0);
  }
  25% {
    background-position: 
      calc(var(--p) *  1) calc(var(--p) *  4), 
      calc(var(--p) * -1) calc(var(--p) *  5), 
      calc(var(--p) *  1) calc(var(--p) *  3), 
      calc(var(--p) * -1) calc(var(--p) *  4);
  }
  50% {
    background-position: 
      calc(var(--p) *  3) calc(var(--p) * 8), 
      calc(var(--p) * -3) calc(var(--p) * 9), 
      calc(var(--p) *  2) calc(var(--p) * 7), 
      calc(var(--p) * -2) calc(var(--p) * 8);
  }
  75% {
    background-position: 
      calc(var(--p) *  3) calc(var(--p) * 12), 
      calc(var(--p) * -3) calc(var(--p) * 13), 
      calc(var(--p) *  2) calc(var(--p) * 11), 
      calc(var(--p) * -2) calc(var(--p) * 12);
  }
  100% {    
    background-position: 
      calc(var(--p) *  5) calc(var(--p) * 16), 
      calc(var(--p) * -5) calc(var(--p) * 17), 
      calc(var(--p) *  5) calc(var(--p) * 15), 
      calc(var(--p) * -5) calc(var(--p) * 16);
  }
}

@media (prefers-reduced-motion) {
  body {
    animation: none;
  }
}

#content{
background-color: transparent;
backdrop-filter:blur(5px);
}
</style>
</head>
<body>
<div>
	<form align="center" id="accesspanel" method="post" modelAttribute="bean" action="LoginValidate">
		<div class="container">
			<div class="box">
				<h1>Login</h1>
				<div class="user">
					<i class="fas fa-user"></i>
					<input type="text" name="name" id="username" placeholder="Full Name" >
					<i class="fas fa-envelope"></i>
					<input type="password" name="password" id="email" placeholder="Password" value>
				</div> <br>
				<div class="login-btn">
					<button class="btn btn-success">
						Login
					</button>
				</div>
			</div>
		</div>
	</form>

	<%
	String result = (String) request.getAttribute("Action");
 
	if (result != null) {
		if (result.equals("Success")) {
			out.print("<h3><font color=green>Login Successfully</font></h3>");
		} else {
			out.print("<h3><font color=red>Login Failed</font></h3></div>");
		}
	}
	%>
		</div>
</body>
</html>