<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<center>



<%--<%!

int add(int x,int y){
	
	return x+y;
	
}

int sub(int x,int y){
	
	return x-y;
	
}

int mul(int x,int y){
	
	return x*y;
	
}

int div(int x,int y){
	
	return x/y;
	
}

%>

<%= "The Addition of 10 and 20: "+add(10, 20)+"<br><br>"+ "The Subtraction of 10 and 20: "+sub(10, 20)+"<br><br>"+ "The Multiplication of 10 and 20: "+mul(10, 20)+"<br><br>"+ "The Division of 10 and 20: "+div(10, 20)%>
--%>
<form action="Controller.jsp">
        <table cellpadding="10" cellspacing="10">
                
            <tr>
                <td>Num1</td>
                <td><input type="text" name="num1" ></td>
            </tr>
            <tr>
                <td>Num2</td>
                <td><input type="text" name="num2" ></td>
            </tr>
             <tr>
                <td><input type="submit" name="op" value="add"> </td>
                <td><input type="submit" name="op" value="sub"> </td>
                <td><input type="submit" name="op" value="mul"> </td>
                <td><input type="submit" name="op" value="div"> </td>
                
            </tr>  
        </table>
    </form>

</center>
</body>
</html>