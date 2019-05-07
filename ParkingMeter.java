/**
ParkingMeter class,
This class uses constructors to assign values.
*/

public class ParkingMeter
{
  public int minutesPurchased; // Integer field for total minutes purchsed.
/**
The ParkingMeter constructor sets the values of the
above mentioned variables to instance variables.
@param minutesPurchased1 instance variable for the
       total minutes purchased of the car.
*/
  public ParkingMeter(int minutesPurchased1)

  {
	 minutesPurchased = minutesPurchased1;
  }
/**
ParkingMeter construcor assigns the to above mentioned fields
to an instance object.
@param object an instance object.
*/
  public ParkingMeter(ParkingMeter object)
  {
	  minutesPurchased = object.minutesPurchased;
  }

/**
The toString method stores the output to a local variable.
@return purchased local variable which holds the output.
*/
  public String toString()
  {
    String purchased = "Minutes Purchased: " + minutesPurchased + '\n';

    return purchased;
  }

}