package com.order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class orderDBUtil {
	

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;


	
	//insert employee information
	
	public static boolean insertcustomer(String type,String cid,String cname, String des, String orderfee, String orderloc, String orderdate, String deldate) {
		
		boolean isSuccess = false;
		
		//create db connection
		String url = "jdbc:mysql://localhost:3306/texttldb";
		String user = "root";
		String pass = "sliit";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt  = con.createStatement();
			String sql = "insert into stockord values (0,'"+type+"','"+cid+"','"+cname+"','"+des+"','"+orderfee+"','"+orderloc+"','"+orderdate+"','"+deldate+"')";
			int rs = stmt.executeUpdate(sql);    //return two value 1 --> succuss 0--> unsuccess
			
			if(rs >0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	

	
	
	
//search
	
	public static List<Order> validateC(String userId){
		
		ArrayList<Order> feed = new ArrayList<>();
		//create connection
		String url = "jdbc:mysql://localhost:3306/texttldb";
		String user = "root";
		String pass = "sliit";
		
		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt  = con.createStatement();			
			String sql = "select * from stockord where id='"+userId+"'";			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String type = rs.getString(2);
				String cid = rs.getString(3);
				String cname = rs.getString(4);
				String des = rs.getString(5);
				String orderfee = rs.getString(6);
				String orderloc = rs.getString(7);
				String orderdate = rs.getString(8);
				String deldate = rs.getString(9);
				
				
				
				Order b = new Order(id,type,cid,cname,des,orderfee,orderloc,orderdate,deldate);
				feed.add(b);
				
		
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return feed;
	}
	
	//update booking details
	
	public static boolean updatebooking(String id,String type,String cid,String cname,String des,String orderfee,String orderloc, String orderdate, String deldate ) {
		
		boolean isSuccess = false;
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update stockord set type='"+type+"',cid='"+cid+"',cname='"+cname+"',des='"+des+"',orderfee='"+orderfee+"',orderloc='"+orderloc+"',orderdate='"+orderdate+"',deldate='"+deldate+"' "+"where id='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs >0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		return isSuccess;
	}

//retrive
	
	public static List<Order> getBookingDetails(String id){
		
		int concertedID = Integer.parseInt(id);
		
		
		ArrayList<Order> emp = new ArrayList<>();
		
		try {
			
			con  = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from stockord where id = '"+concertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int bid = rs.getInt(1);
				String type = rs.getString(2);
				String cid = rs.getString(3);
				String cname = rs.getString(4);
				String des = rs.getString(5);
				String orderfee = rs.getString(6);
				String orderloc = rs.getString(7);
				String orderdate = rs.getString(8);
				String deldate = rs.getString(9);
				
				
				
				Order b = new Order(bid,type,cid,cname,des,orderfee,orderloc,orderdate,deldate);
				emp.add(b);
				
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return emp;
	}
	
//delete
	public static boolean deleteBook(String id) {
		boolean isSuccess = false;
		
		//int convId = Integer.parseInt(id);
		
		int concertedID = Integer.parseInt(id);
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql ="delete from stockord where id='"+concertedID+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		return isSuccess;
		
	}
}
