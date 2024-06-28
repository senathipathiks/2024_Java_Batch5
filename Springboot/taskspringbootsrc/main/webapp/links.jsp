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
                background: rgb(238,174,202);
background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
                
            }
            button {
  text-decoration: none;
  position: relative;
  border: none;
  font-size: 14px;
  font-family: inherit;
  cursor: pointer;
  color: #fff;
  width: 9em;
  height: 3em;
  line-height: 2em;
  text-align: center;
  background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
  background-size: 300%;
  border-radius: 30px;
  z-index: 1;
}

button:hover {
  animation: ani 8s linear infinite;
  border: none;
}

@keyframes ani {
  0% {
    background-position: 0%;
  }

  100% {
    background-position: 400%;
  }
}

button:before {
  content: "";
  position: absolute;
  top: -5px;
  left: -5px;
  right: -5px;
  bottom: -5px;
  z-index: -1;
  background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
  background-size: 400%;
  border-radius: 35px;
  transition: 1s;
}

button:hover::before {
  filter: blur(20px);
}

button:active {
  background: linear-gradient(32deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
}

        </style>
</head>
<body>
<center>
<div class = "new">
            <a href="insert" target = "frame3"><button>Insert Result</button></a><br><br><br><br>
            <a href="delete" target = "frame3"><button>Delete Result</button></a><br><br><br><br>
            <a href="update" target = "frame3"><button>Update Result</button></a></button><br><br><br><br>
            <a href="find" target = "frame3"><button>Find Result</button></a></button><br><br><br><br>
            <a href="viewall" target = "frame3"><button>View all Result</button></a></button><br><br><br><br>
        </div>
        </center>
</body>
</html>