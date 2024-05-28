 function valid(event) {
	 event.preventDefault();
	        var email = document.getElementById("email").value;
	        var password = document.getElementById("password").value;
	    
	        if (email === "admin@gmail.com" && password === "admin") {
	        	console.log(email);
	        	window.location.href = "AdminHome.jsp";
	        } 
	        else if(email === "user@gmail.com" && password === "user")
	        {
	        	console.log(email);
	        	window.location.href = "Home.html";
	        }
	        else {
	            alert("Invalid information");
	            return;
	        }
	 }