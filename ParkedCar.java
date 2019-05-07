/**
ParkedCar class,
This class uses constructors to assign.
The set method sets the values for the fields.
*/

public class ParkedCar
{ //Fields.
  public String make;           //String field for the make of the car.
  public String model;          //String field for model of the car.
  public String color;          //String field for the color of the car.
  public String licenseNumber;  //String field for the license number of the car.
  public int minutes;           //Integer field for the minutes the car was parked.

/**
The ParkedCar constructor sets the values of the
above mentioned variables to instance variables.
@param make1 instance variable for the make of the car.
@param model1 instance variable for the model of the car.
@param color1 instance variable for the color of the car.
@param licenseNumber1 instance variable for the license number of the car.
@param minutes1 instance variable for the minutes parked of the car.
*/
  public ParkedCar(String make1, String model1, String color1,
                   String licenseNumber1,int minutes1)
  {
      make = make1;
      model = model1;
      color = color1 ;
      licenseNumber = licenseNumber1;
      minutes = minutes1;

  }
/**
ParkedCar construcor assigns the to above mentioned fields
to an instance object.
@param object an instance object.
*/
  public ParkedCar(ParkedCar object)

  {
     make = object.make;
     model = object.model;
     color = object.color;
     licenseNumber = object.licenseNumber;
     minutes = object.minutes;
  }

/**
The toString method stores the output to a local variable.
@return details local variable which holds the output.
*/
 public String toString()
  {
     String details = "\n Make: " + make +
  	          "\n Model: " + model +
  	          "\n Color: " + color +
  	          "\n License Number: " + licenseNumber +
  	          "\n Minutes Parked: " + minutes +'\n';

     return details;
   }
 }