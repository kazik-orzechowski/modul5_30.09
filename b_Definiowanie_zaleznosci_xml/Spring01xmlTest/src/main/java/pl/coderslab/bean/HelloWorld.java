package pl.coderslab.bean;

public class HelloWorld {
	private String message;

	public HelloWorld() {
	}

	public HelloWorld(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
