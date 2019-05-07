import java.util.Scanner; // Import Scanner class.


public class TicketDemo
{
  public static void main(String[]args)
  {
  double start = System.currentTimeMillis();//Calculates the time the program takes to run.
  System.out.print("Middlesex Police Department Parking ticket simulator!\n");
  Display();//Calls the display method.
  //Displays the time the program takes to run.
  System.out.printf("\nIt took %.2f seconds to run this program.\n",(System.currentTimeMillis() - start)/1000);
  }
/**
the Display method asks the officer to enter their information
and the information of the car that is being inspected.
It then calculates the the fine.
The method uses objects to set these values to the
ParkedCar, ParkingMeter, PoliceOfficer and Parkingmeter calsses.
*/
  public static void Display()
  {
     Scanner keyboard = new Scanner(System.in);

     System.out.print("Officer. What is your first name?\n");
     String firstName = keyboard.nextLine();

     System.out.print("What is your last name?\n");
     String lastName = keyboard.nextLine();

     System.out.print("What is your badge number?\n");
     String badgeNumber = keyboard.nextLine();
     keyboard.nextLine();

     System.out.print("What is the make of the car?\n");
     String make = keyboard.nextLine();

     System.out.print("What is the model of the car?\n");
     String model = keyboard.nextLine();

     System.out.print("What is the color of the car?\n");
     String color = keyboard.nextLine();

     System.out.print("What is the license number of the car?\n");
     String licenseNumber = keyboard.nextLine();

     System.out.print("For how many minutes was the car parked at the parking spot?\n");
     int minutes = keyboard.nextInt();

     System.out.print("How many minutes did the owner purcahse on the" +
                      "parking meter?\n");
     int minutesPurchased = keyboard.nextInt();

     int remainder = minutes-minutesPurchased;
     double fine;

	 	    if ( remainder <= 0)
	 	    {
				fine = 0;
	 	    }
	 	    else
	 	    {
	 		fine = 25 + 10*((remainder - 60)/60);
	 	    }



     ParkedCar carDetails = new ParkedCar(make,model,color,licenseNumber,minutes);
     ParkingMeter purchasedMins = new ParkingMeter(minutesPurchased);
     PoliceOfficer details = new PoliceOfficer(badgeNumber,firstName ,lastName);
     ParkingTicket showDetails = new ParkingTicket(fine,purchasedMins,carDetails,details);
     System.out.print(showDetails);
     keyboard.nextLine();

         System.out.print("Would you like to inspect another car?\n" +
	 	                  "Warning: To inspect another car you will have to login again.\n");
	 	 String answer = keyboard.nextLine();

	 	 if(answer.equalsIgnoreCase("Y")||answer.equalsIgnoreCase("yes"))
	 	 {
	 		 Display();
	      }
	      else
	      {
	 		 System.out.print("Okay. Bye!");
          }

  }
}
/**
Middlesex Police Department Parking ticket simulator!
Officer. What is your first name?
John
What is your last name?
McClane
What is your badge number?
321456

What is the make of the car?
Toyota
What is the model of the car?
Camry
What is the color of the car?
Black
What is the license number of the car?
123 BED
For how many minutes was the car parked at the parking spot?
432
How many minutes did the owner purcahse on theparking meter?
32

Car info:
 Make: Toyota
 Model: Camry
 Color: Black
 License Number: 123 BED
 Minutes Parked: 432

Minutes Purchased: 32

Police Officer info:
 Name: John McClane
 Badge Number: 321456

Fine: $ 75.00
Would you like to inspect another car?
Warning: To inspect another car you will have to login again.
yes
Officer. What is your first name?
**/