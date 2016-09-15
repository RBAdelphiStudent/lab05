
/**
 * PersonCreator creates an object of a Person class and registers their information as it is entered. It checks for invalid answers.
 * 
 * @author Ryan Barrett
 * @version 1.0
 */
public class PersonCreator
{
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private int height;
    private int weight;
    private String socialSecurityNumber;
    private String address;
    private String phoneNumber;
   private String birthday;
    /**
     * Creates a person and gives them a name and surname.
     * The method's input consists of two Strings, a name and a surname.
     * The method constructs a new PersonCreator class (a person)
     * and initializes their first and last names (firstName and lastName
     * based on the input.
     * Example: The user enters these Strings
     * name=David
     * surname=Terrell
     * The class then sets firstName to equal "David" and lastName to equal "Terrell".
     */
    public PersonCreator(String name, String surname){
        firstName=name;
        lastName=surname;
    }
    /**
     * Assigns a person an age in years entered by the user.
     * The function's input consists of a single integer (yearsOld).
     * The method changes the person's age to match this number.
     * Example: If the user enters 22 and assigns it to yearsOld, the age (field value)
     * of the person being created  will be changed to 22 (age).
     */
    public void assignAge(int yearsOld){
        age=yearsOld;
    }
    /**
     * Assigns the person the male sex.
     * This method has no user input.
     * This method is meant to change the PersonCreator object's String sex to "Male".
     * Example: The user initializes the method; String sex is changed to "Male".
     */
    public void assignMale(){
        sex="Male";
    }
    /**
     * Assigns the person the female sex.
     * This method has no user input.
     * This method is meant to change the PersonCreator object's String sex to "Female".
     * Example: The user initializes the method; String sex is changed to "Female".
     */
    public void assignFemale(){
        sex="Female";
    }
    /**
     * Assigns the person a height in inches entered by the user.
     * In this method, the user enters a height in inches (int heightInInches).
     * The method sets the PersonCreator object's height to heightInInches.
     * Example: If the user enters 65, the PersonCreator object's height will be set to 65.
     */
    public void assignHeight(int heightInInches){
        height=heightInInches;
    }
    /**
     * Assigns the person a weight in pounds entered by the user.
     * In this method, the user enters a weight in pounds (int weightInPounds).
     * The method sets the PersonCreator object's weight to weightInPounds.
     * Example: If the user enters 142, the PersonCreator object's weight will be set to 142.
     */
    public void assignWeight(int weightInPounds){
        weight=weightInPounds;
    }
    /**
     * Assigns the person a SSN entered by the user if the SSN is valid.
     * The method has 3 ints as inputs, each representing a different part of the SSN.
     * The method checks if these ints are valid, and then combines them to create
     * the value of String socialSecurityNumber. If any of the values are invalid, the method
     * prints an error message.
     * Example: If the user entered 142, 28, and 6792 as the three input ints, the String
     * socialSecurityNumber would be set to "142-28-6792". If the last value was 99999 instead,
     * the system would produce an error message.
     */
    public void assignSSN(int ssn1, int ssn2, int ssn3){
        if(100 <=ssn1 && ssn1<=999 && 10<=ssn2 && ssn2<=99 && 1000<=ssn3 && ssn3<=9999){
            socialSecurityNumber=ssn1+"-"+ssn2+"-"+ssn3;
        }
        else{
            System.err.println("Please enter a valid social security number.");
        }
    }
    /**
     * Assigns the person an address entered by the user.
     * The user inputs String personAddress.
     * The method sets the PersonCreator's String address to personAddress.
     * Example: If the user enters "42 Godot Street" for personAddress, the PersonCreator object's
     * String address will be set to "42 Godot Street".
     */
    public void assignAddress(String personAddress){
        address=personAddress;
    }
    /**
     * Assigns the person a phone number entered by the user if the phone number is valid.
     * The method has 3 ints as inputs, each representing a different part of the phoneNumber.
     * The method checks if these ints are valid, and then combines them to create
     * the value of String phoneNumber. If any of the values are invalid, the method
     * prints an error message instead.
     * Example: If the user entered 516, 472, and 8447 as the three input ints, the String
     * socialSecurityNumber would be set to "516-472-8447". If the last value was 99999 instead,
     * the system would produce an error message.
     */
    public void assignPhoneNumber(int codeOfArea, int numberPrefix, int lastPart){
        if(100<=codeOfArea && codeOfArea<=999 && 100<=numberPrefix && numberPrefix<=999 && 1000<=lastPart &&lastPart<=9999){
            phoneNumber=codeOfArea+"-"+numberPrefix+"-"+lastPart;
        }
        else{
            System.err.println("Please enter a valid phone number.");
        }
    }
    /**
     * Assigns the person a birthday, birth month, and birth year entered by the user if they are all valid.
     * The user inputs three ints, monthMM, dayDD, and yearYYYY, which are all meant to represent components
     * of a birthday.
     * The method combines these ints to set the value of the PersonCreator object's String birthday.
     * Example: If the user entered 4, 6, and 1992 as monthMM, dayDD, and yearYYYY, the method would set String
     * birthday to "4/6/1992".
     */
    public void assignBirthday(int monthMM, int dayDD, int yearYYYY){
        if(1<=monthMM && monthMM<=12 && 1<=dayDD && dayDD<=31 && 1900<=yearYYYY && yearYYYY<=2016){
            birthday=monthMM+"/"+dayDD+"/"+yearYYYY;
        }
        else{
            System.err.println("Please enter a valid birthday.");
        }
    }
    /**
     * Prints the PersonCreator object's field values as the person's information.
     * This method has no inputs.
     * The method is meant to list all of the PersonCreator object's field values.
     * Say the object has these field values.
     * firstName=David;
     * lastName=Terrell;
     * sex=Male;
     * age=22;
     * height=72;
     * weight=165;
     * socialSecurityNumber="142-28-6792";
     * address="42 Godot Street";
     * phoneNumber="516-472-8447";
     * birthday="4/18/1994";
     * The method will print:
     * Name: David Terrell
     * Age: 22 years old
     * Sex: male
     * Height: 72 inches
     * Weight: 165 pounds
     * SSN: 142-28-6792
     * Address: 42 Godot Street
     * Phone Number 516-472-8447
     * Date of Birth: 04/18/1994
     */
    public void printPersonInformation(){
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Age: "+age+ " years old");
        System.out.println("Sex: "+sex);
        System.out.println("Height: "+height+" inches");
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("SSN: "+socialSecurityNumber);
        System.out.println("Address: "+address);
        System.out.println("Phone number: "+phoneNumber);
        System.out.println("Date of Birth: "+birthday);
    }
}
