/**
PoliceOfficer class,
This class uses constructors to assign values.
The set method sets the values for the fields.
*/

public class PoliceOfficer
{
  public String badgeNumber; //String field for the badge number of the officer.
  public String firstName;   //String field for the first name of the officer.
  public String lastName;    //String field for the last name of the officer.
/**
The PoliceOfficer constructor sets the values of the
above mentioned variables to instance variables.
@param badgeNumber1 instance variable for the badge number of the officer.
@param firstName1 instance variable for the first name of the officer.
@param lastName1 instance variable for the last name of the officer.
*/
  public PoliceOfficer(String badgeNumber1, String firstName1, String lastName1)
    {
       badgeNumber = badgeNumber1;
       firstName = firstName1;
       lastName = lastName1;
    }
/**
PoliceOfficer construcor assigns the to above mentioned fields
to an instance object.
@param object an instance object.
*/

   public PoliceOfficer(PoliceOfficer object)
    {
       badgeNumber = object.badgeNumber;
       firstName = object.firstName;
       lastName = object.lastName;
    }
/**
The toString method stores the output to a local variable.
@return policeDetails local variable which holds the output.
*/
   public String toString()
    {
       String policeDetails = "\n Name: " + firstName + " " + lastName +
                              "\n Badge Number: " + badgeNumber + '\n';

       return policeDetails;
    }
  }