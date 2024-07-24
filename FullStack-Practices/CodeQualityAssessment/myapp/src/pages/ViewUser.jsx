import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, Link } from "react-router-dom";
import styled from 'styled-components';
import Navbar1 from "../components/Navbar1";

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
  const navigate = useNavigate();

  // Fetch user data on component mount
  useEffect(() => { 
    const fetchUserData = async () => {
      try {
        const response = await axios.get("http://localhost:1010/user/all");
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      } catch (err) {
        console.log(err);
      }
    };

    fetchUserData();
  }, []);

  const handleSubmit = async (id) => {
    const conf = window.confirm("Do you want to delete?");
    if (conf) {
      try {
        await axios.delete(`http://localhost:1010/user/${id}`);
        alert("Record has been deleted");
        navigate("/usermain");
        window.location.reload();
      } catch (err) {
        console.log(err);
      }
    }
  };
  return (
    <>
      <Navbar1 />
      <Container>
        <Title className="text-2xl font-bold" role="heading"> User Details</Title>
        <div className="text-end">
          
            <Link to="/adduser" className="btn btn-primary">
            <button>Add +</button>
            
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
            {records
              .filter((item) => id === '' ? item : item.id === parseInt(id))
              .map((d, i) => (
                <TableRow key={i}>
                  <TableCell>{d.id}</TableCell>
                  <TableCell>{d.name}</TableCell>
                  <TableCell>{d.emailid}</TableCell>
                  <TableCell>{d.address}</TableCell>
                  <TableCell>{d.phoneNumber}</TableCell>
                  <TableCell>{d.donation}</TableCell>
                  <TableCell>{d.status}</TableCell>
                  <TableCell>
                    <Link to={`/edituser/${d.id}`}>
                    <button class="mr-4" title="Edit">
                <svg xmlns="http://www.w3.org/2000/svg" class="w-5 fill-blue-500 hover:fill-blue-700"
                  viewBox="0 0 348.882 348.882">
                  <path
                    d="m333.988 11.758-.42-.383A43.363 43.363 0 0 0 304.258 0a43.579 43.579 0 0 0-32.104 14.153L116.803 184.231a14.993 14.993 0 0 0-3.154 5.37l-18.267 54.762c-2.112 6.331-1.052 13.333 2.835 18.729 3.918 5.438 10.23 8.685 16.886 8.685h.001c2.879 0 5.693-.592 8.362-1.76l52.89-23.138a14.985 14.985 0 0 0 5.063-3.626L336.771 73.176c16.166-17.697 14.919-45.247-2.783-61.418zM130.381 234.247l10.719-32.134.904-.99 20.316 18.556-.904.99-31.035 13.578zm184.24-181.304L182.553 197.53l-20.316-18.556L294.305 34.386c2.583-2.828 6.118-4.386 9.954-4.386 3.365 0 6.588 1.252 9.082 3.53l.419.383c5.484 5.009 5.87 13.546.861 19.03z"
                    data-original="#000000" />
                  <path
                    d="M303.85 138.388c-8.284 0-15 6.716-15 15v127.347c0 21.034-17.113 38.147-38.147 38.147H68.904c-21.035 0-38.147-17.113-38.147-38.147V100.413c0-21.034 17.113-38.147 38.147-38.147h131.587c8.284 0 15-6.716 15-15s-6.716-15-15-15H68.904C31.327 32.266.757 62.837.757 100.413v180.321c0 37.576 30.571 68.147 68.147 68.147h181.798c37.576 0 68.147-30.571 68.147-68.147V153.388c.001-8.284-6.715-15-14.999-15z"
                    data-original="#000000" />
                </svg>
              </button></Link>
                    {/* <button onClick={(e) => handleSubmit(d.id)}>
                      <ActionButton style={{ backgroundColor: 'red' }}>Delete</ActionButton>
                    </button> */}

                    <button class="mr-4" title="Delete" name={`delete${d.id}`} onClick={(e) => handleSubmit(d.id)}>
                <svg xmlns="http://www.w3.org/2000/svg" class="w-5 fill-red-500 hover:fill-red-700" viewBox="0 0 24 24">
                  <path
                    d="M19 7a1 1 0 0 0-1 1v11.191A1.92 1.92 0 0 1 15.99 21H8.01A1.92 1.92 0 0 1 6 19.191V8a1 1 0 0 0-2 0v11.191A3.918 3.918 0 0 0 8.01 23h7.98A3.918 3.918 0 0 0 20 19.191V8a1 1 0 0 0-1-1Zm1-3h-4V2a1 1 0 0 0-1-1H9a1 1 0 0 0-1 1v2H4a1 1 0 0 0 0 2h16a1 1 0 0 0 0-2ZM10 4V3h4v1Z"
                    data-original="#000000" />
                  <path d="M11 17v-7a1 1 0 0 0-2 0v7a1 1 0 0 0 2 0Zm4 0v-7a1 1 0 0 0-2 0v7a1 1 0 0 0 2 0Z"
                    data-original="#000000" />
                </svg>
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
