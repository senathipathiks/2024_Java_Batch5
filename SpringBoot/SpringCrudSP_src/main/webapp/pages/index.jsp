<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false"%>
 
<!DOCTYPE html>
<html>
<head>
    <title>Data Table</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	
	<script>
        $(document).ready(function(){
            $(".editBtn").click(function(){
                var tr = $(this).closest('tr');
                tr.find('.editBtn').hide();
                tr.find('.saveBtn').show();
                tr.find('.name, .city').attr('contenteditable', 'true');
            });
 
            $(".saveBtn").click(function(){
                var tr = $(this).closest('tr');
                tr.find('.editBtn').show();
                tr.find('.saveBtn').hide();
                tr.find('.name, .city').attr('contenteditable', 'false');
 
                // Add your AJAX call here to update the database
                // Use tr.find('.id').text(), tr.find('.name').text(), and tr.find('.city').text() to get the updated values
            });
        });
    </script>
</head>
<body>
    <div id="body">
      <div class="container ">
        <h1 id="app2" class="text-center text-bg-success ">
          Student Management System
        </h1>
		<form action="abc" method="post">
	        <div class="text-end">
	          <button class="btn btn-primary">
	            Add +
	          </button>
	        </div>
	        <br />
	        <table id="myTable" class="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
	        <thead>
	            <tr>
	              <th hidden>id</th>
	              <th>Name</th>
	              <th>City</th>
	              <th>Action</th>
	            </tr>
	          </thead>
	          <tbody>
	          <c:forEach items="${students}" var="stu">
				<tr>
					<td hidden> ${stu.getId()} </td>
					<td name = "name"> ${stu.getName()} </td>
					<td name= "city"> ${stu.getCity()} </td>
			  
					<td>
	                  <button class="btn btn-sm btn-success editBtn" name="action" >
	                    Update
	                  </button>
	                  
	                  <button class="btn btn-sm btn-success saveBtn" name="action" value="save_1">
	                    Save
	                  </button>
	                  <button class="btn btn-sm ms-1 btn-danger" name="action" value="delete_1">
	                    Delete
	                  </button>
	                  
	                </td>
	              </tr>
	              </c:forEach>
	            <%-- <tr>
	                <td class="id">{user.id}</td>
	                <td class="name">{user.name}</td>
	                <td class="city">{user.city}</td>
	                <td>
	                    <button class="editBtn">Edit</button>
	                    <button class="saveBtn" style="display: none;">Save</button>
	                    <form action="" method="post">
	                        <input type="submit" value="Delete"/>
	                    </form>
	                </td>
	            </tr> --%>
	          </tbody>
	          </table>
           </form>
    
      </div>
    </div>
</body>
</html>