import React from 'react';
import {Link,useNavigate} from 'react-router-dom';
import axios from 'axios';
import { useState,useEffect } from 'react';


function DocView() {
    const [columns, setcolumns] = useState([]);
    const [records, setrecords] = useState([]);
    const [find,setFind] = useState([]);
    const navigate = useNavigate();

    useEffect(() => {
        axios
            .get("http://localhost:1234/doctor/all")
            .then((response) => {
                setcolumns(Object.keys(response.data[0]));
                setrecords(response.data);
            })
            .catch((err) => {
                console.log(err);
            });
}, []);

    let handleSubmit = (did) => {
        const conf = window.confirm("Do you want to delete?");
        if(conf){
            axios
                .delete("http://localhost:1234/doctor/"+did)
                .then((res) => {
                    alert("Record Deleted Successfully!");
                    navigate("/DocView");
                    window.location.reload();
                })
                .catch((err) => console.log(err));
        }
    };
  return (
    <>
        <div style={{height:"650px",backgroundImage: "linear-gradient(143.6deg, rgba(192, 132, 252, 0) 20.79%, rgba(232, 121, 249, 0.26) 40.92%, rgba(204, 171, 238, 0) 70.35%)"}}>
        <div className='container' >
        <br />
        <a href='/' className='btn btn-info'>Home</a>
                <h1 className='display-1 text-center' style={{color:"Black"}}>Doctor Details</h1>
            
            {/* <div className='text-start input-group input-group-sm'>
                <input type="search" onChange={(e)=>setFind(e.target.value)} placeholder="Search Employee Name"></input>
            </div> */}

            <div className="text-end">
                <Link to="/Docadd" className="btn btn-info">
                    + Add Doctor
                </Link>
            </div>

            <br />

            <table className="table table-bordered table-hover  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead>
            <tr align="center">
                <th>Doctor ID</th>
                <th>Doctor Name</th>
                <th>Years of Experience</th>
                <th>Specialization</th>
                <th>Hospital ID</th>
                <th>Action</th>
            </tr>
            </thead>

            <tbody>
                {records.map((d,i) => (
                    <tr key={i} align="center">
                        <td>{d.did}</td>
                        <td>{d.dname}</td>
                        <td>{d.dexperience}</td>
                        <td>{d.dspecial}</td>
                        <td>{d.hospital.hid}</td>
                        <td>
                            <Link to={`/docupdate/${d.did}`} className='btn btn-warning'>Update</Link>
                            &nbsp;
                            <button onClick={(e) => handleSubmit(d.did)} className='btn btn-danger'>Delete</button>
                            &nbsp;
                            <Link to={`/docfulldetail/${d.did}`} className='btn btn-warning'>Doctor Full Details</Link>
                        </td>
                    </tr>
                ))}
            </tbody>
            </table>
            </div>
        </div>
    </>
  )
}

export default DocView
