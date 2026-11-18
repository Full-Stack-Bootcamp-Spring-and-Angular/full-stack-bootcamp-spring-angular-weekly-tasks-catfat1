<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Preview User Data</title>
    <!-- CSS -->
    <link rel="stylesheet" type="text/css"   href="${pageContext.request.contextPath}/resources/css/prviewStyle.css">


</head>
<body>

<div class="card">
    <h2>welcome</h2>
    <p>First Name: <span>${firstName}</span></p>
    <p>Last Name: <span>${lastName}</span></p>
    <p>Email: <span>${email}</span></p>
    <p>Date of Birth: <span>${dob}</span></p>
    <p>City: <span>${city}</span></p>

</div>




</body>
</html>