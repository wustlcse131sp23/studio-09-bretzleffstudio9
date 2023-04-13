package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int attemptedCredits;
	private int passingCredits;
	private double qualityPoints;
	private double bearBucks;
	public Student(String firstName, String lastName, int id) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
		this.attemptedCredits=0;
		this.passingCredits=0;
		this.qualityPoints=0;
		this.bearBucks=0;
	}

	public String getFullName() {
		return firstName+" "+lastName;
	}
	public int getId() {
		return id;
	}

	public void depositBearBucks(double amount) {
		bearBucks+=amount;
	}

	public double getBearBucksBalance() {
		return bearBucks;
	}
}
