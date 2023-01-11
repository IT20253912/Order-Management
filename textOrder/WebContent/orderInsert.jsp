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
<!-- partial:index.partial.html -->
<div class="container">
  <div class="left">
    <div class="header">
      <h2 class="animation a1">Placed Customer Order</h2>
    </div>
    <div class="form">
    <form action="insert" method = "post">
    
      <input type="text" name="type" class="form-field animation a3" placeholder="Oder Type">
      <input type="text" name="cid" class="form-field animation a3" placeholder="Customer ID">
      <input type="text" name="cname" class="form-field animation a3" placeholder="Customer Name">
      <input type="text" name="des" class="form-field animation a3" placeholder="Order Description">
      <input type="number" name="orderfee" class="form-field animation a3" placeholder="Total fee">
      <input type="text" name="orderloc" class="form-field animation a3" placeholder="Order Location">
      <input type="date" name="orderdate" class="form-field animation a3" placeholder="Ordered Date">
      <input type="date" name="deldate" class="form-field animation a3" placeholder="Delevry Date">
      
      <br>
       <div class="form">
      <button class="animation a6" type="submit" name = "submit"> Place Order</button>
      </div>
      
      
    </form>
    
		
      
    </div>
  </div>
  <div class="right"></div>
</div>
<!-- partial -->
</body>
</html>