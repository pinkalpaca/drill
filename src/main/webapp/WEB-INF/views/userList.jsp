<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	user List 
</h1>
<table style="width:200px">
<c:forEach items="${result}" var="result">
  <tr>
    <td>${result}</td>
  </tr>
</c:forEach>
</table>
</body>
</html>
