<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	* {
	  font-family: "Segoe UI", "Helvetica", sans-serif;
	}
	
	nav {
	  width: 250px;
	  height: 100%;
	  background-color: #f8f7f7;
	  position: fixed;
	}
	
	nav ul {
	  list-style: none;
	  padding: 0;
	  margin: 0;
	}
	
	nav li {
	  display: block;
	  padding-left: 6px;
	}
	
	nav button {
	  display: block;
	  border: none;
	  padding: 10px;
	  width: 95%;
	  border-radius: 5px;
	  text-align: left;
	  text-decoration: none;
	  background-color: inherit;
	}
	
	nav button:hover {
	  background-color: #e8e4e2;
	  cursor: pointer;
	}
	
	nav ul button:focus {
	  background-color: #ffefe5;
	  color: #a81f00;
	}
	
	nav svg {
	  margin-right: 2px;
	}
	
	#add-task-btn {
	  color: #a81f00;
	  font-weight: bold;
	}
	
	#add-task-btn i {
	  font-size: 20px;
	}
	
	.menu {
	  display: flex;
	  align-items: center;
	  justify-content: space-between; /* Align items with space between */
	}
	
	.menu p {
	  font-size: 0.9rem;
	  padding-left: 1rem;
	  font-weight: 500;
	}
	
	.menu button {
	  display: inline-block;
	  width: auto;
	  border-radius: 5px;
	  text-decoration: none;
	  background-color: inherit;
	}
	
	.menu button:focus {
	  transform: rotate(90deg);
	  transition: transform 0.3s ease;
	}
	
	a {
	  text-decoration: none;
	  color: black;
	  font-size: 20px;
	}
</style>

</head>
<body>
	<!-- <h1>Menu</h1>
    <a href="InsertStudent.jsp" target="frame3"><div>Insert</div></a><br>
    <a href="UpdateStudent.jsp" target="frame3"><div>Update</div></a><br>
    <a href="ViewAllStudents.jsp" target="frame3"><div>View All</div></a><br>
    <a href="FindStudent.jsp" target="frame3"><div>Find Student</div></a><br>
    <a href="DeleteStudent.jsp" target="frame3"><div>Delete</div></a><br> -->
    <nav>
    <!-- <button id="add-task-btn">
      <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="currentColor" class="bi bi-plus-circle-fill" viewBox="0 0 16 16">
        <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0M8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3z" />
      </svg>
      Add Task
    </button> -->
    <h3><center>Menu</center></h3>
    <ul>
      <li>
        <button>
          <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor" class="bi bi-plus-circle-fill" viewBox="0 0 16 16">
	        <path d="M	16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0M8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3z" />
	      </svg>
          <a href="InsertStudent.jsp" target="frame3">Insert</a>
        </button>
      </li>
      <li>
        <button>
          <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor" class="bi bi-inbox-fill" viewBox="0 0 16 16">
            <path d="M4.98 4a.5.5 0 0 0-.39.188L1.54 8H6a.5.5 0 0 1 .5.5 1.5 1.5 0 1 0 3 0A.5.5 0 0 1 10 8h4.46l-3.05-3.812A.5.5 0 0 0 11.02 4zm-1.17-.437A1.5 1.5 0 0 1 4.98 3h6.04a1.5 1.5 0 0 1 1.17.563l3.7 4.625a.5.5 0 0 1 .106.374l-.39 3.124A1.5 1.5 0 0 1 14.117 13H1.883a1.5 1.5 0 0 1-1.489-1.314l-.39-3.124a.5.5 0 0 1 .106-.374z" />
          </svg>
          <a href="UpdateStudent.jsp" target="frame3">Update</a>
        </button>
      </li>
      <li>
        <button>
          <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor" class="bi bi-clipboard-fill" viewBox="0 0 16 16">
            <path fill-rule="evenodd" d="M10 1.5a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5zm-5 0A1.5 1.5 0 0 1 6.5 0h3A1.5 1.5 0 0 1 11 1.5v1A1.5 1.5 0 0 1 9.5 4h-3A1.5 1.5 0 0 1 5 2.5zm-2 0h1v1A2.5 2.5 0 0 0 6.5 5h3A2.5 2.5 0 0 0 12 2.5v-1h1a2 2 0 0 1 2 2V14a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V3.5a2 2 0 0 1 2-2" />
          </svg>
          <a href="ViewAllStudents.jsp" target="frame3">View All</a>
        </button>
      </li>
      <li>
        <button>
          <svg xmlns="http://www.w3.org/2000/svg" width="17" height="17" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
            <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0" />
          </svg>
          <a href="FindStudent.jsp" target="frame3">Find Student</a>
        </button>
      </li>
      <li>
        <button>
          <svg xmlns="http://www.w3.org/2000/svg" width="13" height="13" fill="currentColor" class="bi bi-tag-fill" viewBox="0 0 16 16">
            <path d="M2 1a1 1 0 0 0-1 1v4.586a1 1 0 0 0 .293.707l7 7a1 1 0 0 0 1.414 0l4.586-4.586a1 1 0 0 0 0-1.414l-7-7A1 1 0 0 0 6.586 1zm4 3.5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0" />
          </svg>
          <a href="DeleteStudent.jsp" target="frame3">Delete</a>
        </button>
      </li>
    </ul>
  </nav>
	
	
</body>
</html>