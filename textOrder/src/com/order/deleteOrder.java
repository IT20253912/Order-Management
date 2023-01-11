package com.order;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteOrder")
public class deleteOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("bid");
		
		boolean isTrue =  orderDBUtil.deleteBook(id);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("orderInsert.jsp");
			dis.forward(request, response);
		}
		else {
			List<Order> ordDetails = orderDBUtil.getBookingDetails(id);
			request.setAttribute("ordDetails", ordDetails);
			
			RequestDispatcher dis2 = request.getRequestDispatcher("ordDetails.jsp");
			dis2.forward(request, response);
		}
	}

}
