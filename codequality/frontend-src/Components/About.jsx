import React from 'react'
// import offroom from '../Images/office-room.jpg'

function About() {
    return (
        <div>
            <section id='about' className='bg-dark'>
                <div className="container-fluid align-item-center">
                    <div className="container d-flex justify-content-evenly align-items-center vh-100">
                        <div className="container d-none d-sm-block text-start m-5">
                            <img src="https://th.bing.com/th/id/R.b8783db0221409a24462a2dd20906611?rik=%2f8p%2fidKFsmr%2fLA&riu=http%3a%2f%2fpluspng.com%2fimg-png%2fbook-png-book-stack-png-image-25686-1024.png&ehk=CEU5XLKGAI1EGRgmH8PkKmkXygAxsMcBZzs%2frY4y%2fMc%3d&risl=&pid=ImgRaw&r=0" className='img-fluid rounded' alt="dummy.jsp" srcset="" />

                        </div>
                        <div className="container m-5">
                            <div className="h1 text-light text-start border-bottom border-4 border-info d-flex-inline ">About <span className='text-info'> Us</span></div> <br /> <br />
                            <p className='text-light'>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ut reiciendis accusamus officiis inventore debitis reprehenderit assumenda expedita totam. Nesciunt error asperiores aspernatur possimus in earum unde, ad nihil recusandae cum?</p>
                            <a href="/contact" className="btn btn-light text-end">Contact Us</a>
                        </div>
                    </div>
                    <div class="about-waves">
                        <svg data-name="Layer 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1200 120" preserveAspectRatio="none">
                            <path d="M985.66,92.83C906.67,72,823.78,31,743.84,14.19c-82.26-17.34-168.06-16.33-250.45.39-57.84,11.73-114,31.07-172,41.86A600.21,600.21,0,0,1,0,27.35V120H1200V95.8C1132.19,118.92,1055.71,111.31,985.66,92.83Z" class="shape-fill"></path>
                        </svg>
                    </div>
                </div>
            </section>
        </div>
    )
}

export default About
