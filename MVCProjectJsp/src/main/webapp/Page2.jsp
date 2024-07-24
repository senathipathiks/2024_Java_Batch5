<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>
            

            
           body{
			background-image: url("mag.jpg");
			
			
			background-repeat: no-repeat;
  			background-size: 300px 600px;
  			color: aliceblue;
  			
  			
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

 
a{
    text-decoration: none;
}
        
 
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

        <center><button ><a href="Insert.jsp" target="frame3">Insert</a></button></center><br><br>
        <center><button><a href="Update.jsp" target="frame3">Update</a></button></center><br><br>
        <center><button><a href="Delete.jsp" target="frame3">Delete</a></button></center><br><br>
        <center><button><a href="Findbyid.jsp" target="frame3">FindByID</a></button></center><br><br>
        
</body>
</html>