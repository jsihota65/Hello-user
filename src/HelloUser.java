import java.util.Scanner;

public class HelloUser{

	static Scanner myscanner = new Scanner(System.in);

	
	public static void exitApplication(){
		//Message to say farewell to user
		System.out.println("\nThank you for using the SQA Greeting Application");
		//Exit system
		System.exit(0);
	}

	public static String requestUserInfo(String name){
		String userName;
		System.out.println("could I please get your name? ");
		userName = myscanner.nextLine();
		return userName;
	}

	public static void sayFarewell(String name){
		System.out.println("Thank you for stopping in " + name + " Have a good night.");
	}
	
	public static void main(String[] args){
		//Create a array of String type objects to hold values for user, size is based on supplied arguments
		String userName;
		//Greet the user
		System.out.println("Hello, Welcom to SQA Selenium Bootcamp!");
		// Get the user's name
		System.out.println("could I please get your name? ");
		userName = myscanner.nextLine();
		sayFarewell(userName);
		exitApplication();

		}

	

	
}