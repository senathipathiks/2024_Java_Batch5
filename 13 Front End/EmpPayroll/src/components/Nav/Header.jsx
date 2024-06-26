import React from 'react'
import "./header.css"

function Header() {
  return (
    <div class="navbar1">
      <nav class="navbar fixed-top navbar-expand-lg navbar-dark">
    <a class="navbar-brand" href="/">Employee Management System</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ms-auto">
            <li class="nav-item ">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/create">Add Employee</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/view">View Employee</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/createpayroll">Add Payroll</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/viewpayroll">View Payroll</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/register">Reg</a>
            </li>
        </ul>
    </div>
</nav>
    </div>
  )
}

export default Header
