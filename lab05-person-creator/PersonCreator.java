
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
    private int socialSecurityNumber1;
    private int socialSecurityNumber2;
    private int socialSecurityNumber3;
    private String address;
    private int areaCode;
    private int prefix;
    private int last;
    private int birthMonth;
    private int birthYear;
    private int birthDay;
    /**
     * Creates a person and gives them a name and surname.
     */
    public PersonCreator(String name, String surname){
        firstName=name;
        lastName=surname;
    }
    /**
     * Assigns a person an age in years entered by the user.
     */
    public void assignAge(int yearsOld){
        age=yearsOld;
    }
    /**
     * Assigns the person the male sex.
     */
    public void assignMale(){
        sex="Male";
    }
    /**
     * Assigns the person the female sex.
     */
    public void assignFemale(){
        sex="Female";
    }
    /**
     * Assigns the person a height in inches entered by the user.
     */
    public void assignHeight(int heightInInches){
        height=heightInInches;
    }
    /**
     * Assigns the person a weight in pounds entered by the user.
     */
    public void assignWeight(int weightInPounds){
        weight=weightInPounds;
    }
    /**
     * Assigns the person a SSN entered by the user if the SSN is valid.
     */
    public void assignSSN(int ssn1, int ssn2, int ssn3){
        if(100 <=ssn1 && ssn1<=999 && 10<=ssn2 && ssn2<=99 && 1000<=ssn3 && ssn3<=9999){
            socialSecurityNumber1=ssn1;
            socialSecurityNumber2=ssn2;
            socialSecurityNumber3=ssn3;
        }
        else{
            System.err.println("That is not a valid social security number.");
        }
    }
    /**
     * Assigns the person an address entered by the user.
     */
    public void assignAddress(String personAddress){
        address=personAddress;
    }
    /**
     * Assigns the person a phone number entered by the user if the phone number is valid.
     */
    public void assignPhoneNumber(int codeOfArea, int numberPrefix, int lastPart){
        if(100<=codeOfArea && codeOfArea<=999 && 100<=numberPrefix && numberPrefix<=999 && 1000<=lastPart &&lastPart<=9999){
            areaCode=codeOfArea;
            prefix=numberPrefix;
            last=lastPart;
        }
        else{
            System.err.println("That is not a valid phone number.");
        }
    }
    /**
     * Assigns the person a birthday, birth month, and birth year entered by the user if they are all valid.
     */
    public void assignBirthday(int monthMM, int dayDD, int yearYYYY){
        if(1<=monthMM && monthMM<=12 && 1<=dayDD && dayDD<=31 && 1900<=yearYYYY && yearYYYY<=2016){
            birthMonth=monthMM;
            birthDay=dayDD;
            birthYear=yearYYYY;
        }
        else{
            System.err.println("That is not a valid birthday.");
        }
    }
    public void printPersonInformation(){
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Age: "+age+ " years old");
        System.out.println("Sex: "+sex);
        System.out.println("Height: "+height+" inches");
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("SSN: "+socialSecurityNumber1+"-"+socialSecurityNumber2+"-"+socialSecurityNumber3);
        System.out.println("Address: "+address);
        System.out.println("Phone number: "+areaCode+"-"+prefix+"-"+last);
        System.out.println("Date of Birth: "+birthMonth+"/"+birthDay+"/"+birthYear);
    }
}
