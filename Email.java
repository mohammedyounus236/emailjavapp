package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String company = "company";
	
	//Constructor for first name and last name
	
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
	
		//Call method to ask for department - return department
		this.department = setDepartment();
		System.out.println("Department is " + this.department);
		
		//Call method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is " + this.password);
		
		//Combine elements to create email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company + ".com";
		System.out.println(email);
	}
	
	//Ask for the department
	private String setDepartment(){
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 Wrestling\n0 for none\n Enter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1){
			return "sales";
		}
		else if(depChoice == 2){
			return "dev";
		}
		else if(depChoice == 3){
			return "WWE";
		}
		else{
			return "";
		}
	}
	
	
	//Generate random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++){
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	//Set mailbox capacity
	public void setMailCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail; 
	}
	
	public String getAlternateEmail(){
		return alternateEmail;
	}

	//Change password
	public void changePassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String showInfo(){
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL : " + email +
				"\nMAILBOX CAPACITY : " + mailboxCapacity + "mb";
	}
	
}
