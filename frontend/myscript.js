function showCourses(){
    fetch("http://localhost:8080/courses")    //API Endpoint
    .then((response) => response.json())      // HTTP response into json object
    .then((courses)=> {
        const dataTable= document.getElementById("coursetable")

        courses.forEach(course => {
            var row=`<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.trainer}</td>
            <td>${course.durationInMonths}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    })
}


function showEnrolledStudents(){
    fetch("http://localhost:8080/courses/enrolledstudents")    //API Endpoint
    .then((response) => response.json())                       // HTTP response into json object
    .then((students)=> {
        const dataTable= document.getElementById("enrolledtable")

        students.forEach(student => {
            var row=`<tr>
            <td>${student.name}</td>
            <td>${student.emailId}</td>
            <td>${student.courseName}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    })
}

