<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

</head>
<body>
	<%
	String uname = (String) session.getAttribute("uname");
	if (uname == null) {
		request.setAttribute("err", "Please login First!!");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	%>
	<h1 align="center">Home</h1>
	<h2 align="center">
		Welcome,
		<%=uname%>
		| <a href="logout">Logout</a>
	</h2>
	<h3 align="center">
		<a href="product" class="btn btn-success">Go To Product</a>
	</h3>
</body>
</html>