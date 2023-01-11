package com.order;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateOrder")
public class updateOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bid = request.getParameter("bid");
		String type = request.getParameter("type");
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String des = request.getParameter("des");
		String orderfee = request.getParameter("orderfee");
		String orderloc = request.getParameter("orderloc");
		String orderdate = request.getParameter("orderdate");
		String deldate = request.getParameter("deldate");
		
		
		boolean isTrue;
		
		isTrue = orderDBUtil.updatebooking(bid, type, cid, cname, des, orderfee, orderloc, orderdate, deldate);
		
		if(isTrue == true) {
			
			List<Order> ordDetails = orderDBUtil.getBookingDetails(bid);
			request.setAttribute("ordDetails", ordDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("ordDetails.jsp");
			dis.forward(request, response);
		}
		else {
	//		RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
	//		dis2.forward(request, response);
			
			List<Order> ordDetails = orderDBUtil.getBookingDetails(bid);
			request.setAttribute("ordDetails", ordDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("ordDetails.jsp");
			dis.forward(request, response);
			
		}
	}

}
