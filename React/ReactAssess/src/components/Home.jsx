import './Home.css';
import {BrowserRouter as Router,Route,Routes,Link } from 'react-router-dom';
import Register from './Register';

function Home() {
  return (
    <>
    <br />

     <div className="logb text-end">
        <Link to="/login">
            <button className="btn btn-info">Login</button>
        </Link>  &nbsp;  

        <Link to="/register">
            <button className="btn btn-info">Signup</button>
        </Link>
    </div>
<center>
    <section id='intro'>
        <br />
        <Link to="/">
            <span className='display-1'>American Warehouse</span><br />
            <span className='fs-5'>Place to Store the Planet</span>
        </Link>
    </section>
    <hr />
    Select Your Mode
</center><br />
<div className='text-center'>
    <Link to="/admin"><button className='btn btn-success'>Admin</button> &nbsp;</Link>
    <Link to="/user"><button className='btn btn-success'>User</button></Link>
</div>


    </>
  );
}

export default Home;