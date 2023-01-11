package com.order;

public class Order {
	
	private int id;
	private String type;
	private String cid;
	private String cname;
	private String des;
	private String orderfee;
	private String orderloc;
	private String orderdate;
	private String deldate;
	
	
	public Order(int id, String type, String cid, String cname, String des, String orderfee, String orderloc, String orderdate, String deldate) {		
		this.id = id;
		this.type = type;
		this.cid = cid;
		this.cname = cname;
		this.des = des;
		this.orderfee = orderfee;
		this.orderloc = orderloc;
		this.orderdate = orderdate;
		this.deldate = deldate;
		
	}

	public int getId() {
		return id;
	}

	public String gettype() {
		return type;
	}

	public String getcid() {
		return cid;
	}
	
	public String getcname() {
		return cname;
	}

	public String getdes() {
		return des;
	}

	public String getorderfee() {
		return orderfee;
	}
	
	public String getorderloc() {
		return orderloc;
	}
	
	public String getorderdate() {
		return orderdate;
	}
	
	public String getdeldate() {
		return deldate;
	}
	

}
