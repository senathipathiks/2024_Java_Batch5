<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! int x=2 , y =3;

int add(int x, int y ){
return x+y;
}

int sub(int x, int y ){
return x-y;
}
int mul(int x, int y ){
return x*y;
}
int div(int x, int y ){
return x/y;
}
%>

<%= "add of "+x+"+"+y+"="+add(x,y)%>
<%= "add of "+x+"-"+y+"="+sub(x,y)%>
<%= "add of "+x+"*"+y+"="+mul(x,y)%>
<%= "add of "+x+"/"+y+"="+div(x,y)%>
    
</body>
</html>