<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>  

<!-- out  -->
<c:out value="${'Welcome to javaTpoint'}"/>
<br>
 
<!-- import --> 


<!-- set -->
<c:set var="Income" scope="session" value="${4000*4}"/>  
<c:out value="${Income}"/>
<br> 

<!--remove  --> 
<c:set var="income" scope="session" value="${4000*4}"/>  
<p>Before Remove Value is: <c:out value="${income}"/></p>  
<c:remove var="income"/>  
<p>After Remove Value is: <c:out value="${income}"/></p>
<br>

<!--catch-->
<c:catch var ="catchtheException">  
   <% int x = 2/0;%>  
</c:catch>  
<c:if test = "${catchtheException != null}">  
   <p>The type of exception is : ${catchtheException} <br />  
   There is an exception: ${catchtheException.message}</p>  
</c:if>  

<!--If  -->
<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}"/>  
   <p>My income is: <c:out value="${income}"/><p>  


<!--Choose,when,otherwise  -->
<c:set var="income" scope="session" value="${4000*4}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  
<br>

<c:set value="10" var="num"></c:set>  
<c:choose>  
<c:when test="${num%2==0}">  
<c:out value="${num} is even number"></c:out>  
</c:when>  
<c:otherwise>  
<c:out value="${num} is odd number"></c:out>  
</c:otherwise>  
</c:choose>  
<br>

<!--forEach  -->
<c:forEach var="j" begin="1" end="3">  
   Item <c:out value="${j}"/><p>  
</c:forEach> 
<br>

<!--forToken-->
<c:forTokens items="Rahul-Nakul-Rajesh" delims="-" var="name">  
   <c:out value="${name}"/><p>  
</c:forTokens>   
<br>

<!--URL  -->
<a href = "<c:url value = "CoreTags.jsp" />">TEST</a>  
 

</body>  
</html>