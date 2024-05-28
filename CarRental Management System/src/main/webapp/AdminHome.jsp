<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="Home.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Admin Home Page</title>
</head>
<body>
		
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark" style="gap: 4px;">

        <div class="container-fluid">

            <a class="navbar-brand" href="#">
                <img src="./images/logo.png" height="36" alt="">
            CarZ Hub</a>

            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">

                <ul class="navbar-nav me-auto mb-2 mb-lg-0">

                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="#"></a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="Add.jsp">Add car</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Delete.jsp">Delete</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Update.jsp">Update</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="View.jsp">View Cars</a>
                    </li>
                </ul>         


                <form action="Controller" method="get" id="search" class="d-flex">
                    <input class="form-control me-2 " type="search" id="id" name="id" required type="search" placeholder="Search By ID" aria-label="Search">
             
                    <button class="btn btn-outline-success" value="Search" name="Insert" type="submit">Search</button>
                </form>
                
               
	</center>
	</form>
               
            </div>
                       
        </div>
    </nav>


    <div id="carouselExampleControlsNoTouching" class="carousel slide" data-bs-touch="false" data-bs-interval="false">

        <div class="carousel-inner">

          <div class="carousel-item active">
            <img src="./images/pic4.jpeg" class="d-block w-100" alt="Loading">
          </div>

          <div class="carousel-item">
            <img src="./images/pic5.jpeg" class="d-block w-100" alt="Loading">
          </div>

          <div class="carousel-item">
            <img src="./images/pic6.jpeg" class="d-block w-100" alt="Loading">
          </div>


          <div class="carousel-item">
            <img src="./images/pic7.jpeg" class="d-block w-100" alt="Loading">
          </div>

          <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControlsNoTouching" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
          </button>
  
          <button class="carousel-control-next" type="button"  data-bs-target="#carouselExampleControlsNoTouching" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
          </button>

        </div>

    </div>

 	<img src="./images/pic2.jpg" style="margin-top: 2rem;" class="d-block w-100" alt="Loading">
 
    <div class="ruler" style="margin-top: 2rem;">
      <hr>
    </div>

    <div class="card text-center" style="margin-top: 2rem;">

        <div class="card-header" style="background-color: #485769;">
          <p style="color: white; margin: 0;">Back to top</p>
        </div>

        <div class="card-body" style="background-color: #232F3E;" d-flex;>
            <ul class="navbar-nav me-auto mb-2 mb-lg-0" style="color:white; align-items:center;">
                <li class="nav-item">
                    <h2><a class="nav-link" aria-current="page" href="#">Get to Know Us </a></h2>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Help</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Feedback</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About Us </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Press Releases</a>
                </li>
            </ul> 
        </div>

        <div class="card-footer text-body-secondary">
          © 2024, carzhub.com
        </div>

    </div>
</body>
</html>