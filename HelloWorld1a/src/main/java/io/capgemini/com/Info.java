package io.capgemini.com;

public class Info {
	
	int id;
	String message;
	
	
	
	public Info(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public Info() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
