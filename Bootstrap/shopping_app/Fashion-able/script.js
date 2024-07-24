var sidenav = document.querySelector(".sidenavbar");

function ShowNavbar() {
  sidenav.style.left = "0";
}

function CloseNavbar() {
  sidenav.style.left = "-35%";
}

function msg() {
  var fname = document.getElementById("exampleInputFName").value;
  var lname = document.getElementById("exampleInputLName").value;
  var mnum = document.getElementById("exampleInputMobileNo").value;
  var email = document.getElementById("exampleInputEmail1").value;
  var pwd = document.getElementById("exampleInputPassword").value;
  var rpwd = document.getElementById("exampleInputRepeatPassword").value;
  if (fname == "") {
    document.getElementById("fn").innerHTML = "Enter your First name";
    document.getElementById("fn").style.color = "white";
  }
  if (lname == "") {
    document.getElementById("ln").innerHTML = "Enter your Last name";
    document.getElementById("ln").style.color = "white";
  }
  if (mnum == "") {
    document.getElementById("mn").innerHTML = "Enter your Mobile Number";
    document.getElementById("mn").style.color = "white";
  }
  if (email == "") {
    document.getElementById("ea").innerHTML = "Enter your Email Address";
    document.getElementById("ea").style.color = "white";
  }
  if (pwd == "") {
    document.getElementById("pd").innerHTML = "Enter your Password";
    document.getElementById("pd").style.color = "white";
  }
  if (rpwd == "") {
    document.getElementById("rp").innerHTML = "Repeat Your Password";
    document.getElementById("rp").style.color = "white";
  }
  
}
function validate() {
  var name = document.getElementById("fn").value;
  var pass = document.getElementById("pass").value;
  var repeat = document.getElementById("rp").value;
  var email = document.getElementById("mail").value;
  var mob = document.getElementById("num").value;

  if (name == "") {
    alert("Firsname Should not be empty");
  } else if (pass == "") {
    alert("Password should not be empty");
  } else if (pass != repeat) {
    alert("Password should be same ");
  } else if (email == "") {
    alert("Email  should not be empty");
  } else if (mob == "") {
    alert("Mobile number  should not be empty");
  }
}
function Check() {
  var mobregex = "^[+]?[(]?[0-9]{3}[)]?[-s.]?[0-9]{3}[-s.]?[0-9]{4,6}$";
  var mobi = document.getElementById("num").value;

  if (mobi == "") {
    document.getElementById("numb").innerHTML = "Enter a valid mobile number";
    document.getElementById("numb").style.color = "red";
  } else if (mobi.match(mobregex)) {
    document.getElementById("numb").innerHTML = "MOBILE NUMBER IS CORRECT";
    document.getElementById("numb").style.color = "red";
  } else if (!mobi.match(mobregex)) {
    document.getElementById("numb").innerHTML = "MOBILE NUMBER IS INCORRECT";
    document.getElementById("numb").style.color = "red";
  }
}
