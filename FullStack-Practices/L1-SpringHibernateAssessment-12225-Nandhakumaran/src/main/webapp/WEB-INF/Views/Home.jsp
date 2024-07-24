<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="Navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

    <title>Home Page</title>
    <style>
    
 body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

.hero {
    background-color: #007bff;
    color: white;
    padding: 50px 0;
    text-align: center;
    transition: all 0.5s ease;
    padding-top:10%;
}

.hero:hover {
    background-color: #0056b3;
}

.hero h1 {
    margin-bottom: 20px;
    animation: fadeIn 2s;
}

.hero .cta {
    display: inline-block;
    background-color: white;
    color: #007bff;
    padding: 10px 20px;
    text-decoration: none;
    animation: bounce 2s infinite;
    transition: all 0.5s ease;
}

.hero .cta:hover {
    background-color: #0056b3;
    color: white;
}

.features {
    background-color: #f8f9fa;
    padding: 50px 0;
    text-align: center;
}

.features .feature-item {
    margin: 20px;
    animation: fadeIn 2s;
    transition: all 0.5s ease;
}

.features .feature-item img {
    width: 100px;
    height: 100px;
    object-fit: cover;
    border-radius: 50%;
}

.features .feature-item:hover {
    transform: scale(1.05);
}

footer {
    background-color: #343a40;
    color: white;
    text-align: center;
    padding: 20px 0;
    transition: all 0.5s ease;
}

footer:hover {
    background-color: #23272b;
}

@media (max-width: 600px) {
    .hero, .features, footer {
        padding: 20px 0;
    }
}

@keyframes fadeIn {
    from {opacity: 0;}
    to {opacity: 1;}
}

@keyframes bounce {
    0%, 20%, 50%, 80%, 100% {transform: translateY(0);}
    40% {transform: translateY(-30px);}
    60% {transform: translateY(-15px);}
}

#maindiv{

display:flex;

flex-direction:row;

justify-content:space-evenly;

}
    
    </style>
</head>

<body>
    <section class="hero">
        <h1>Welcome to Our Meeting Room Booking Application</h1>
        <p>Discover how to Create, Read, Update, and Delete Meeting room details.</p>
        <a href="#" class="cta">Learn More</a>
    </section>

    <section class="features">
        <h2> Operations</h2>
        <div id="maindiv">
        <div class="feature-item">
            <img src="https://images.pexels.com/photos/416320/pexels-photo-416320.jpeg?auto=compress&cs=tinysrgb&w=600" alt="Create">
            <h3>Create</h3>
            <p>Provide appropriate data to Create the room for user</p>
        </div>
        <div class="feature-item">
            <img src="https://images.pexels.com/photos/260928/pexels-photo-260928.jpeg?auto=compress&cs=tinysrgb&w=600" alt="Read">
            <h3>Read</h3>
            <p> Retrieve data of the user from a database.</p>
        </div>
        <div class="feature-item">
            <img src="https://images.pexels.com/photos/159213/hall-congress-architecture-building-159213.jpeg?auto=compress&cs=tinysrgb&w=600" alt="Update">
            <h3>Update</h3>
            <p>Modify data of the room and user in a database.</p>
        </div>
        <div class="feature-item">
            <img src="https://images.pexels.com/photos/159806/meeting-modern-room-conference-159806.jpeg?auto=compress&cs=tinysrgb&w=600" alt="Delete">
            <h3>Delete</h3>
            <p>Remove data of the user from a database.</p>
        </div></div>
    </section>

    <footer>
        <h2>Contact Us</h2>
        <p>Email: contact@example.com</p>
        <p>Phone: 123-456-7890</p>
    </footer>
</body>
</html>



