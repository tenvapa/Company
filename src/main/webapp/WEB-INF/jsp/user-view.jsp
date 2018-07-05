<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

      <script type="text/javascript">
          function filter()
          {
              var url = document.getElementById('dropdown').value;
              if(url != 'none') {
                  window.location = "/showAll/"+url;
              }
          }
      </script>



</head>
<body>
    <div class="container">


        <div class = "table-responsive table-primary">
            <table class="table">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Mail</th>
                        <th>Age</th>
                        <th>Job</th>
                        <th>Department</th>
                        <th>Salary</th>
                        <th>Contract Length</th>
                        <th>
                            <select name="dropdown" id='dropdown'>
                              <option value='none' selected>Choose a filter</option>
                              <option value="name">Name</option>
                              <option value="job">Job</option>
                              <option value="department">Department</option>
                            </select>

                            <input type=button value="Filter" onclick="filter()" />
                            </th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${users}" var="employee">
                        <tr>
                            <td><c:out value="${employee.name}"/></td>
                            <td><c:out value="${employee.mail}"/></td>
                            <td><c:out value="${employee.age}"/></td>
                            <td><c:out value="${employee.job.jobPosition}"/></td>
                            <td><c:out value="${employee.job.departmentName.department}"/></td>
                            <td><c:out value="${employee.job.salary} BGN"/></td>
                            <td><c:out value="${employee.job.contractLength} months"/></td>
                            <td><a href = "/showAll/delete/${employee.name}">DELETE</a>
                            <td><a href = "/edit/${employee.name}">EDIT</a>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
         <a class="btn btn-danger" href="/home">Go Back</a>
    </div>

</body>
</html>