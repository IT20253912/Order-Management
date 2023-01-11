<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>





 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="./style.css">

</head>
<body>


	<%
	String id = request.getParameter("id");
	String type = request.getParameter("type");
	String cid = request.getParameter("cid");
	String cname = request.getParameter("cname");
	String des = request.getParameter("des");
	String orderfee = request.getParameter("orderfee");
	String orderloc = request.getParameter("orderloc");
	String orderdate = request.getParameter("orderdate");
	String deldate = request.getParameter("deldate");
	
	%>




<!-- partial:index.partial.html -->
<div class="container">
  <div class="left">
    <div class="header">
      <h2 class="animation a1">Delete Current Order</h2>
    </div>
    <div class="form">
    <form action="delete" method = "post">
    <input type="text" name="bid" class="form-field animation a3" value="<%=id%>" placeholder="Employee Type">
      <input type="text" name="type" class="form-field animation a3" value="<%=type%>" placeholder="Employee Type">
      <input type="text" name="cid" class="form-field animation a3" value="<%=cid%>" placeholder="Employee Name">
      <input type="text" name="cname" class="form-field animation a3" value="<%=cname%>" placeholder="Birth of Date">
      <input type="text" name="des" class="form-field animation a3" value="<%=des%>" placeholder="Gender">
      <input type="number" name="orderfee" class="form-field animation a3" value="<%=orderfee%>" placeholder="NIC">
      <input type="text" name="orderloc" class="form-field animation a3" value="<%=orderloc%>" placeholder="Email Address">
      <input type="date" name="orderdate" class="form-field animation a3" value="<%=orderdate%>" placeholder="Starting Date">
      <input type="date" name="deldate" class="form-field animation a3" value="<%=deldate%>" placeholder="username">
     
      <br>
       <div class="form">
      <button class="animation a6" type="submit" name = "submit">Delete Order details</button>
      </div>
      
      
    </form>
    
		
      
    </div>
  </div>
  <div class="right"></div>
</div>
<!-- partial -->
</body>
</html>