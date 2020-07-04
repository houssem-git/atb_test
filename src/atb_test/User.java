package atb_test;

public class User {
	int ID;
	String name;
	String lastName;
	String email;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int iD, String name, String lastName, String email) {
		super();
		ID = iD;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
	}
	public User(String string, String string2, String string3) {
		this.lastName=string2;
		this.name=string;
		this.email=string3;
	}
	@Override
	public String toString() {
		return "User [ID=" + ID + ", name=" + name + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
  

	

}
