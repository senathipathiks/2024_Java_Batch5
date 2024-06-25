<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find By Id</title>
<style>
<style>
            body{
                background-color: aliceblue;
            }
            h2{
                color:rgba(15,77,134,255);
            }
            table{
                background-color: rgba(15,77,134,255);
                color: aliceblue;
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
            .sid{
            	color:rgba(15,77,134,255);
                font-size:small;
                background-color: aliceblue;
                padding: 5px;
            }
            .button{
            background-color:aliceblue;
            border-color:black;
            border-width: 4px;
            border-radius:10px ;
            color: rgba(15,77,134,255);
            padding: 10px 10px;
            text-align: center;
            text-decoration:none;
            display:inline-block;
            font-size: 15px;
            font-weight: bold;
            }
            ::placeholder{
                color:rgba(15,77,134,255);
                font-size:small;
                background-color: aliceblue;
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
<form action="Fetch1" method="post">
<h2 align="center">Find By ID</h2>

	  <table border="1" align="center">
            <tr>
            	<td>ID:</td>            	
                <td><select name="sid" class="sid">
						<option selected>Select ID</option>
						<c:forEach items="${idList}" var="sid">
							<option value="${sid}">${sid}</option>
						</c:forEach>
					</select>
				</td>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" value="Fetch" ></td>
            </tr>
</table>
</form>
<form >
<h2 id="head1" align="center">Student</h2>
        
 
        <div >
        
            <table>
            
            <tr>
                <th>ID</th>
                <td><input type="number" name="sid" placeholder="ID" value=${Stud.getId() } ></td>
            </tr>
            
            <tr >
                <th>Name : </th>
                <td><input type="text" name="name" placeholder="Name" value=${Stud.getSname() }></td>
            </tr>
            <tr >
                <th>City :  </th>
                <td><input type="text" name="city" placeholder="City" value=${Stud.getScity() }></td>
            </tr>
            
           
          
            
        </table><br>
        
        </div>
 
</form>
 
</center>
</body>
</html>