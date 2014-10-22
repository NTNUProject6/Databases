package no.ntnu.cabinet;

import java.sql.Date;

public class Booking {
	private int id;
	private int cabin_id;
	private String user_id;
	private Date date_From;
	private Date date_To;
	
	//setter & getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCabin_id() {
		return cabin_id;
	}
	public void setCabin_id(int cabin_id) {
		this.cabin_id = cabin_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Date getDate_From() {
		return date_From;
	}
	public void setDate_From(Date date_From) {
		this.date_From = date_From;
	}
	public Date getDate_To() {
		return date_To;
	}
	public void setDate_To(Date date_To) {
		this.date_To = date_To;
	}
	
}
