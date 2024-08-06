import React from 'react'

function DisplayCard() {
    return (
        <div>
            <section id='display-card'>
                <div className="container">
                    <div className="container ">
                    <div className="h3 text-center text-info" id='display-text'>See what you can learn with us</div>
                        <div className="container d-flex justify-content-evenly">
                            <div class="card" style={{ width: "15rem" }}>
                                <img src="https://th.bing.com/th/id/R.31ccf6b00ca06840c2e131bf2bc00a40?rik=VQlxmxQmDTQnCQ&riu=http%3a%2f%2fpluspng.com%2fimg-png%2fjava-png-java-icon-1600.png&ehk=Ken84AvpJ83RtHDABENcApKB7bycz9ZpTDmKurCwCPU%3d&risl=&pid=ImgRaw&r=0" class="card-img-top" alt="..." />
                                <div class="card-body">
                                    <h5 class="card-title">Java Core</h5>
                                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                    <a href="/viewCourse" class="btn btn-primary">Go To Course</a>
                                </div>
                            </div>
                            <div class="card mt-3 " style={{ width: "15rem" }}>
                                <img src="https://pluspng.com/img-png/python-logo-png-open-2000.png" class="card-img-top" alt="..." />
                                <div class="card-body">
                                    <h5 class="card-title">Python</h5>
                                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                    <a href="/viewCourse" class="btn btn-primary">Go to Course </a>
                                </div>
                            </div>
                        </div>
                        <br />                      
                        
                    </div>
                    <div class="display-card-waves">
                    <svg data-name="Layer 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1200 120" preserveAspectRatio="none">
                        <path d="M985.66,92.83C906.67,72,823.78,31,743.84,14.19c-82.26-17.34-168.06-16.33-250.45.39-57.84,11.73-114,31.07-172,41.86A600.21,600.21,0,0,1,0,27.35V120H1200V95.8C1132.19,118.92,1055.71,111.31,985.66,92.83Z" class="shape-fill"></path>
                    </svg>
                </div>
                </div>

            </section>
        </div>
    )
}

export default DisplayCard
