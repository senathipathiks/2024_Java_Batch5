import React from 'react'


function ViewCard() {
    return (
        <section id='view-card'>
            <div className="container mt-5 pt-5">
                <div className="h1 text-center p-4 text-light">Manage <span className='text-info  border-bottom border-2 border-info'> Courses <span className='text-light'> and </span> Users</span> </div>
                <div className="container d-flex justify-content-evenly">
                    <div className="card" style={{ width: "18rem" }}>
                        <img src="https://static-00.iconduck.com/assets.00/user-icon-1024x1024-dtzturco.png" className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">View User Details</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <div className="container d-flex justify-content-evenly">
                                <a href="/viewUser" className="btn btn-sm btn-info">View User</a>
                                <a href="/addUser" className="btn btn-sm btn-outline-info">+ User</a>
                            </div>
                        </div>
                    </div>
                    <div className="card" style={{ width: "18rem" }}>
                        <img src="https://cdn-icons-png.flaticon.com/512/6410/6410263.png" className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">View Course Details</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <div className="container d-flex justify-content-evenly">
                                <a href="/viewCourse" className="btn btn-sm btn-info">View Courses</a>
                                <a href="/addCourse" className="btn btn-sm btn-outline-info">+ Course</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="view-card-wave">
                    <svg data-name="Layer 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1200 120" preserveAspectRatio="none">
                        <path d="M985.66,92.83C906.67,72,823.78,31,743.84,14.19c-82.26-17.34-168.06-16.33-250.45.39-57.84,11.73-114,31.07-172,41.86A600.21,600.21,0,0,1,0,27.35V120H1200V95.8C1132.19,118.92,1055.71,111.31,985.66,92.83Z" class="shape-fill"></path>
                    </svg>
                </div>
            </div>
        </section>
    )
}

export default ViewCard
