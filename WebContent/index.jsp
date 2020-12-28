<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center">Products List</h2>
	<form method="post" action="ProductsAdd">
	
	<!--  	Enter ProductId: <input type="text" name="pid">  <br/>  <br/>-->
		Enter Product Name: <input type="text" name="pName" required>  <br/>  <br/>
		Enter Product Category: <input type="text" name="pCategory" required>  <br/>  <br/>
		Enter Product Quantity: <input type="text" name="pQuantity" required>  <br/>
		
		<button type="submit">Add</button>
		
		
	
	
	</form>
	

</body>
</html>