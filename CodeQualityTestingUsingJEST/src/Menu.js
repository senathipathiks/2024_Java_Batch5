import React from 'react'
import DispCard from './components/Cards'
function Menu() {
  return (
    <div id="Menus" >
       <div className="container">
          
          <h1></h1>
          <div className="row">
          <div className="cards col-lg-3 col-md-6 col-sm-12 mt-4">
              <DispCard className="cards" imageUrl={"https://www.shutterstock.com/image-photo/high-voltage-posthigh-tower-sky-260nw-1440470978.jpg"}
              title={"Connected Everywere Across States , Districts , Villages ,Cities"} 
             
             />
            </div>
            <div className="cards col-lg-3 col-md-6 col-sm-12 mt-4 cards"  >
              <DispCard imageUrl={"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWoypeBGrqPVKvp5Qmiy2abc3poPijZE1IlDbd3hQgalFNd0k8CmoqCIl1H0Jk0qzjIFw&usqp=CAU"}
              title={"Solar Energy - An Alternative Renewable Source"} 
              description={"Hot nd Spicy                "} 
              btn={"Order Now!!"}/>
            </div>
            <div className="cards col-lg-3 col-md-6 col-sm-12 mt-4 cards">
              <DispCard className="cards"imageUrl={"https://c1.wallpaperflare.com/preview/796/514/362/power-high-pressure-pylons-transmission-line-thumbnail.jpg"}
              title={"Day nd Night Service"} 
              description={""}
              btn={"Order Now!!"}/>
            </div>
            <div className="col-lg-3 col-md-6 col-sm-12 mt-4 cards">
              <DispCard className="cards"imageUrl={"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_Z8e203Sd1vH_JmTAWPltimPhRIy9aqASEmEk-G10TY6Nfbo3Bh3Fnqd6gB0vu3KtPHs&usqp=CAU"}
              title={"Powerfull YTransformers"} 
              description={"Fries Friday Offer "}
              btn={"Order Now!!"}/>
            </div>
          </div>
          <div className="row">
          <div className="col-lg-3 col-md-6 col-sm-12 mt-4 cards">
              <DispCard className="cards" imageUrl={"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNuS9LcJvlByPkkYuBouWmk7F2Qu0BYzvSIA&s"}
              title={"Proper Maintenance"} 
              description={""}
              btn={"Order Now!!"}/>
            </div>
            <div className="cards col-lg-3 col-md-6 col-sm-12 mt-4">
              <DispCard className="cards"imageUrl={"https://assets-news.housing.com/news/wp-content/uploads/2021/07/27201256/How-to-apply-for-new-electricity-connection-in-Tamil-Nadu-FB-1200x700-compressed.jpg"}
              title={"Digital Meters "} 
              description={"More than 20+ varieties"}
              btn={"Order Now!!"} />
            </div>
            <div className="cards col-lg-3 col-md-6 col-sm-12 mt-4">
              <DispCard className="cards"imageUrl={"https://digitria.in/wp-content/uploads/2022/02/TNEB-Reading.jpg"}
              title={"E-Payment"} 
              description={""}
              btn={"Order Now!!"}/>
            </div>
            <div className="cards col-lg-3 col-md-6 col-sm-12 mt-4">
              <DispCard className="cards"imageUrl={"https://www.livechennai.com/businesslistings/News_photo/eb8918.jpg"}
              title={"Monthly Wise EB-Reading"} 
              description={""}
              btn={"Order Now!!"}/>
            </div>
          </div>
         
         <br></br>
         <br></br>

        </div>
        <br></br>
         <br></br>
    </div>
    
  )
}

export default Menu
