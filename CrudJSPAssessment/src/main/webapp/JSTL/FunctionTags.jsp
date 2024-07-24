<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Contains -->
<c:set var="String" value="Welcome to javatpoint"/>    
<c:if test="${fn:contains(String, 'javatpoint')}">  
   <p>Found javatpoint string<p>  
</c:if>  
  
<c:if test="${fn:contains(String, 'JAVATPOINT')}">  
   <p>Found JAVATPOINT string<p>  
</c:if>  


<!--Ignorecase-->
<c:if test="${fn:containsIgnoreCase(String, 'JAVATPOINT')}">  
   <p>Found string with ignorecase<p>  
</c:if> 

<!--Ends with-->
<c:if test="${fn:endsWith(String, 'javatpoint')}">  
   <p>String ends with programming<p>  
</c:if>  
  
<c:if test="${fn:endsWith(String, 'JSP')}">  
   <p>String ends with JSP<p>  
</c:if>  

<!--Escape XML  -->
<c:set var="string1" value="It is first String."/>  
<c:set var="string2" value="It is <xyz>second String.</xyz>"/>  
  
<p>With escapeXml() Function:</p>  
<p>string-1 : ${fn:escapeXml(string1)}</p>  
<p>string-2 : ${fn:escapeXml(string2)}</p>  
  
<p>Without escapeXml() Function:</p>  
<p>string-1 : ${string1}</p>  
<p>string-2 : ${string2}</p>  

<!--indexOf-->
<p>Index-1 : ${fn:indexOf(string1, "first")}</p>  
<p>Index-2 : ${fn:indexOf(string2, "second")}</p>  

<!-- Trim -->
<c:set var="str1" value="Welcome to JSP        programming         "/>  
<p>String-1 Length is : ${fn:length(str1)}</p>  
  
<c:set var="str2" value="${fn:trim(str1)}" />  
<p>String-2 Length is : ${fn:length(str2)}</p>  
<p>Final value of string is : ${str2}</p>  

<!-- Replace -->
<c:set var="author" value="Ramesh Kumar"/>  
<c:set var="string" value="pqr xyz abc PQR"/>  
${fn:replace(author, "Ramesh", "Suresh")}  
${fn:replace(string, "pqr", "hello")}  
</body>
</html>