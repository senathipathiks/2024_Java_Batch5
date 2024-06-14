<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nav Page</title>


<style>
button {
  background: transparent;
  color: #000000;
  font-size: 17px;
  text-transform: uppercase;
  font-weight: 600;
  border: none;
  padding: 20px 30px;
  perspective: 30rem;
  border-radius: 10px;
  box-shadow: 0 5px 15px rgba(0, 0, 0, 0.308);
}

button::before {
  content: '';
  display: block;
  position: absolute;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  border-radius: 10px;
  background: linear-gradient(320deg, rgba(0, 140, 255, 0.678), rgba(128, 0, 128, 0.308));
  z-index: 1;
  transition: background 3s;
}

button:hover::before {
  animation: rotate 1s;
  transition: all .5s;
}

@keyframes rotate {
  0% {
    transform: rotateY(180deg);
  }

  100% {
    transform: rotateY(360deg);
  }
}


</style>
</head>
<body>
<h2>MENU</h2>
<br>   <a href=" Insert" target="frame3" ><button>Add Student</button></a><br>
       <br><a href="Delete" target="frame3"><button>Delete Student</button></a><br>
       <br><a href="Update" target="frame3"><button>Edit Student detail</button></a><br>
       <br><a href="ViewAll" target="frame3"><button>Student Details</button><br>
              <br><a href="Find All" target="frame3"><button>Find details</button><br>
       
      
</body>
</html>