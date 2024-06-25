<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find By Name</title>
<style>
            .prodName{
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
<center>
<form action="Fetch2" method="post">
<h2 align="center">Find By Name</h2>

	  <table border="1" align="center">
            <tr>
            	<td>Name:</td>            	
                <td><select name="prodName" class="prodName">
						<option selected>Select Name</option>
						<c:forEach items="${nameList}" var="prodName">
							<option value="${prodName}">${prodName}</option>
						</c:forEach>
					</select>
				</td>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" value="Fetch" ></td>
            </tr>
</table>
</form>
<form >
<h2 id="head1" align="center">Product</h2>
        
 
        <div >
        
            <table>
            
            <tr>
                <th>ID</th>
                <td><input type="number" name="prodID" placeholder="ID" value=${Prod.getProdID() } ></td>
            </tr>
            
            <tr >
                <th>Name : </th>
                <td><input type="text" name="prodName" placeholder="Name" value=${Prod.getProdName() }></td>
            </tr>
            <tr>
                <th>Price : </th>
                <td><input type="text" name="price" placeholder="Price" value=${Prod.getPrice() } ></td>
            </tr>
            <tr>
                <th>Type : </th>
                <td><input type="text" name="prodType" placeholder="Type" value=${Prod.getProdType() } ></td>
            </tr>
            <tr>
                <th>Status : </th>
                <td><input type="text" name="prodStatus" placeholder="Status" value=${Prod.getProdStatus() } ></td>
            </tr>
            <tr >
                <th>Stock Left :  </th>
                <td><input type="number" name="stockLeft" placeholder="Stock Left" value=${Prod.getStockLeft() }></td>
            </tr>
            
           
          
            
        </table><br>
        
        </div>
 
</form>
 
</center>
</body>
</html>