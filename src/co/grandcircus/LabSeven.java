package co.grandcircus;

import java.util.Scanner;

public class LabSeven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String userName = scan.nextLine();
//		 System.out.println("Please enter your e-mail address");
//		 String emailAddy = scan.nextLine();
//		 System.out.println("Please enter your phone number");
//		 String phoneNumber = scan.nextLine();
//		 System.out.println("Please enter the date");
//		 String date = scan.nextLine();
//		 String userInput = scan.nextLine();
		System.out.println(validInput1(userName));

	}

	public static boolean validInput1(String userLine) {
		Scanner scan = new Scanner(System.in);
		boolean isValid = false;
		userLine = scan.nextLine();

		if (userLine.matches("[A-Z]{2}\\D+")) {
			isValid = true;
			if (isValid = true) {
				System.out.println(userLine + "is a valid date!");
		} 
		else if (userLine.matches("\\d[1-9]{3}-\\d[1-9]{3}-\\d[1-9]{4}")) {
			isValid = true;
				}
			if (isValid = true) {
				System.out.println(userLine + "is a valid phone number!");
				}
		} 
		else if (userLine.matches("[A-Z]{1}[a-z]{2,30}")) {
				isValid = true;
			}
			if (isValid = true) {
				System.out.println(userLine + "is a valid name!");
			}
		} else if (userLine.matches("[a-z{0-9}(5,30)][^abc][a-z{0-}(5,10)].[a-z{0-9}(2,3)]")) {
			System.out.println(userLine + "is a valid e-mail address!");
		} else {
			System.out.println("Entry not valid");
		}
		return isValid;
	}

//	public static boolean validInput(String regex) {
//		Scanner scan = new Scanner(System.in);
//
//		String userLine = scan.nextLine();
//		if (userLine.matches(regex)) {
//			return true;
//		}
//		return false;
// }
}
