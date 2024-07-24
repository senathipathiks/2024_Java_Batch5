
import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, Link } from "react-router-dom";
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

  &:hover {
    background-color: #0056b3;
  }
`;

const SearchInput = styled.input`
  padding: 5px;
  font-size: 16px;
  border-radius: 4px;
  border: 1px solid #ccc;
  margin-right: 5px;
`;

function ViewOrder() {
    const [id, setId] = useState('');
    const [columns, setColumns] = useState([]);
    const [records, setRecords] = useState([]);
    const navigate = useNavigate();

    useEffect(() => { 
        axios
          .get("http://localhost:4444/order/all")
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
          .delete("http://localhost:4444/order/" + id)
          .then((res) => {
            alert("record has deleted");
            navigate("/");
            window.location.reload();
          })
          .catch((err) => console.log(err));
      }
    };
    return (
      <>
        <Navbar/>
        <Container>
          <Title>Order Details</Title>
          <div className="text-end">
        <Link to="/create" className="btn btn-primary">
          Add +
        </Link><br/><br/>
        <Link to="/items" className="btn btn-primary">
          Menu
        </Link><br/>
      </div>
      <br />
          <div className="text-end">
            <SearchInput type="number" id="id" placeholder="Enter Order Id" name="id" onChange={(e) => setId(e.target.value)}/>
            {/* <button onClick={handleSearch}>
              <ActionButton style={{ backgroundColor: 'green' }}>Find</ActionButton>
            </button> */}
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
              {records.filter((item)=>{ return id === ''?item : item.orderId==parseInt(id)}).map((d, i) => (
                <TableRow key={i}>
                  <TableCell>{d.orderId}</TableCell>
                  <TableCell>{d.orderedItems}</TableCell>
                  <TableCell>{d.totalAmount}</TableCell>
                  <TableCell>{d.payment}</TableCell>
                  <TableCell>{d.user.id}</TableCell>
                  

                  <TableCell>
                    <Link to={`/update/${d.orderId}`}>
                      <ActionButton style={{ backgroundColor: '#228B22' }}>Update</ActionButton>
                    </Link>
                    <button   onClick={(e) => handleSubmit(d.orderId)}>
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

export default ViewOrder;

