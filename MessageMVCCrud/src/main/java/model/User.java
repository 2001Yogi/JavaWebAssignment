package model;

public class User {
	private int uid;
	private String fname,lname,email;
	private long mobile;
	public int getId() {
		return uid;
	}
	public void setId(int id) {
		this.uid = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [id=" + uid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}
	public User(int id, String fname, String lname, String email, long mobile) {
		super();
		this.uid = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
