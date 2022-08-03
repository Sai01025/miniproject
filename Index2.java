import java.util.Scanner;
import java.sql.*;
public class Index2 {
	public Connection getconn()
	{
	Connection con = null;
	try
	{
	String url= "jdbc:mysql://localhost:3306/saikiran";
	String username="root";
	String pass="root";
	con = DriverManager.getConnection(url,username,pass);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return con;
	}
	Scanner sc1 = new Scanner(System.in);
	public void Flight() throws SQLException {
		try {
	System.out.println("***Please enter User details***");
	Connection con = getconn();
	String s1 = "insert into Flight(name,phoneno,seatno) values(?,?,?)";
	PreparedStatement stmt = con.prepareStatement(s1);

	            System.out.println("Enter your Name:");
	            String name =sc1.nextLine();
	            System.out.println("Enter your phone number:");
	            String phoneno =sc1.nextLine();
	            System.out.println("Enter seat number from ECONOMY:::\n1 2  3 4\n5 6  7 8\n9 10  11 12\nPREMIUM ECONOMY:::\n13 14\n15 16\n17 18\n19 20\n"
	            		+ "BUSSINESS CLASS:::\n21     22\n23     24");
	            String soc = sc1.nextLine();
	           int s0=Integer.parseInt(soc);
	      stmt.setString(1,name);
	      stmt.setString(2,phoneno);
	      stmt.setString(3,soc);
	      int a = stmt.executeUpdate();
	      if(s0==01||s0==04||s0==05||s0==8||s0==9||s0==12)
	    		  {
	    	  System.out.println(".....Your Flight Ticket booked....\nECONOMY-"+soc+"-Window Seat");
	    		  
	    	  }if(s0==21||s0==22||s0==23||s0==24){
	    	  System.out.println(".....Your Flight Ticket booked....\nBUSSINESS CLASS-"+soc+"-Window Seat");
	      }
	      if(s0==2||s0==3||s0==6||s0==7||s0==10||s0==11){
	    	  System.out.println(".....Your Flight Ticket booked....\nECONOMY-"+soc+"-Alise Seat");
	      }
	      if(s0==13||s0==14||s0==15||s0==16||s0==17||s0==18||s0==19||s0==20) {
	    	  System.out.println(".....Your Flight Ticket booked....\nECONOMY-"+soc+"-Window Seat");
	      }
	      
		}catch(Exception e){
			System.out.println("Already booked try with another number");	
		}   
	}
	public void Ship() throws SQLException {
		try {
	System.out.println("***Please enter your details***");
	Connection con = getconn();
	String s1 = "insert into Ship (name,phoneno,seatno) values(?,?,?)";
	PreparedStatement stmt = con.prepareStatement(s1);
	            System.out.println("Enter your Name:");
	            String name =sc1.nextLine();
	            System.out.println("Enter your phonenumber:");
	            String phoneno =sc1.nextLine();
	            System.out.println("Enter room number from 1-20");
	            String soc = sc1.nextLine();
	            int s0=Integer.parseInt(soc);
	      stmt.setString(1,name);
	      stmt.setString(2,phoneno);
	      stmt.setString(3,soc);
	      
	      int a = stmt.executeUpdate();
	      if(s0>20) {
	    	  System.out.println("Invalid Number try to enter Correct number");
	      }else {
	      System.out.println(".....Your Ship Ticket booked....\nLUXURY ROOM-"+soc+"-SEA VIEW");
	      }
	}catch(Exception e) {
		System.out.println("Already booked try with another number");	
	}
	}
	public void Bus() throws SQLException {
		try {
	System.out.println("***Please enter your details***");
	Connection con = getconn();
	String s1 = "insert into Bus(name,phoneno,seatno) values(?,?,?)";
	PreparedStatement stmt = con.prepareStatement(s1);

	            System.out.println("Enter your Name:");
	            String name =sc1.nextLine();
	            System.out.println("Enter your phoneno:");
	            String phoneno =sc1.nextLine();
	            System.out.println("Enter seatno from \n 1  2    3  4  5 \n\n 6  7    8  9 10 \n\n11 12   13 14 15 \n\n"
	            		+"16 17   18 19 20 \n\n21 22   23 24 25\n\n26 27   28 29 30 \n\n31 32   33 34 35 \n\n36 37   38 39 40");
	            String soc = sc1.nextLine();
	            int s0=Integer.parseInt(soc);
	      stmt.setString(1,name);
	      stmt.setString(2,phoneno);
	      stmt.setString(3,soc);
	      int a = stmt.executeUpdate();
	      if(s0==1||s0==5||s0==6||s0==10||s0==11||s0==15||s0==16||s0==20||s0==21||s0==25||s0==26||s0==30||s0==31||s0==35||s0==36||s0==40) {
	      System.out.println("....Your Bus Ticket Booked.....\n"+soc+"-Window Seat");
	      }
	      if(s0==4||s0==9||s0==14||s0==19||s0==24||s0==29||s0==34||s0==39){
	    	  System.out.println("....Your Bus Ticket Booked.....\n"+soc+"-Middle Seat");
	    	  }
	      if(s0==2||s0==3||s0==7||s0==8||s0==12||s0==13||s0==17||s0==18||s0==22||s0==23||s0==27||s0==28||s0==32||s0==33|s0==37||s0==38) {
	    	  System.out.println("....Your Bus Ticket Booked.....\n"+soc+"-Alise Seat");  
	      }
	      
		}catch(Exception e) {
	      
			System.out.println("Already booked try with another number");
		}
	}
	      public void Train() throws SQLException {
	    	  try {
	    	  System.out.println("***Please enter your details***");
	    	  Connection con = getconn();
	    	  String s1 = "insert into Train(name,phoneno,seatno) values(?,?,?)";
	    	  PreparedStatement stmt = con.prepareStatement(s1);
	    	              System.out.println("Enter your Name:");
	    	              String name =sc1.nextLine();
	    	              System.out.println("Enter your phoneno:");
	    	              String phoneno =sc1.nextLine();
	    	              System.out.println("Enter seatno from \n 1 2   3 4  \n\n5 6   7 8 \n\n9 10   11 12 \n\n"
	    		            		+"13 14   15 16 \n\n17 18   19 20 \n\n21 22   23 24");
	    	              String soc = sc1.nextLine();
	    	              int s0=Integer.parseInt(soc);  
	    	        stmt.setString(1,name);
	    	        stmt.setString(2,phoneno);
	    	        stmt.setString(3,soc);
	    	        int a = stmt.executeUpdate();	 
	    	        if(s0==1||s0==4||s0==5||s0==8||s0==9||s0==12||s0==13||s0==16||s0==17||s0==20||s0==21||s0==24) {
	    	        System.out.println("....Your Train Ticket Booked.....\n"+soc+"-Window Seat");
	    	  }else{
	    		  System.out.println("....Your Train Ticket Booked.....\n"+soc+"-Alise Seat");
	    	  }
	    	  }catch(Exception e) {
	    		  System.out.println("Already booked try with another number");
	    	  }
	}
	}
