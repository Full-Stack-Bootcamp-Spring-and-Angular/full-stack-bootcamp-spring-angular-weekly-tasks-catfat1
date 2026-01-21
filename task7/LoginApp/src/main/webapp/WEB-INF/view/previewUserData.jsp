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
    <p>userName: <span>${userModel.userName}</span></p>
    <p>email: <span>${userModel.email}</span></p>
</div>




</body>
</html>