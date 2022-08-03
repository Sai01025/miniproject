import java.sql.SQLException;
import java.util.Scanner;
public class Index1 {
	public static void main(String[] args) throws SQLException {
		String p="y";
		String s = "y";
		String usern,passw;
		outer: while (p.equals("y")) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("....WELCOME TO BOOKING.COM");

		System.out.println("Please Enter The Login Details:");

		System.out.println("Enter Username: ");
		usern = sc1.nextLine();
		System.out.println("Enter password: ");
		passw = sc1.nextLine();

		if(usern.equals("sai") && passw.equals("sai@143"))
		{
		System.out.println("Login was succefull");
		while (s.equals("y")) {
		System.out.println("Select your Mode of journey");
		System.out.println("press 1 to BUS");
		System.out.println("press 2 to TRAIN");
		System.out.println("press 3 to FLIGHT");
		System.out.println("press 4 to SHIP");


		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		Index2 bb = new Index2();
		switch (i) {
		case 1:
		bb.Bus();
		   break;
		case 2:
		bb.Train();
		   break;
		case 3:
		bb.Flight();
		   break;
		case 4:
			bb.Ship();
			break;
		case 5:
		System.exit(0);
		default :
		System.out.println("Wrong Choice");
		   break;
		}
		System.out.println("Do you want to continue then press y/n");
		s = sc.next();
		if (s.equals("n"))
		{
		System.out.println("**Your Ticket was Successfully Booked***");
		System.out.println("***Please login again for new bookings***");
		System.out.println("****THANK YOU****");
		System.out.println(sc1) ;
		}
		}
		}
		else {
		System.out.println("INVALID. Please Enter Correct Details: ");
		  p = sc1.next();
		}
		}
	}
}
		
		
		  
		


