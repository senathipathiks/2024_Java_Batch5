<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>

<style>
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

<h2 align="center">Insert Product Details</h2>
<form  action="Insertion" method="post" modelAttribute="bean" >
<table border="1" align="center">
            
            <tr>
                <td>Enter Name:</td>
                <td><input type="text" placeholder="Enter Name.." class="in" name="prodName"  required></td>
            </tr>
            <tr>
                <td>Enter Price:</td>
                <td><input type="text" placeholder="Enter Price.." class="in" name="price"  required></td>
            </tr>
            <tr>
                <td>Enter Type:</td>
                <td><input type="text" placeholder="Enter Type.." class="in" name="prodType"  required></td>
            </tr>
            <tr>
                <td>Enter Status:</td>
                <td><input type="text" placeholder="Enter Status.." class="in" name="prodStatus"  required></td>
            </tr>
            <tr>
                <td>Enter Stock Left:</td>
                <td><input type="number" placeholder="Enter Stock Left.." class="in" name="stockLeft"  required></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" name="action" id="action" value="Insert" ></td>
            </tr>
            <tr>
            </tr>
            
</table>
</form>
<%
String result = (String) request.getAttribute("Action");
 
if(result!=null){
	
if(result.equals("Success")){
	 out.print("<h3><font color=green>Insertion Operation is Successfully Done</font></h3>");
}
else{
	 out.print("<h3><font color=red>Insertion Operation is Failure</font></h3></div>");
}
 
} 
%>

</body>
</html>