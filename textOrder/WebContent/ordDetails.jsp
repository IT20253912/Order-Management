<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>



<link rel="stylesheet" href="css_v/bootstrap.min.css">
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 30%;
}

td, th {
	border: 1px solid #4d4d33;
	text-align: left;
	padding: 8px;
	background-color: #BAEEFB;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>



<!-- start form links -->

<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Colorlib Templates">
<meta name="author" content="Colorlib">
<meta name="keywords" content="Colorlib Templates">

<!-- Title Page-->


<!-- Icons font CSS-->
<link href="vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link href="vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<!-- Font special for pages-->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i"
	rel="stylesheet">

<!-- Vendor CSS-->
<link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="vendor/datepicker/daterangepicker.css" rel="stylesheet"
	media="all">

<!-- Main CSS-->
<link href="css/main.css" rel="stylesheet" media="all">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">


<!-- stop form links -->




</head>
<body>


	<center>
		<h1>Order Details</h1>
	</center>
	<br>
	<br>


	<!--  	<form action="#" method = "post">
	
	
	</form> -->
	<center>
		<table>
			<c:forEach var="ord" items="${ordDetails}">

				<c:set var="id" value="${ord.id}" />
				<c:set var="type" value="${ord.type}" />
				<c:set var="cid" value="${ord.cid}" />
				<c:set var="cname" value="${ord.cname}" />
				<c:set var="des" value="${ord.des}" />
				<c:set var="orderfee" value="${ord.orderfee}" />
				<c:set var="orderloc" value="${ord.orderloc}" />
				<c:set var="orderdate" value="${ord.orderdate}" />
				<c:set var="deldate" value="${ord.deldate}" />

				<tr>
					<td>Order ID</td>
					<td>${ord.id}</td>
				</tr>
				<tr>
					<td>type</td>
					<td>${ord.type}</td>
				</tr>
				<tr>
					<td>customer ID</td>
					<td>${ord.cid}</td>
				</tr>
				<tr>
					<td>Customer Name</td>
					<td>${ord.cname}</td>
				</tr>
				<tr>
					<td>Order Description</td>
					<td>${ord.des}</td>
				</tr>
				<tr>
					<td>Total Fee</td>
					<td>${ord.orderfee}</td>
				</tr>
				<tr>
					<td>Order location</td>
					<td>${ord.orderloc}</td>
				</tr>
				<tr>
					<td>Order Date</td>
					<td>${ord.orderdate}</td>
				</tr>
				<tr>
					<td>Delivery date</td>
					<td>${ord.deldate}</td>
				</tr>
				


			</c:forEach>
		</table>
	</center>





	<c:url value="updateorder.jsp" var="ordupdate">
		<c:param name="id" value="${id}" />
		<c:param name="type" value="${type}" />
		<c:param name="cid" value="${cid}" />
		<c:param name="cname" value="${cname}" />
		<c:param name="des" value="${des}" />
		<c:param name="orderfee" value="${orderfee}" />
		<c:param name="orderloc" value="${orderloc}" />
		<c:param name="orderdate" value="${orderdate}" />
		<c:param name="deldate" value="${deldate}" />
		

	</c:url>


	<!--  
	<a href = "${bookupdate}">
	<input type = "button" name="update" value ="update booking details">
	</a>
	-->



	<center>
		<a href="${ordupdate}">
			<div class="p-t-30">
				<button class="btn btn-success" type="button"
					name="update">Update order  Details</button>
			</div>
		</a>
	</center>
	<br>


	<c:url value="deleteorder.jsp" var="empdelete">
		<c:param name="id" value="${id}" />
		<c:param name="type" value="${type}" />
		<c:param name="cid" value="${cid}" />
		<c:param name="cname" value="${cname}" />
		<c:param name="des" value="${des}" />
		<c:param name="orderfee" value="${orderfee}" />
		<c:param name="orderloc" value="${orderloc}" />
		<c:param name="orderdate" value="${orderdate}" />
		<c:param name="deldate" value="${deldate}" />

	</c:url>


	<!--  
	<a href ="${bookdelete}">
	<input type ="button" name="delete" value = "Delete My Account">
	</a>
	
	-->



	<center>
		<a href="${empdelete}">
			<div class="p-t-30">
				<button class="btn btn-danger" type="button" name="delete">Delete
					Current Order</button>
			</div>
		</a>
<br>
		<div class="p-t-30">
			<button onclick="print()" class="btn btn-warning" " type="submit"
				name="submit" value="Submit">
				<b>Download PDF</b>
			</button>
		</div>
	</center>



</body>
</html>