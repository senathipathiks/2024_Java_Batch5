<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All</title>
<style>
.prodID{
            	color:rgba(126,191,71,255);
                font-size:small;
                background-color: rgba(241,254,224,255);
                padding: 5px;
            }
            body{
/*              	   background-image: url('https://ae01.alicdn.com/kf/S7c27d1befbbe4a9a9b90570dbe3afae6Q.jpg_640x640Q90.jpg_.webp'); 
 */            	   background-repeat: no-repeat;
  				   background-size: cover;
                 background-color: rgba(241,254,224,255);
             }
            h2{
                color:rgba(126,191,71,255);
            }
            table{
                background-color:rgba(126,191,71,255);
                color: rgba(241,254,224,255);
                padding: 10px 10px;
                border-radius: 25px;
                font-weight: bold;
                font-size: 15px;
                border-width:10px;
                border-style:double;
                border-color: aliceblue;
            }
            table td{
                padding: 10px 10px;
                border: none;
            }
            .button{
            background-color:rgba(241,254,224,255);
            border-color:black;
            border-width: 4px;
            border-radius:10px ;
            color: rgba(126,191,71,255);
            padding: 10px 10px;
            text-align: center;
            text-decoration:none;
            display:inline-block;
            font-size: 15px;
            font-weight: bold;
            }
            ::placeholder{
                color:rgba(126,191,71,255);
                font-size:small;
                background-color:rgba(241,254,224,255);
                padding: 5px;
            }
            input{
                border-radius: 10px;
                padding: 5px 5px;
                border-color:black;
                border-width: 4px;
            }

            .button:hover{
                transform: scale(1.2);
            }
            
                        
        </style>
</head>
<body>

<h2 align="center">Product Details</h2>

<form>
<table border="1" align="center">
            <tr>
            	<th>Product ID</th>
            	<th>Product Name</th>
            	<th>Price</th>
            	<th>Product Type</th>
            	<th>Product Status</th>
            	<th>Stock Left</th>
           	</tr>
           	
           	<c:forEach items="${prodList}" var="prod">
           	<tr>
           		<td>${prod.getProdID() }</td>
           		<td>${prod.getProdName() }</td>
           		<td>${prod.getPrice() }</td>
           		<td>${prod.getProdType() }</td>           		
           		<td>${prod.getProdStatus() }</td>           		
                <td>${prod.getStockLeft() }</td>           		
           		           		
			</tr>
			</c:forEach>
			
</table>
</form>

</body>
</html>