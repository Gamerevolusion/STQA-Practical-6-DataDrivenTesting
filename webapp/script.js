// Update Student Record

document.getElementById("updateBtn").addEventListener("click", function () {

    // Read values entered by the user

    let id = document.getElementById("studentId").value.trim();
    let name = document.getElementById("studentName").value.trim();
    let course = document.getElementById("course").value.trim();
    let marks = document.getElementById("marks").value.trim();

    // Success / Error message label

    let message = document.getElementById("message");

    // Basic Validation

    if (id === "" || name === "" || course === "" || marks === "") {

        message.innerHTML = "Please enter all fields.";
        message.style.color = "red";
        return;

    }

    // Check whether student exists

    let row = document.getElementById("student" + id);

    if (row == null) {

        message.innerHTML = "Student ID Not Found";
        message.style.color = "red";
        return;

    }

    // Update table

    document.getElementById("name" + id).innerHTML = name;
    document.getElementById("course" + id).innerHTML = course;
    document.getElementById("marks" + id).innerHTML = marks;

    // Display Success Message

    message.innerHTML = "Student Updated Successfully";
    message.style.color = "green";

    // Clear Form

    document.getElementById("studentId").value = "";
    document.getElementById("studentName").value = "";
    document.getElementById("course").value = "";
    document.getElementById("marks").value = "";

});