package com.order;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/orderInsert")
public class orderInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String type = request.getParameter("type");
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String des = request.getParameter("des");
		String orderfee = request.getParameter("orderfee");
		String orderloc = request.getParameter("orderloc");
		String orderdate = request.getParameter("orderdate");
		String deldate = request.getParameter("deldate");
		
	
		
		boolean isTrue;
		
		isTrue =orderDBUtil.insertcustomer(type, cid, cname, des, orderfee, orderloc, orderdate, deldate);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("searchorder.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
