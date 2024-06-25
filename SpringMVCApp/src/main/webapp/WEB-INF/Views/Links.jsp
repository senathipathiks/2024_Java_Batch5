<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
            
           body{
 			background-image: url('https://i.pinimg.com/originals/11/6f/46/116f4690f8080723277600b7ca38d1d4.jpg'); 
/*   			background-color: rgba(15,77,134,255);
 */  			background-repeat: no-repeat;
  			background-size: 220px 600px;
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

</style>
</head>
<body>

<div class="dropdown">
        <h3 align="center"><label for="dashboard">Menu</label></h3>
        
        <div class="dropdown-options">
          <center><a href="Insert" target="frame3"><input type="button" class="button" name="b1" value="Insert"></a><br><br></center>
          <center><a href="Delete" target="frame3"><input type="button" class="button" name="b2" value="Delete"></a><br><br></center>
          <center><a href="Update" target="frame3"><input type="button" class="button" name="b3" value="Update"></a><br><br></center>
          <center><a href="ViewAll" target="frame3"><input type="button" class="button" name="b4" value="ViewAll"></a><br><br></center>
          <center><a href="FindById" target="frame3"><input type="button" class="button" name="b4" value="FindById"></a><br><br></center>
          <center><a href="FindByName" target="frame3"><input type="button" class="button" name="b4" value="FindByName"></a><br><br></center>
          
        </div>
      </div>
</body>
</html>