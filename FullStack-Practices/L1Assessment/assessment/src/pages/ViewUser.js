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

function ViewUser() {
  const [id, setId] = useState('');
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const [orders, setOrders] = useState([]);
  const navigate = useNavigate();

  // Fetch user data on component mount
  useEffect(() => { 
    axios
      .get("http://localhost:4444/user/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  // Fetch orders data whenever id changes
  useEffect(() => { 
    axios
      .get("http://localhost:4444/order/all")
      .then((response) => setOrders(response.data))
      .catch((err) => console.log(err));
  }, [id]);

  // Calculate total bill for each user
  const calculateTotalBill = (id) => {
    const userOrders = orders.filter(order => order.user.id === id);
    return userOrders.reduce((total, order) => total + order.totalAmount, 0);
  };

  const handleSubmit = (id) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
        .delete("http://localhost:4444/user/" + id)
        .then((res) => {
          alert("record has been deleted");
          navigate("/");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <>
      <Navbar />
      <Container>
        <Title>Find User</Title>
        <div className="text-end">
          <Link to="/createuser" className="btn btn-primary">
            Add +
          </Link>
        </div>
        <br />
        <div className="text-end">
          <SearchInput
            type="number"
            id="id"
            placeholder="Enter User Id"
            name="id"
            onChange={(e) => setId(e.target.value)}
          />
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
            {records
              .filter((item) => id === '' ? item : item.id === parseInt(id))
              .map((d, i) => (
                <TableRow key={i}>
                  <TableCell>{d.id}</TableCell>
                  <TableCell>{d.name}</TableCell>
                  <TableCell>{d.emailid}</TableCell>
                  <TableCell>{d.address}</TableCell>
                  <TableCell>{d.phoneNumber}</TableCell>
                  <TableCell>{calculateTotalBill(d.id)}</TableCell>
                  <TableCell>
                    <Link to={`/updateuser/${d.id}`}>
                      <ActionButton style={{ backgroundColor: '#228B22' }}>Update</ActionButton>
                    </Link>
                    <button onClick={(e) => handleSubmit(d.id)}>
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

export default ViewUser;
