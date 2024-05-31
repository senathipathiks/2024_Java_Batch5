<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>


    <form name="f1" method="post" action="Factorial.jsp">
        Enter a Number: <input type="text" name="n"/><br/>
        <input type="submit" value="Find Factorial"/>
    </form>
    <%!
        int findFactorial(int n) {
            if (n == 0)
                return 1;
            return n * findFactorial(n - 1);
        }
    %>
    <% 
        String input = request.getParameter("n");
        if (input != null) {
            int number = Integer.parseInt(input);
            int factorial = findFactorial(number);
            out.println("<br/>Factorial = " + factorial);
        }
    %>



</body>
</html>