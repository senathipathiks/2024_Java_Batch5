<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
					        .btn1 {
			  z-index: 1;
			  border: none;
			  border: 2px solid transparent;
			  border-image-slice: 1;
			  display: block;
			  text-align: center;
			  cursor: pointer;
			  text-transform: uppercase;
			  outline: none;
			  overflow: hidden;
			  position: relative;
			  color: #fff;
			  font-weight: 700;
			  font-size: 15px;
			  background-color: #222;
			  padding: 17px 60px;
			  margin: 0 auto;
			  box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
			  width: 170px; /* Set a fixed width */
			  height: 50px; /* Set a fixed height */
			}
			
			.btn1 span {
			  position: relative;
			  z-index: 1;
			}
			
			.btn1:before,
			.btn1:after {
			  content: "";
			  z-index: -1;
			  position: absolute;
			  left: 0;
			  top: 0;
			  height: 490%;
			  width: 140%;
			  background: #78c7d2;
			  transition: all 0.5s ease-in-out;
			  transform: translateX(-98%) translateY(-25%) rotate(45deg);
			}
			
			.btn1:hover:before {
			  transform: translateX(-9%) translateY(-25%) rotate(45deg);
			}
			
			.btn1:hover:after {
			  background: #44b5c4;
			  transform: translateX(-65%) translateY(-25%) rotate(45deg);
			}
        
            a{
                text-decoration: none;
            }
          
            .nav {
			  border: 10px solid transparent; /* Set a transparent border */
			  border-image: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%, rgba(75, 14, 154, 1) 35%, rgba(0, 212, 255, 1) 100%);
			  border-image-slice: 1; /* Ensure the entire border uses the gradient */
			  background: radial-gradient(#87CEEB, #87CEEB); 
			 
			  color: white;
			  height: 480px;
}
        
            li:not(:last-child) {
            margin-bottom: 10px;
            margin-right: 2px;
            }
            ul{
                list-style-type: none;
            }
            a{
                color: white;
                font-size: 30px;
            }
           li{
            padding: 8px;
            margin-left:-60px;
           }
        

        </style>
    </head>
    <body>
        <div class="nav">
        <ul>
            <li><a href="Insert" target="frame3" class="box"><button class="btn1">Add</button></a></li>
            <li><a href="delete" target="frame3" class="box"><button class="btn1">Delete</button></a></li>
            <li><a href="update" target="frame3" class="box"><button class="btn1">Update</button> </a></li> 
            <li><a href="viewall" target="frame3" class="box"><button class="btn1">ViewAll</button></a></li>
            <li><a href="find" target="frame3" class="box"><button class="btn1">FindById</button> </a></li>
            <li><a href="findname" target="frame3" class="box"><button class="btn1">FindByName</button> </a></li>
            
            
        </ul>
        </div>
    </body>
</html>