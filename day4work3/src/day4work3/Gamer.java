package day4work3;


public class Gamer {
	private int id;
	 private String firstName;
	 private String lastName;
	 private String identity;
	 private int dateofBirth;
	 
	 
	public Gamer(int id, String firstName, String lastName, String identity, int dateofBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identity = identity;
		this.dateofBirth = dateofBirth;
	}
	
	public Gamer() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public int getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(int dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	 
	
}
