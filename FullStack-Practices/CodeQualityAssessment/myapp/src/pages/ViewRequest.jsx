import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, Link } from "react-router-dom";
import styled from 'styled-components';
import Navbar2 from "../components/Navbar2";

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
  background-color: ${({ color }) => color};
  color: #fff;
  padding: 5px 10px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  margin-right: 5px;

  &:hover {
    filter: brightness(90%);
  }
`;

const SearchInput = styled.input`
  padding: 5px;
  font-size: 16px;
  border-radius: 4px;
  border: 1px solid #ccc;
  margin-right: 5px;
`;

function ViewRequest() {
  const [id, setId] = useState('');
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();

  useEffect(() => { 
    const fetchData = async () => {
      try {
        const response = await axios.get("http://localhost:1010/request/all");
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      } catch (err) {
        console.log(err);
      }
    };

    fetchData();
  }, []);

  const handleDelete = async (id) => {
    const conf = window.confirm("Do you want to delete?");
    if (conf) {
      try {
        await axios.delete(`http://localhost:1010/request/${id}`);
        alert("Record has been deleted");
        setRecords(records.filter(record => record.requestId !== id)); // Remove deleted record from state
      } catch (err) {
        console.log(err);
      }
    }
  };

  return (
    <>
      <Navbar2 />
      <Container>
        <Title className="text-2xl font-bold" role="Requests">Requests</Title>
        <div className="text-end">
          <SearchInput type="number" id="id" placeholder="Enter Request Id" name="requestId" onChange={(e) => setId(e.target.value)} />
        </div>
        <br />
        <StyledTable>
          <thead>
            <tr>
              <TableHead role="request">Request Id</TableHead>
              <TableHead role="userid">User Id</TableHead>
              <TableHead role="name">User Name</TableHead>
              <TableHead role="email">User EmailId</TableHead>
              <TableHead role="address">User Address</TableHead>
              <TableHead role="phn">User PhoneNumber</TableHead>
              <TableHead role="donation">Donation Things</TableHead>
              <TableHead role="status">Status</TableHead>
              <TableHead role="action">Action</TableHead>
            </tr>
          </thead>
          <tbody>
            {records.filter(item => id === '' ? true : item.requestId === parseInt(id)).map((d, i) => (
              <TableRow key={i}>
                <TableCell>{d.requestId}</TableCell>
                <TableCell>{d.user.id}</TableCell>
                <TableCell>{d.user.name}</TableCell>
                <TableCell>{d.user.emailid}</TableCell>
                <TableCell>{d.user.address}</TableCell>
                <TableCell>{d.user.phoneNumber}</TableCell>
                <TableCell>{d.user.donation}</TableCell>
                <TableCell>{d.user.status}</TableCell>
                <TableCell>
                  <Link to={`/edit/${d.requestId}`}>
                    <ActionButton color='#228B22'>Update</ActionButton>
                  </Link>
                  <ActionButton onClick={() => handleDelete(d.requestId)} color='red'>Delete</ActionButton>
                </TableCell>
              </TableRow>
            ))}
          </tbody>
        </StyledTable>
      </Container>
    </>
  );
}

export default ViewRequest;
