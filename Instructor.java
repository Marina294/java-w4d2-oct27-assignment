package marina1027w4w2;

//Instructor Class 
//first name 
//Last name 
//Phone number 
//Experience year

//getStatus () (With switch and case)————> if Experience year < 2 we have Junior Instructor 
//              If Experience year is between 2 and 4 we have Intermediate Instructor
//              More than 4 we have Senior Instructor 
//
//All the String should check for null and empty if it is null or empty put “Unknown”
//Year of experience should be more than 1 
//Duration of course should be more than 4 



public class Instructor {
	//first name 
	//Last name 
	//Phone number 
	//Experience year
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private int experienceYear;	
	
	public Instructor(String firstName, String lastName, int phoneNumber, int experienceYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setExperienceYear(experienceYear);
	}

	/*
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * @return firstName
	 */
	public String getLastName() {
		return lastName;
	}	
	
	/*
	 * @return phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}	

	/*
	 * @return experienceYear
	 */
	public int getExperienceYear() {
		return experienceYear;
	}
	
	//getStatus () (With switch and case)————> if Experience year < 2 we have Junior Instructor 
//  If Experience year is between 2 and 4 we have Intermediate Instructor
//  More than 4 we have Senior Instructor 
	
	public String getStatus(String experienceYear) {

		String yearsLevel;
	switch (experienceYear) {
			case1:
				yearsLevel = "We have Junior Instructor";
	     		break;					
			case2:
				yearsLevel = "We have Intermediate Instructor";
	     		break;	
			case3:
				yearsLevel = "We have Intermediate Instructor";
	     		break;	
			case4:
				yearsLevel = "We have Intermediate Instructor";
	     		break;	
			default:
				yearsLevel = "We have Senior Instructor";
	     		break;	
		
		}
	}
//	 public static void main(String[] args)  {
//		int years = 3;
//		String yearString;
//		switch (years) {
//		case 1: 
//			if(years < 2)
//			yearString = "We have Junior Instructor";
//	     break;
//		case 2: 
//			if(years >= 2 || years <= 4)
//				yearString = "We have Intermediate Instructor";
//	     break;
//		case 3:
//	     if(years > 4)
//				yearString = "We have Senior Instructor";
//	     break;
//		}
//	}	
//	
	
	//All the String should check for null and empty if it is null or empty put “Unknown”
	/*
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	
	/*
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	
	/*
	 * @param phoneNumber
	 */	
	public void setPhoneNumber(int phoneNumber) {
		if (phoneNumber > 1000000000) {
			this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = 0;
		}
	}
	
	//Year of experience should be more than 1 
	/*
	 * @param experienceYear
	 */	
	public void setExperienceYear(int experienceYear) {
		if (experienceYear > 1) {
			this.experienceYear = experienceYear;
		} else {
			this.experienceYear = 1;
		}
	}	
//	
//	/*
//	 * @param yearString
//	 */	
//	public static String getYearString() {
//		return yearString;
//	}
//	/*
//	 * @return yearString
//	 */
//	public static void setYearString(String yearString) {
//		Instructor.yearString = yearString;
}
