import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";
import Navbar from "../components/Navbar";


import styled from 'styled-components';

const Container = styled.div`
  background-color: #f9f9f9;
  padding: 20px;
`;

const Title = styled.h1`
  text-align: center;
  background-color: #f9f9f9;
  padding: 10px;
  margin-bottom: 20px;
  color: #333;
`;

const StyledTable = styled.table`
  width: 100%;
  border-collapse: collapse;
  background-color: #fff;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  border-radius: 8px;
`;

const TableHead = styled.th`
  background-color: #f9f9f9;
  color: #333;
  padding: 10px;
  text-align: left;
`;

const TableRow = styled.tr`
  &:nth-child(even) {
    background-color: #f5f5f5;
  }
`;

const TableCell = styled.td`
  padding: 10px;
`;

const ActionButton = styled.button`
  background-color: #007bff;
  color: #fff;
  padding: 5px 10px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  margin-right: 5px;
`;

function View() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    axios
      .get("http://localhost:1111/employee/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  let handleSubmit = (id) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
        .delete("http://localhost:1111/employee/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <><Navbar/>
   
     <Container>
      <Title>Employee Management System</Title>
      <div className="text-end">
        <Link to="/create" className="btn btn-primary">
          Add +
        </Link>
      </div>
      <br />
      <StyledTable>
        <thead>
          <tr>
            {columns.map((c, i) => (
              <TableHead key={i}>{c}</TableHead>
            ))}
            <TableHead>Action</TableHead>
          </tr>
        </thead>
        <tbody>
          {records.map((d, i) => (
            <TableRow key={i}>
              <TableCell>{d.id}</TableCell>
              <TableCell>{d.name}</TableCell>
              <TableCell>{d.department}</TableCell>
              <TableCell>{d.designation}</TableCell>
              <TableCell>{d.salary}</TableCell>
              <TableCell>
                <Link to={`/update/${d.id}`}>
                  <ActionButton style={{ backgroundColor: '#228B22' }}>Update</ActionButton>
                </Link>
                <button   onClick={(e) => handleSubmit(d.id)}>
                  <ActionButton style={{ backgroundColor: 'red' }}>Delete</ActionButton>
                </button>
              </TableCell>
            </TableRow>
          ))}
        </tbody>
      </StyledTable>
    </Container>
    </>
  );
}

export default View;



// const EmployeeTable = ({ columns, records, handleSubmit }) => {
//   return (
//     <Container>
//       <Title>Employee Management System</Title>
//       <div className="text-end">
//         <Link to="/create" className="btn btn-primary">
//           Add +
//         </Link>
//       </div>
//       <br />
//       <StyledTable>
//         <thead>
//           <tr>
//             {columns.map((c, i) => (
//               <TableHead key={i}>{c}</TableHead>
//             ))}
//             <TableHead>Action</TableHead>
//           </tr>
//         </thead>
//         <tbody>
//           {records.map((d, i) => (
//             <TableRow key={i}>
//               <TableCell>{d.id}</TableCell>
//               <TableCell>{d.name}</TableCell>
//               <TableCell>{d.department}</TableCell>
//               <TableCell>{d.designation}</TableCell>
//               <TableCell>{d.salary}</TableCell>
//               <TableCell>
//                 <Link to={`/update/${d.id}`}>
//                   <ActionButton>Update</ActionButton>
//                 </Link>
//                 <button onClick={(e) => handleSubmit(d.id)}>
//                   <ActionButton>Delete</ActionButton>
//                 </button>
//               </TableCell>
//             </TableRow>
//           ))}
//         </tbody>
//       </StyledTable>
//     </Container>
//   );
// };


