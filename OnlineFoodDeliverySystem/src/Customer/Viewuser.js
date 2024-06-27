import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";



function View() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const [orders, setOrders] = useState([]);
  const navigate = useNavigate();
  const [find,setFind] = useState('');
  useEffect(() => { 
    axios
      .get("http://localhost:1000/customer/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  useEffect(() => {
    axios
      .get("http://localhost:1000/order/all")
      .then((response) => setOrders(response.data))
      .catch((err) => console.log(err));
  }, []);
 
  // Calculate total bill for each user
  const calculateTotalBill = (cid) => {
    const userOrders = orders.filter(order => order.customer.cid === cid);
    return userOrders.reduce((total, order) => total + order.price*order.nos, 0);
  };

  let handleSubmit = (cid) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
      
        .delete("http://localhost:1000/customer/" +cid)
        .then((res) => {
          alert("record has deleted");
          navigate("/");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <body>
    <div id="body">
      

      <div className="container  ">
        <h1 id="app2" className="text-center text-bg-success ">
          Customer's  Management System
        </h1>
        <br></br>
          <br></br>
          <div className="relative">
                <svg xmlns="http://www.w3.org/2000/svg" className="absolute top-0 bottom-0 w-6 h-6 my-auto text-gray-400 left-3" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                    <path strokeLinecap="round" strokeLinejoin="round" strokeWidth={2} d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z" />
                </svg>
                <input
                    type="text"
                    onChange={(e)=>setFind(e.target.value)} 
                    placeholder="SearchId"
                    className="w-60 h-10 py-3 pl-12 pr-4 text-gray-500 border rounded-md outline-none bg-gray-50 focus:bg-white focus:border-indigo-600"
                />
            </div>
         {/* <div>
          <input type="search" onChange={(e)=>setFind(e.target.value)} placeholder="Search ID"></input>
         </div> */}
        <div className="text-end">
          <Link to="/insertpay" className="btn btn-primary">
            Add +
          </Link>
        </div>
        <br />
        <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
          <thead>
            <tr>
              {/* {columns.map((c, i) => (
                <th key={i}>{c}</th>
                
              ))} */}
                <th>Customer ID</th>
                <th>Customer Name</th>
                <th>Customer Address</th>
                <th>Contact detail</th>
                <th>Payment Type</th>
                <th>Total Bill</th>
                <th>Action</th>
            </tr>
          </thead>

          <tbody>
            {records.filter((items)=>{
              return find ===''?items :items.cid==parseInt(find)
            })
            
            
            .map((d, i) => (
              <tr key={i}>
                <td>{d.cid}</td>
                <td>{d.uname}</td>
                <td>{d.addr}</td>
                <td>{d.cmobile}</td>
                <td>{d.pt}</td>
                <td>{calculateTotalBill(d.cid)}</td>
                <td>
                  <Link
                     id="butt1"
                    to={`/payupdate/${d.cid}`}
                    className="btn btn-sm btn-transparent border border-secondary "
                  >
                    Update
                  </Link>
                  <button
                  id="butt2"
                    onClick={(e) => handleSubmit(d.cid)}
                    className="btn btn-sm ms-1 btn-danger"
                  >
                    Delete  
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
    </body>
  );
}

export default View;
