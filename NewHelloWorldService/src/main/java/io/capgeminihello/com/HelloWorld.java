package io.capgeminihello.com;

public class HelloWorld {

	private String id;
	private String name;
	
	
	
	public HelloWorld() {
		
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	public HelloWorld(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "HelloWorld [id=" + id + ", name=" + name + "]";
	}



	public static void info(String string, long id2) {
		// TODO Auto-generated method stub
		
	}
}