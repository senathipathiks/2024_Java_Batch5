import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import Navbar2 from "../Navbar2";
import "./App2.css";

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

function FoodView() {
  const [id, setId] = useState('');
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    const fetchRecords = async () => {
      try {
        const response = await axios.get("http://localhost:1244/food/all");
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      } catch (err) {
        console.error("Error fetching foods records:", err);
      }
    };
    fetchRecords();
  }, []);

  let handleSubmit = (id) => {
    const conf = window.confirm("Do you want to delete this food?");
    if (conf) {
      axios
        .delete("http://localhost:1244/food/" + id)
        .then((res) => {
          alert("Record has been deleted successfully.");
          navigate("/FoodView");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
  };

  return (
    <>
        <Navbar2/>
        <div id="body">
        <Container>
          <Title>Restaurant And Food Management System</Title>
          <div className="text-end">
        <Link to="/FoodAdd" className="btn btn-primary">
          Add New Food
        </Link><br/><br/>
        <Link to="#" className="btn btn-primary">
          Menu
        </Link><br/>
      </div>
      <br />
          <div className="text-end">
            <SearchInput type="number" id="id" placeholder="Enter Food Id" name="fid" onChange={(e) => setId(e.target.value)}/>
            
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
              {records.filter((item)=>{ return id === ''?item : item.fid==parseInt(id)}).map((d, i) => (
                <TableRow key={i}>
                  <TableCell>{d.fid}</TableCell>
                  <TableCell>{d.foodName }</TableCell>
                  <TableCell>{d.price }</TableCell>
                  <TableCell>{d.quantity}</TableCell>
                  <TableCell>{d.totalAmount}</TableCell>
                  <TableCell>{d.restaurant.name}</TableCell>
                  

                  <TableCell>
                    <Link to={`/FoodEdit/${d.fid}`}>
                      <ActionButton style={{ backgroundColor: '#228B22' }}>Update</ActionButton>
                    </Link>
                    <button   onClick={(e) => handleSubmit(d.fid)}>
                      <ActionButton style={{ backgroundColor: 'red' }}>Delete</ActionButton>
                    </button>
                  </TableCell>
                </TableRow>
              ))}
            </tbody>
          </StyledTable>
        </Container></div>
      </>
  );
}

export default FoodView;

