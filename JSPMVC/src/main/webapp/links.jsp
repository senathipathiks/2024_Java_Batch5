<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<h3 align="center"><label for="dashboard">Dashboard</label></h3>	
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
            
            body{
                background-color:rgba(100, 164, 189);
                
            }
            button{
            background-color:rgba(208, 238, 242);
            border-color:black;
            
            border-radius:10px ;
            color: black;
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
<center>
<div class = "new">
            <a href="insert.jsp" target = "frame3"><button>Insert</button></a><br><br><br><br>
            <a href="delete.jsp" target = "frame3"><button>Delete</button></a><br><br><br><br>
            <a href="update.jsp" target = "frame3"><button>Update</button></a></button><br><br><br><br>
            <a href="find.jsp" target = "frame3"><button>Find</button></a></button><br><br><br><br>
            <a href="viewall.jsp" target = "frame3"><button>Viewall</button></a></button><br><br><br><br>
        </div>
        </center>
</body>
</html>