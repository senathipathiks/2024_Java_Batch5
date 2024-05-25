<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	/* For the wrapper */
	.wrapper {
	    width: 100%;
	    background-color: #1F2937;
	    overflow: hidden;
	}
	
	/* For the navigation */
	.navbar {
	    background-color: #4B5563;
	    width: 100%;
	    padding: 1.25rem;
	    position: relative;
	    z-index: 20;
	    display: flex;
	    gap: 1.25rem;
	    align-items: center;
	}
	
	/* For the logo */
	.logo {
	    color: white;
	    font-size: 2.5rem;
	    line-height: 1;
	    font-family: serif;
	}
	
	/* For the hamburger menu */
	.hamburger-menu {
	    width: 2rem;
	    height: 2rem;
	    position: relative;
	    margin-top: 0.25rem;
	    cursor: pointer;
	  display: flex;
	  flex-direction: column;
	  gap: 10px;
	}
	
	/* For the menu lines */
	.hamburger-menu .hamburger-line {
	    width: 100%;
	    height: 3px;
	    background-color: white;
	    transition: transform 0.3s, opacity 0.3s;
	}
	
	/* For the menu */
	.menu {
	    width: 500px;
	    height: 100vh;
	    background-color: #4B5563;
	    color: white;
	    transition: transform 0.3s;
	    transform: translateX(-500px);
	    position: relative;
	}
	
	.menu.open {
	    transform: translateX(0);
	}
	
	/* For the menu items */
	.menu ul {
	    width: 100%;
	  list-style:none;
	  padding:0;
	  overflow:hidden;
	}
	
	.menu-item {
	    width: 100%;
	    padding: 1.25rem;
	    transition: background-color 0.3s;
	    cursor: pointer;
	}
	
	.menu-item:hover {
	    background-color: #2D3748;
	}
	
</style>

</head>
<body>
	<div class="wrapper">
	    <nav class="navbar">
	        <div onclick="toggleMenu()" class="hamburger-menu">
	            <div id="line1" class="hamburger-line"></div>
	            <div id="line2" class="hamburger-line"></div>
	            <div id="line3" class="hamburger-line"></div>
	        </div>
	        <h1 class="logo">LOGO</h1>
	    </nav>
	
	    <div id="menu" class="menu">
	        <ul>
	            <li class="menu-item" onclick="toggleMenu()">Home</li>
	            <li class="menu-item" onclick="toggleMenu()">About</li>
	            <li class="menu-item" onclick="toggleMenu()">Contact Us</li>
	            <li class="menu-item" onclick="toggleMenu()">Login</li>
	        </ul>
	    </div>
	</div>
	
	<script>
		let isOpen = false;
	
		function toggleMenu() {
		    isOpen = !isOpen;
		    const menu = document.getElementById("menu");
		    menu.classList.toggle("open");
	
		    const line1 = document.getElementById("line1");
		    const line2 = document.getElementById("line2");
		    const line3 = document.getElementById("line3");
	
		    if (isOpen) {
		        line1.style.transform = "rotate(45deg) translate(0, 0.5rem)";
		        line2.style.opacity = "0";
		        line2.style.transform = "translate(10px, 0)";
		        line3.style.transform = "rotate(-45deg) translate(.43rem ,-1.12rem)";
		    } else {
		        line1.style.transform = "none";
		        line2.style.opacity = "1";
		        line2.style.transform = "none";
		        line3.style.transform = "none";
		    }
		}

	</script>
		
</body>
</html>