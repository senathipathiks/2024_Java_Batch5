<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>XGYM</title>
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
          <a class="navbar-brand" href="Display.jsp" id="logo"><span> X </span>GYM</a>
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
                <a class="nav-link" href="#Classes">Classes</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#News">News</a>
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
            <h5>Physical activity</h5>
            <h5 class="homeh5">enchances <span>positive energy!</span></h5><br>

            <%-- <a href="register.jsp">Join the Gym</a> --%>
        </div>
      </div>
    <!-- Home Section End -->

    <!-- About Us Start -->

    <div class="about" id="ab">
        <div class="display-5 text-center">
          About Us
        </div>
      

      <div class="container">
        <div class="row text-center">
        <p class="p1"><b>WE ARE <span>X </span>GYM</b><br>More than just your average fitness gym.</p>
        <p class="p1"><b>OUR STORY</b><br><br>
            At <span>X </span>GYM, we believe that fitness and wellbeing are the cornerstones of a full and vibrant life. Established in 2002, we began our journey as a family-owned business dedicated to providing exceptional gym environment. But, we dreamed bigger than just being an ordinary fitness gym; we aspired to lead the industry.
            
            Two decades later, we are proud to have transformed <span>X </span>GYM into one of Los Angeles's top gyms. 
            
            Our real success lies in the thousands of customers we've empowered to live longer, more joyful, and healthier lives. We're more than just a fitness company – we're your partners in health, your cheerleaders on the sideline, motivating you to reach your personal fitness goals. Embrace the fitness journey with us and see how it transforms your world.
            
            Join us in our mission to improve lives through fitness and wellness, because at <span>X </span>GYM, your health is our passion.</p>
        </div>
        
      </div>

      <div class="container container-center justify-content-space-evenly">
        <div class="row">
          <div class="col-md-4 d-flex justify-content-center">
          <div class="card" style="width: 18rem;">
            <img src="abimg1.jpg" height="190px" class="card-img-top">
            <div class="card-body">
              <h5 class="card-title">Our Values</h5>
              <a href="#home" class="btn btn-danger">Work with us!</a>
            </div>
          </div>
          </div>
      
          <div class="col-md-4 d-flex justify-content-center">
          <div class="card" style="width: 18rem;">
            <img src="abimg2.webp" height="190px" class="card-img-top">
            <div class="card-body">
              <h5 class="card-title">Our People</h5>
              <a href="#contact" class="btn btn-danger">Get in Touch</a>
            </div>
          </div>
        </div>
      
        <div class="col-md-4 d-flex justify-content-center">
        <div class="card" style="width: 18rem;">
            <img src="abimg3.webp" height="190px" class="card-img-top">
            <div class="card-body">
              <h5 class="card-title">Our Culture</h5>
              <a href="#ab" class="btn btn-danger">Why choose us?</a>
            </div>
          </div>
        </div>
      </div>      
      
        
    
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