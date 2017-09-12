package fr.dwaps.beans;

public class Contact {
	private String prenom;
	private int age;
	private String email;
	private String tel;
	private boolean isMan;
	
	// Constructor
	public Contact(String prenom, int age, String email, String tel, boolean isMan) {
		this.prenom = prenom;
		this.age = age;
		this.email = email;
		this.tel = tel;
		this.isMan = isMan;
	}
	
	// Setters and Getters
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public boolean isMan() {
		return isMan;
	}

	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}
	
	// toString method
	public String toString() {
		String sexe = this.isMan ? "homme" : "femme";
		
		return "\n"
			+ "\tPRENOM : " + this.prenom + " \n"
			+ "\tAGE : " + this.age + " \n"
			+ "\tEMAIL : " + this.email + " \n"
			+ "\tSEXE : " + sexe + " \n"
			+ "\n";
	}
}
