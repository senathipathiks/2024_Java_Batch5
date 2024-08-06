import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";

function ViewCourse() {

    const [records, setRecords] = useState([]);
    const navigate = useNavigate();

    useEffect(() => {
        axios
            .get("http://localhost:3333/course/allCourses")
            .then((response) => {
                setRecords(response.data);
            })
            .catch((err) => {
                console.log(err);
            });
    }, []);

    let handleSubmit = (id) => {
        const conf = window.confirm("Do you want to Remove");
        if (conf) {
            axios
                .delete("http://localhost:3333/course/" + id)
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
                    Course Details
                </h1>

                <div className="d-flex justify-content-end">
                    <Link to="/addCourse" className="btn btn-primary">
                        Add +
                    </Link>
                </div>
                <br />
                <table className="table table-bordered  table-striped w-100 border bg-white shadow px-5 pb-5 rounded ">
                    <thead>
                        <tr>
                            <th className="text-center">Course Id</th>
                            <th className="text-center">Course Name</th>
                            <th className="text-center">Duration</th>
                            <th className="text-center">Cost</th>
                            <th className="text-center">Action</th>
                        </tr>
                    </thead>

                    <tbody>
                        {records.map((d, i) => (
                            <tr key={i}>

                                <td className='text-center'>{d.cid}</td>
                                <td className='text-center'>{d.cname}</td>
                                <td className='text-center'>{d.cdur} mins</td>
                                <td className='text-center'>$ {d.cost}</td>
                                {/* <td>{d.payroll.totalsal}</td> */}
                                <td className="d-flex justify-content-evenly">
                                    <Link
                                        to={`/updateCourse/${d.cid}`}

                                        className="btn btn-sm btn-success"
                                    >
                                        Update
                                    </Link>
                                    <button
                                        onClick={(e) => handleSubmit(d.cid)}
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

export default ViewCourse
