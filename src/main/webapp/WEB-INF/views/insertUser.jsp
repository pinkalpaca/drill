<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	insertUser
</h1>
<form action="/ondony" method="post">
  <label>Name:</label>
  <input id="name" type="text" name="name">
  <label>Dept:</label>
  <input id="dept" type="text" name="dept">
  <input type="submit" value="save">
</form>
</body>
</html>
