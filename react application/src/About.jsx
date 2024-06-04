import React from 'react'
import img1 from './about.jpg'

function About() {
  return (
    <div>
      <div class="about" id="ab">
                    <div class="display-1 text-center">
                        About us
                    </div>
                </div>

                <div class="container aboutmsg">
                    <div class="row">
                        <div class="col-md-6 align-content-center">
                            <img className="img-responsive" id="about" src={img1}></img>
                        </div>

                        <div class="col-md-6 align-content-center">
                            <p>“Why Travel Agency”</p>
                            <p> Travel agencies don't just sell you accommodation and book tours; they work hard to ensure that
                                every customer receives attention and personalized service. By understanding what you want to
                                do, where you want to go and why, a travel agency can provide expert advice and tailor
                                itineraries to suit your needs.</p>
                        </div>
                    </div>
                </div>

                <br />
                <br></br>
    </div>
  )
}

export default About
