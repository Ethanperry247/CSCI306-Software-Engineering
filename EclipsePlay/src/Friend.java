/**
 * @author Mark Bulletin
 *
 */
public class Friend {
	private String name;
	private String email;
	
	
	
	public Friend() {
		super();
	}



	public Friend(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}



	public String getName() {
		return name;
	}



	public String getEmail() {
		return email;
	}
	



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	

}
