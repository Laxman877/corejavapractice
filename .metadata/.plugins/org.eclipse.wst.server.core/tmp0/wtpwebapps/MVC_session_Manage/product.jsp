<%@page import="com.model.Product"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="java.util.ArrayList"%>
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
	<h1 align="center">Product</h1>
	<h2 align="center">
		Welcome,
		<%=uname%>
		| <a href="logout">Logout</a>
	</h2>

	<div class="container">
		<div class="row">
			<div class="col-md-4 m-auto">
				<h1 align="center">Add Product</h1>
				<span class="text-success">${msg}</span> <span class="text-danger">${err}</span>
							<form action="addproduct">
					<input type="hidden" value="${pdata.getPid()}" name="pid">
					<div class="form-group">
						<label>Product Name</label> <input type="text" value="${pdata.getPname()}" name="pname"
							class="form-control" >
					</div>
					<div>
						<label>Price</label> <input type="text" value="${pdata.getPrice()}" name="price"
							class="form-control" >
					</div>
					<br> <input type="submit" class="btn btn-success"> <input
						type="reset" class="btn btn-primary">
				</form>
			</div>
			<div class="col-md-6 m-auto">
				<h1 align="center">Products</h1>
				<table class="table">
					<tr>
						<th>Product Id</th>
						<th>Product Name</th>
						<th>Product Price</th>
						<th colspan="2">Action</th>
					</tr>
					<%
					ArrayList<Product> al=(ArrayList)request.getAttribute("data");
					for(Product pd: al){
					%>
					<tr>
						<td><%=pd.getPid()%></td>
						<td><%=pd.getPname()%></td>
						<td><%=pd.getPrice()%></td>
						<td><a class="btn btn-danger" href="update?action=delete&&uid=<%=pd.getPid()%>">Delete</a></td>
						<td><a class="btn btn-warning" href="update?action=update&&uid=<%=pd.getPid()%>">Update</a></td>
					</tr>
					<%}
					%>
				</table>
			</div>
		</div>
	</div>
</body>
</html>