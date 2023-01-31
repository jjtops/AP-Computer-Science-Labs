
public class UserProfile {
//defining all variables 
private String firstName; 
private String lastName; 
private String Email; 
private int Year; 
private String phoneNumber; 
private String Password1; 



	public UserProfile() {
		// TODO Auto-generated constructor stub
		firstName = ""; 
		lastName= "";
		Email = ""; 
		Year = 0;
		phoneNumber = ""; 
		Password1 = "";
	}
//first constructor class 
	public UserProfile(String fName, String lName, String _Email, int _Year, String _phoneNumber) {
		
		firstName = fName; 
		lastName = lName; 
		Email = _Email;
		Year = _Year; 
		phoneNumber = _phoneNumber; 
		Password1 = regenPassword(firstName, lastName);
		
		
		 
		
	}
	//second consttructor class	
	public UserProfile(String fName, String lName, String _Email) {
		
		firstName = fName; 
		lastName = lName; 
		Email = _Email;
		Password1 = regenPassword(firstName, lastName);
		
	
		
	}
//all of the get/set functions 	
//	public String getPassword() {
//		return Password1;
//	}
	
//	public void setPassword(String passwordIn) {
//		Password1 = passwordIn;
//	}
	
	
	
	public void setPassword1(String Password1In) {
		Password1 = Password1In;
	}
	
	public String getPassword1() {
		return Password1; 
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName(String firstNameIn) {
		firstName = firstNameIn;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setlastName(String lastNameIn) {
		lastName = lastNameIn;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String EmailIn) {
		Email = EmailIn;
	}
	
	public int  getYear() {
		return Year;
	}
	
	public void setYear(int YearIn) {
		Year = YearIn;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public void setphoneNumber(String phoneNumberIn) {
		phoneNumber = phoneNumberIn;
	}
	

	
	//regenerates password function 
	public String regenPassword(String suffix, String prefix) {

		Password1 =  "!" + suffix + ((int)(Math.random()*9990)+10) + prefix + ((int)(Math.random()*99990)+100) ; 
		return Password1;
	}
	
	
	
	
	
	//gets attributes from objects 

	//public String getAttributes() {
		
	//	return "Name: " + firstName + " " + lastName + "\nEmail: " + Email + "\nYear of Birth: " 
	//			+ Year + "\nPassword: ***** " + "\nPhone Number: " + phoneNumber 
	//			+ "\nPassword is " + Password + " but we will regenerate it" + "\n" 
	//			+ regenPassword(pre, suff);
	//}
	
	public String getAttribute() {
		
		return "Name: " + firstName + " " + lastName + "\nEmail: " + Email + "\nYear of Birth: " 
				+ Year + "\nPassword: ******" + "\nPhone Number: " + phoneNumber + 
				"\nPassword is " + Password1;
	}
	
	

}
