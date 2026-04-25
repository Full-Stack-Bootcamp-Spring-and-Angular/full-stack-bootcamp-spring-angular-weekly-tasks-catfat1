<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>



</head>
<body>
<h1>hello this is Home page</h1>
<form:form action="showAdminPage" method="get">
showAdminPageToHeba:<input type="submit">
</form:form>
<form:form action="showSystemPage" method="get">
showSystemPageToHamza:<input type="submit">
</form:form>
<form:form action="showManagerPage" method="get">
showManagerPageToJoumana:<input type="submit">
</form:form>
</body>

</html>