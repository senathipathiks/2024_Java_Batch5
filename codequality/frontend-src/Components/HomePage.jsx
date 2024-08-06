import React from 'react'
import About from './About'
import DisplayCard from './DisplayCard'
// import offroom from 'https://www.shrmpro.com/wp-content/uploads/2020/08/Employee-Management.png'

function HomePage() {
    return (
        <div>
            <section id='home-content'>
                <div className="container-fluid align-item-center">
                    <div className="container d-flex justify-content-evenly align-items-center vh-100">
                        <div className="container m-5">
                            <div className="h1 text-light"> Stay consistent in your <span className='text-info'>studying</span></div> <br/>

                            <div className="p text-light text-start">However difficult life may seem, there is<span className='text-info'> always something you can do</span> and <span className='text-info'> succeed at </span></div> <br />
                            
                            <div className="container text-center">
                            <small className="text-light">― STEPHEN HAWKING</small><br/> <br/>
                                <a href="#display-card" className="btn btn-light">Get Started</a>
                            </div>
                        </div>
                        <div className="container d-none d-sm-block text-start m-5">
                            <img src={"https://www.istudiotech.in/wp-content/uploads/2020/05/course-management-system.png"} className='img-fluid rounded' alt="" srcset="" />

                        </div>
                    </div>
                </div>

            </section>
            <About />
            <DisplayCard />
        </div>
    )
}

export default HomePage
