<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insurance Management System</title>
    <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>

    <link rel="stylesheet" href="style.css">
    <!-- jquery link  -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>


    <!-- Bootstrap Link -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!-- Bootstrap Link -->

    <!-- Font Awesome Cdn -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"> 
    <!-- Font Awesome Cdn -->

    <!-- Google Fonts Start -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap" rel="stylesheet">
    <!-- Google Fonts End -->


    

</head>
<body>


    <!--Navbar Start-->
    <nav class="navbar navbar-expand-lg" id="navbar">
        <div class="container">
          <a class="navbar-brand" href="Display.jsp" id="logo"><span> Insurance</span> Management</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span><i class="fa-solid fa-bars"></i></span>
          </button>
          <div class="collapse navbar-collapse" class="mynavbar" id="mynavbar">
            <ul class="navbar-nav ms-auto">
              <li class="nav-item">
                <a class="nav-link" href="Display.jsp">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#ab">About Us</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#contact">Contact</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#location"><i class='fas fa-map-marker-alt' style='font-size:28px;color: red;'></i>1525 Amazing Lane,Los Angeles, CA</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    <!--Navbar End-->




    <!-- Home Section Start -->
      <div class="home" id="home">
        <div class="content">
            <h5>Security in an uncertain world.</h5>
            <h5 class="homeh5">Your safety, <span>our priority.</span></h5><br>

            <%-- <a href="register.jsp">Join the Gym</a> --%>
        </div>
      </div>
      <br>
    <!-- Home Section End -->

    <!-- About Us Start -->

    <div class="about" id="ab">
        <div class="display-5 text-center">
          About Us
        </div>
        <br>
      

      

      <div class="container container-center justify-content-space-evenly">
        <div class="row">
          <div class="col-md-4 d-flex justify-content-center">
          <div class="card" style="width: 18rem;">
            <img src="values.jpg" height="190px" class="card-img-top">
            <div class="card-body">
              <h5 class="card-title">Our Values</h5>
              <a href="#home" class="btn btn-danger">Work with us!</a>
            </div>
          </div>
          </div>
      
          <div class="col-md-4 d-flex justify-content-center">
          <div class="card" style="width: 18rem;">
            <img src="people.jpg" height="190px" class="card-img-top">
            <div class="card-body">
              <h5 class="card-title">Our People</h5>
              <a href="#contact" class="btn btn-danger">Get in Touch</a>
            </div>
          </div>
        </div>
      
        <div class="col-md-4 d-flex justify-content-center">
        <div class="card" style="width: 18rem;">
            <img src="fam.webp" height="190px" class="card-img-top">
            <div class="card-body">
              <h5 class="card-title">Our Culture</h5>
              <a href="#ab" class="btn btn-danger">Why choose us?</a>
            </div>
          </div>
        </div>
      </div>      
      
     <br>
    
    <!-- About Us End -->

    <!-- contact Section Start -->
    <section class="contact" id="contact">
        <div class="container">
            <div class="main-text">
                <h1>Contact <span>Us</span></h1>
            </div>
            <div class="row">
                <div class="col-md-6 py-3 py-md-0">
                    <div class="card">
                        <img src="contact.avif" alt="">
                    </div>
                </div>

                <div class="col-md-6 py-3 py-md-0">
                    <form action="" class="">
                        <input type="text" class="form-control" placeholder="Name.."><br>
                        <input type="text" class="form-control" placeholder="Email.."><br>
                        <input type="text" class="form-control"  placeholder="Phone No.."><br>
                        <textarea class="form-control" rows="5" name="text" placeholder="Enter Your Address"></textarea><br>
                        <input type="submit" value="Contact Us" class="submit" required>
                    </form>
            </div>
        </div>
      </section>
    <!-- contact Section End -->

    



    






    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>