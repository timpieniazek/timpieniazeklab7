import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a valid name: ");
		String name = scan.nextLine();
		validateName(name);
		
		System.out.println("Please enter a valid email: ");
		String email = scan.nextLine();
		validateEmail(email);

		System.out.println("Please enter a valid phone number: ");
		String phoneNumber = scan.nextLine();
		validatePhoneNumber(phoneNumber);
		
		System.out.println("Please enter a valid date (dd/mm/yyyy): ");
		String date = scan.nextLine();
		validateDate(date);
		
		
		scan.close();
		
		System.out.println("GoodBye!");
	}
	
	
	
	public static void validateName(String name) {
		// p save our pattern, means not (^) a letter a to z or A to Z
		Pattern p = Pattern.compile("[^a-zA-Z]");
		// m matches our pattern to the string inputed
		Matcher m = p.matcher(name);
		// finds any matches true or false
		if (m.find()) {
			System.out.println("Sorry, name is not valid!");
		} else {
			System.out.println("Name is valid!");
		}
	}
	
	public static void validateEmail(String email) {
		// p save our pattern, means word @ word . word 2-4 characters
		Pattern p = Pattern.compile("\\w+@\\w+\\.\\w{2,4}");
		// m matches our pattern to the string inputed
		Matcher m = p.matcher(email);
		// finds any matches true or false
		if (m.find()) {
			System.out.println("Email is valid!");
		} else {
			System.out.println("Sorry, email is not valid!");
		}
	}
	
	public static void validatePhoneNumber(String phoneNumber) {
		// p save our pattern, 3 digits - 3 digits - 4 digits
		Pattern p = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		// m matches our pattern to the string inputed
		Matcher m = p.matcher(phoneNumber);
		// finds any matches true or false
		if (m.find()) {
			System.out.println("Phone number is valid!");
		} else {
			System.out.println("Sorry, phone number is not valid!");
		}
	}
	
	public static void validateDate(String date) {
		// p save our pattern, 2 digits / 2 digits / 4 digits
		Pattern p = Pattern.compile("\\d{2}\\/\\d{2}\\/\\d{4}");
		// m matches our pattern to the string inputed
		Matcher m = p.matcher(date);
		// finds any matches true or false
		if (m.find()) {
			System.out.println("Date is valid!");
		} else {
			System.out.println("Sorry, Date is not valid!");
		}
	}
}
