import {Outlet,Link} from "react-router-dom";
import "./Layout.css"

function Layout(){
    return(
        <>
        <nav>
            <div id="maindiv">
                <div>
                    <Link to="/"><button>Home</button>  </Link>
                </div>
                <div>
                    <Link to="blog"><button>Blog</button></Link>
                </div>
                <div>
                    <Link to="contact"><button>Contact</button></Link>
                </div>
            </div>
        </nav>
        <Outlet/>
        </>
    )
};

export default Layout;