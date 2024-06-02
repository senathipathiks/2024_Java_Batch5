function validateForm() {

    const nameField = document.getElementById("uname").value;

    if (isNotEmpty(nameField)) {
        return true;
    } else {
        alert("Please fill in all required fields.");
        return false;
    }
}
function isNotEmpty(field) {
    const fieldData = field.value;
    if (fieldData.trim() === "") {
        field.className = "FieldError"; // Add a class to highlight the error
        return false;
    } else {
        field.className = "FieldOk"; // Reset the field back to default
        return true;
    }
}