package entities;

public class Guest {
	private String name;
	private String email;
	
	public Guest(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return name + ", " + email;
	}

	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
}
