// import axios from "axios";
// import React, { useEffect, useState } from "react";
// import { Link, useNavigate, useParams } from "react-router-dom";
// import "./App2.css";

// function Search() {
//     // const { id } = useParams();
//     // const [data, setData] = useState([]);
//     const navigate = useNavigate();
//     const [columns, setColumns] = useState([]);
//     const [records, setRecords] = useState([]);
    
//     const [id, setId] =useState('');
//     // const [find,setFind] = useState('');
  
//     useEffect(() => {
//       axios
//         .get("http://localhost:1000/employee/all")
//         .then((response) =>{ setColumns(Object.keys(response.data[0]));})
//         .catch((err) => console.log(err));
//     }, []);
  
//     let handleSearch = () => {
         
//         // const conf = window.confirm("Do you want to delete");
//         // if (conf) {
//           // console.log(id);
//           axios
          
//             .get("http://localhost:1000/employee/" + id)
//             .then((response) => {
//               setColumns(Object.keys(response.data[0]));
//               setRecords(response.data);
//               // setData(response.data);
//               console.log(response.data);
//             })
//             .catch((err) => {
//               console.log(err);
//             });
//         }
    



//     return (
//       <div>
        
//         <div
//           id="edit2"
//           className="d-flex w-100 vh-100 justify-content-center align-items-center "
//         >
//           <div className="w-50 border bg-light p-5">
//               <h1>FIND EMPLOYEE DATA'S</h1>
//               <div>
//                 <lable htmlFor="id">ID :</lable>
//                 <input
//                   type="number"
//                   name="id"   id="id"

//                   className="form-control"
//                 onBlur={(e)=>{setId(e.target.value)}}
//                 />
//                 <br/>
//               <button className="btn btn-info "
//               onClick={handleSearch}
//               >Find</button>
                
//               </div>
  
             
//           {/* <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded "> */}
//           {/* <thead>
//             <tr>
//             <th>ID</th>
//             <th>Name</th>
//             <th>Mobile</th>
         
//             <th>CITY</th>
//             <th>DESIGNATION</th>
//             <th>SALARY</th>
//             </tr>
//           </thead>

//           <tbody>
            
//               <tr key={data.id}>
                
//                 <td>{data.id}</td>
//                 <td>{data.name}</td>
//                 <td>{data.mobile}</td>
//                 <td>{data.city}</td>
//                 <td>{data.dept}</td>
//                 <td>{data.salary.sal}</td>

              
//               </tr> */}
// {/*             

// {Array.isArray(data)  (
//       data.map((employee) => (
//         <tr key={employee.id}>
//           <td>6+{employee.id}</td>
//           <td>{employee.name}</td>
//           <td>{employee.mobile}</td>
//           <td>{employee.city}</td>
//           <td>{employee.dept}</td>
//           <td>{employee.salary.sal}</td>
//         </tr>
//       )))
//     //  } */}
//      <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
//       <thead>
//             <tr>
//               {columns.map((c, i) => (
//                 <th key={i}>{c}</th>
//               ))}
//               {/* <th>Action</th> */}
//             </tr>
//           </thead>

//           <tbody>
//             {records.map((d, i) => (
//               <tr key={i}>
//                 <td>{d.id}</td>
//                 <td>{d.name}</td>
//                 <td>{d.mobile}</td>
//                 <td>{d.city}</td>
//                 <td>{d.dept}</td>
//                 <td>{d.salary.sal}</td>
//                 <td>
//                   {/* <Link
//                      id="butt1"
//                     to={`/update/${d.id}`}
//                     className="btn btn-sm btn-transparent border border-secondary "
//                   >
//                     Update
//                   </Link> */}
//                   {/* <button
//                   id="butt2"
//                     onClick={(e) => handleSubmit(d.id)}
//                     className="btn btn-sm ms-1 btn-danger"
//                   >
//                     Delete  
//                   </button> */}
//                 </td>
//               </tr>
//             ))}
//           </tbody>
//         </table>






// {/* 
//               <p>{data.Name}</p>
//               <p>{data.Mobile}</p>
//               <p>{data.City}</p> */}
            
//           </div>
//         </div>
//       </div>
//     );
//   }
  
  
  

// export default Search;

import axios from "axios";
import React, { useEffect, useState } from "react";
import { Link, useNavigate } from "react-router-dom";

function Search() {
  const navigate = useNavigate();
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const [id, setId] = useState('');

  useEffect(() => {
    // Fetch column names (keys) from the server
    axios.get("http://localhost:1000/employee/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        // setRecords(response.data);
      })
      .catch((err) => console.log(err));
  }, []);

  const handleSearch = () => {
    // Fetch employee data based on the entered ID
    axios.get(`http://localhost:1000/employee/`+id)
      .then((response) => {
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  };

  return (
    <div>
      <div id="edit2" className="d-flex w-100 vh-100 justify-content-center align-items-center">
        <div className="w-50 border bg-light p-5">
          <h1>FIND EMPLOYEE DATA</h1>
          <div>
            <label htmlFor="id">ID:</label>
            <input
              type="number"
              name="id"
              id="id"
              className="form-control"
              onBlur={(e) => setId(e.target.value)}
            />
            <br />
            <button
              className="btn btn-info"
              onClick={handleSearch}
            >
              Find
            </button>
          </div>

          <table className="table table-bordered table-striped w-100 border bg-white shadow px-5 pb-5 rounded">
            <thead>
              <tr>
                {columns.map((c, i) => (
                  <th key={i}>{c}</th>
                ))}
                {/* <th>Action</th> */}
              </tr>
            </thead>
            <tbody>
              {records&&records.map&&records.map((d, i) => (
                <tr key={i}>
                  <td>{d.id}</td>
                  <td>{d.name}</td>
                  <td>{d.mobile}</td>
                  <td>{d.city}</td>
                  <td>{d.dept}</td>
                  <td>{d.salary.sal}</td>
                  {/* <td> */}
                    {/* <Link
                      id="butt1"
                      to={`/update/${d.id}`}
                      className="btn btn-sm btn-transparent border border-secondary"
                    >
                      Rectify the errors
                    </Link> */}
                  {/* </td> */}
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
}

export default Search;

