<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>


    <form method="post">
        <div class="form-group">
            <label for="usr">Name:</label>
            <input type="text" class="form-control" id="usr" name="name" required value=${user.name}>
        </div>
        <div class="form-group">
            <label for="mail">Mail:</label>
            <input type="text" class="form-control" id="mail" name="mail" value=${user.mail}>
        </div>
        <div class="form-group">
            <label for="age">Age:</label>
            <input type="number" class="form-control" id="age" name="age" value=${user.age}>
        </div>

            <div class="form-group">
                <label for="jobpos">Job Position:</label>
                <input type="text" class="form-control" id="jobpos" name="jobPosition" value=${user.job.jobPosition}>
            </div>
            <div class="form-group">
                <label for="department">Department:</label>
                <input type="text" class="form-control" id="department" name="department" value=${user.job.departmentName.department}>
            </div>
            <div class="form-group">
                <label for="salary">Salary:</label>
                <input type="number" class="form-control" id="salary" name="salary" value=${user.job.salary}>
            </div>

            <div class="form-group">
                <label for="con">Contract Length:</label>
                <input type="number" class="form-control" id="con" name="contractLength" value=${user.job.contractLength}>
            </div>

        <button type="submit" class="btn btn-primary">SAVE</button>
    </form>

</body>
</html>