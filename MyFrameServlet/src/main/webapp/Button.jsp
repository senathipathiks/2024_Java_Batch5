<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<h3 align="center"><label for="dashboard">Dashboard</label></h3>
<meta charset="ISO-8859-1">
<style>
            
            body{
                background-color:rgba(224,45,84,255);
                color: aliceblue;
            }
            .button{
            background-color:aliceblue;
            border-color:black;
            border-width: 4px;
            border-radius:10px ;
            color: rgba(224,45,84,255);
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
        
        <div class="dropdown-options">
          <center><a href="Insert.jsp" target="frame3"><input type="button" class="button" name="b1" value="Insert"></a><br><br></center>
          <center><a href="Delete.jsp" target="frame3"><input type="button" class="button" name="b2" value="Delete"></a><br><br></center>
          <center><a href="Update.jsp" target="frame3"><input type="button" class="button" name="b3" value="Update"></a><br><br></center>
          <center><a href="Find.jsp" target="frame3"><input type="button" class="button" name="b4" value="Find"></a><br><br></center>
          <center><a href="ViewAll.jsp" target="frame3"><input type="button" class="button" name="b5" value="ViewAll"></a><br><br></center>           
        </div>
      </div>
</body>
</html>