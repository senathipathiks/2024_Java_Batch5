import React from 'react';
import { Link } from 'react-router-dom';


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>



function Navbar() {
  return (
    <div>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand" style={{ color: 'aquamarine' }}>STUDENT MANAGEMENT SYSTEM</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 " style={{ marginLeft: "4rem" }} >
              {/* <li class="nav-item">
                <a class="nav-link active" aria-current="page" ><Link to="/" style={{ textDecoration: "none" }} >Home</Link></a>
              </li> */}
              <li class="nav-item">
                <a class="nav-link" name="signup" ><Link to="/signup" style={{ textDecoration: "none" }}>Signup</Link></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" ><Link to="/login" style={{ textDecoration: "none" }}>Login</Link></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" ><Link to="/view" style={{ textDecoration: "none" }}>View Student</Link></a>
              </li>
              <li class="nav-item">
                <a class="nav-link"><Link to="/create" style={{ textDecoration: "none" }}>Add Student</Link></a>
              </li>
              <li style={{marginLeft:"200px"}}>
                <Link to="/find"><button class="btn btn-outline-dark"  type="submit"><i class='bx bx-search'></i> Student</button></Link>
              </li>
            </ul>

          </div>
        </div>
      </nav>
    </div>
  );
}

export default Navbar;
