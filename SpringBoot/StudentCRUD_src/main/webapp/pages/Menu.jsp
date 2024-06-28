<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />

<style>
	@keyframes icons-hover {
	    0% {
	        transform: scale(1);
	    }
	
	    50% {
	        transform: scale(1.2);
	    }
	
	    100% {
	        transform: scale(1);
	    }
	}
	
	body {
	    background-color: #353535;
	    color: #fff;
	    overflow: hidden;
	    background-image: url("https://media.istockphoto.com/id/1701407934/photo/red-and-blue-lightning-abstract-electrical-background.jpg?s=2048x2048&w=is&k=20&c=ydgSXfFHJ-STO5ch2NAAbE8Ud9Fn8RCO0ee32LomLbE=");
 			background-repeat: no-repeat;
 			background-attachment: fixed;
	}
	
	.content-wrapper {
	    align-items: start;
	    display: flex;
	    height: 100vh;
	    justify-content: start;
	}
	
	nav {
	    background-color: #424242;
	    height: 100%;
	    width: 250px;
		background-image: url("https://media.istockphoto.com/id/1701407934/photo/red-and-blue-lightning-abstract-electrical-background.jpg?s=2048x2048&w=is&k=20&c=ydgSXfFHJ-STO5ch2NAAbE8Ud9Fn8RCO0ee32LomLbE=");
 			background-repeat: no-repeat;
 			background-attachment: fixed;
	    ul {
	        list-style: none;
	        margin: 0;
	        padding: 0;
	
	        li {
	            display: flex;
	
	            a {
	                align-items: center;
	                box-shadow: inset 0 0 0 #fff;
	                color: #fff;
	                display: flex;
	                height: 40px;
	                justify-content: start;
	                padding: 5px 20px;
	                text-decoration: none;
	                transition: box-shadow 0.5s;
	                width: 100%;
	                span {
	                    margin-right: 24px;
	                }
	
	                &:hover {
	                    background-color: rgba(255, 255, 255, 0.04);
	                    box-shadow: inset -3px 0 0 #fff;
	
	                    span {
	                        animation: icons-hover 0.8s linear infinite;
	                    }
	                }
	            }
	        }
	    }
	}
	
	.content {
	    width: calc(100vw - 250px);
	    padding: 0 20px;
	}
</style>

</head>
<body>
   <div class="content-wrapper">
	  <nav>
	    <ul>
	      <li>
	        <a href="Insert" target="frame3">
	          <span class="material-symbols-outlined">
	            home
	          </span>
	          Insert
	        </a>
	      </li>
	      <li>
	        <a href="Update" target="frame3">
	          <span class="material-symbols-outlined">
	            update
	          </span>
	          Update
	        </a>
	      </li>
	      <li>
	        <a href="ViewAll" target="frame3">
	          <span class="material-symbols-outlined">
	            table_eye
	          </span>
	          View All
	        </a>
	      </li>
	      <li>
	        <a href="FindById" target="frame3">
	          <span class="material-symbols-outlined">
				search
			  </span>
	          Search
	        </a>
	      </li>
	      <li>
	        <a href="FindByState" target="frame3">
	          <span class="material-symbols-outlined">
				search
			  </span>
	          Find By State
	        </a>
	      </li>
	      <li>
	        <a href="Delete" target="frame3">
	          <span class="material-symbols-outlined">
	            delete
	          </span>
	          Delete
	        </a>
	      </li>
	    </ul>
	  </nav>
	</div>
</body>
</html>

