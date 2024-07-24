function Display(val) {
    document.getElementById("output").value += val;
  }

  function Clear() {
    document.getElementById("output").value = " ";
  }

  function Calculate() {
    var input = document.getElementById("output").value;
    var result = eval(input);
    document.getElementById("output").value = result;
  }