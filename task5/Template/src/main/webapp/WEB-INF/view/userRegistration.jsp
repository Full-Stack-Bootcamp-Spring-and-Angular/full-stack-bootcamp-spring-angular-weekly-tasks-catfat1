<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- CSS -->
    <link rel="stylesheet" type="text/css"   href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>

<div class="form-wrapper">
    <form class="register-form" action="/processForm" method="post" >
        <h2>User Registration</h2>

        <div class="form-group">
            <label>First Name</label>
            <input type="text" placeholder="Enter first name"  name="firstName" required>
        </div>

        <div class="form-group">
            <label>Last Name</label>
            <input type="text" placeholder="Enter last name"name="lastName" required>
        </div>

        <div class="form-group">
            <label>Email Address</label>
            <input type="email" placeholder="Enter email" name="email" required>
        </div>

        <div class="form-group">
            <label>Date of Birth</label>
            <input type="date" name="dob" required>
        </div>

        <div class="form-group">
            <label>City</label>
            <input type="text" placeholder="Enter city" name="city">
        </div>

        <button type="submit" class="btn-submit">Submit</button>
    </form>
</div>

</body>
</html>
