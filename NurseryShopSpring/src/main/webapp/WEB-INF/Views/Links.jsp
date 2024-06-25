<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
            
           body{
 			background-image: url('https://i.pinimg.com/736x/cf/99/58/cf9958e13bb6673a9191049b8767ad32.jpg'); 
/*   			background-color: rgba(15,77,134,255);
 */  			background-repeat: no-repeat;
  			background-size: 220px 600px;
  			color: rgba(241,254,224,255);
  			
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
			h3{
			   color:rgba(46,90,3,255);
;
			
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