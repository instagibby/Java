package src;

public class Instructor {
	// Spencer Davis
	
	private String firstName;
	private String lastName;
	private String email;
	
	
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	public Instructor(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	public Instructor(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.email = makeEmailAddress(firstName.toLowerCase(), lastName.toLowerCase());
		
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	
	
	@Override
	public String toString() {
		return "Instructor [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	public String makeEmailAddress(String fn, String ln) {
		String createEmail = fn.toLowerCase().substring(0, 1) + ln.toLowerCase() + "@dmacc.edu";
		
		return createEmail;
	}
	
	
}
