<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <form action="calc.jsp" method="post">
        <p>
            <input type="number" name="left" placeholder="Enter first number">
            <select name="operation">
                <option value="add">+</option>
                <option value="subtract">-</option>
                <option value="multiply">*</option>
                <option value="divide">/</option>
            </select>
            <input type="number" name="right" placeholder="Enter second number">
            <input type="submit" value="Calculate">
        </p>
    </form>

    <%
        // Handle form submission
        String operation = request.getParameter("operation");
        String leftStr = request.getParameter("left");
        String rightStr = request.getParameter("right");

        int result = 0;

        try {
            int left = Integer.parseInt(leftStr);
            int right = Integer.parseInt(rightStr);

            switch (operation) {
                case "add":
                    result = left + right;
                    break;
                case "subtract":
                    result = left - right;
                    break;
                case "multiply":
                    result = left * right;
                    break;
                case "divide":
                    if (right != 0) {
                        result = left / right;
                    } else {
                        out.println("Cannot divide by zero!");
                    }
                    break;
            }
        } catch (NumberFormatException e) {
            out.println("Invalid input. Please enter valid numeric values.");
        }
    %>

    <p>Result: <%= result %></p>
</body>
</html>

