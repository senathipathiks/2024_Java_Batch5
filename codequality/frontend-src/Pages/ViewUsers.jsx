import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";

function ViewUsers() {

    const [records, setRecords] = useState([]);
    const navigate = useNavigate();

    useEffect(() => {
        axios
            .get("http://localhost:3333/user/allUsers")
            .then((response) => {
                // setColumns(Object.keys(response.data[0]));
                setRecords(response.data);
            })
            .catch((err) => {
                console.log(err);
            });
    }, []);

    let handleSubmit = (uid) => {
        const conf = window.confirm("Do you want to Remove");
        if (conf) {
            axios
                .delete("http://localhost:3333/user/" + uid)
                .then((res) => {
                    alert("record has deleted");
                    navigate("/");
                    window.location.reload();
                })
                .catch((err) => console.log(err));
        }
    };


    return (
        <section id="view-emp">
            <div className="container">
                <h1 id="app2" className="text-center text-bg-success mt-5">
                    User Details
                </h1>

                <div className="d-flex justify-content-between">
                    <Link to="/addUser" className="btn btn-primary">
                        Add +
                    </Link>
                    <Link to="/viewCourse" className="btn btn-primary">
                        Course Details
                    </Link>
                </div>
                <br />
                <table className="table table-bordered table-info  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
                    <thead>
                        <tr>
                            <th className="text-center">User Id</th>
                            <th className="text-center">User Name</th>
                            <th className="text-center">Age</th>
                            <th className="text-center">Qualification</th>
                            <th className="text-center">Course Name</th>
                            <th className="text-center">Action</th>
                        </tr>
                    </thead>

                    <tbody>
                        {records.map((d, i) => (
                            <tr key={i}>

                                <td>{d.uid}</td>
                                <td>{d.uname}</td>
                                <td>{d.age}</td>
                                <td>{d.qual}</td>
                                <td>{d.course.cname}</td>
                                <td className="d-flex justify-content-evenly">
                                    <Link
                                        to={`/updateUser/${d.uid}`}

                                        className="btn btn-sm btn-success"
                                    >
                                        Update
                                    </Link>
                                    <button
                                        onClick={(e) => handleSubmit(d.uid)}
                                        className="btn btn-sm ms-1 btn-danger"
                                    >
                                        Remove
                                    </button>
                                </td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </section>
    )
}

export default ViewUsers
