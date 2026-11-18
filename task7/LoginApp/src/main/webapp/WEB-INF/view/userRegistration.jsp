<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- CSS -->
    <link rel="stylesheet" type="text/css"   href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    <style>
    body {
        background-image: url("${pageContext.request.contextPath}/resources/images/background.jpg"); /* your image source */
        background-size: cover;      /* cover the entire screen */
        background-position: center; /* center the image */
        background-repeat: no-repeat; /* don’t tile */
        height: 100vh;               /* full viewport height */
        margin: 0;
    }
    </style>
</head>
<body>

<div class="container mt-5">
    <h2>Registration Form</h2>
    <form:form modelAttribute="userModel" method="post" action="processForm">

        <div class="col-6">
            <form:label path="userName" class="form-label">User Name</form:label>
            <form:input path="userName" class="form-control"/>
            <form:errors path="userName" class="text-danger"/>
        </div>


         <div class="col-6">
            <form:label path="email" class="form-label">Email</form:label>
            <form:input path="email" class="form-control"/>
            <form:errors path="email" class="text-danger"/>
         </div>

         <div class="col-6">
            <form:label path="password" class="form-label">Password</form:label>
            <form:password path="password" class="form-control"/>
            <form:errors path="password" class="text-danger"/>
        </div>

        <div class="col-6">
            <form:label path="confirmPassword" class="form-label">Confirm Password</form:label>
            <form:password path="confirmPassword" class="form-control"/>
            <form:errors path="confirmPassword" cssClass="text-danger" />


        </div>

        <button type="submit" class="btn btn-primary">Register</button>
    </form:form>
</div>

</body>
</html>
