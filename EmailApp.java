package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What is your first name?");
		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine();
		System.out.println("What is your last name?");
		String last = scan.nextLine();
		Email em1 = new Email(first, last);
		System.out.println(em1.showInfo());
	}

}
