/**
ParkingTicket class,
This class uses counstructors to assign instance varialbles
and instance objects to fields and object fields.
set
*/

public class ParkingTicket
{

  public double fine;           //String field for the fine.
  public ParkingMeter object1;  //ParkingMeter object field.
  public ParkedCar object2;     //ParckedCar object field.
  public PoliceOfficer object3; //ParkedCar object field.
/**
ParkingTicket constructor uses instance variables and
instance objects to assign to the fields and object fields.
@param fine1 instance variable for fine.
@param object4 instance object for object1.
@param object5 instance object for object2.
@param object6 instance object for object3.
*/
  public ParkingTicket(double fine1,ParkingMeter object4, ParkedCar object5, PoliceOfficer object6)

  {
    fine = fine1;
    object1 = new ParkingMeter(object4);
    object2 = new ParkedCar(object5);
    object3 = new PoliceOfficer(object6);

  }

/**
The toString method stores the output to a local variable.
@return ticket local variable which holds the output.
*/
  public String toString()

  {
     String ticket = "\nCar info: " + object2 +
                    "\n" + object1 +
                    "\nPolice Officer info:" + object3 +
                    "\nFine: $ " + fine +"0\n" ;

     return ticket;
  }
}