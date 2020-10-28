package marina1027w4w2;

import java.util.ArrayList;
import java.util.Scanner;

//Drive Class
//Create three Instructor Object 
//Create four Course Object 
//Print () —————> Course name is ….. which takes. …… weeks.
//The Instructor of this course is  ………… who is (Junior Senior or something )
//with ……..year of experience. The Phone number of Instructor is ……..

//After Printing all Courses, Ask User to give the name of Instructor 
//and then you should return the name of course which this Instructor teaches. 
//		If we don`t have any courses Just Print
//		” This Instructor does not teach any courses” 

//arraylist 4courses 
//foreach

public class Driver {
	
	//Print () —————> Course name is ….. which takes. …… weeks.
	//The Instructor of this course is  ………… who is (Junior Senior or something )
	//with ……..year of experience. The Phone number of Instructor is ……..		
	public static void printCourses(ArrayList<Course> courseList) {
		for(Course c : courseList) {
			System.out.println("Course name is " + c.getCourseName() +
					"\nwhich takes " + c.getDuration() + " weeks" +
					"\nThe Instructor of this course is " + c.getInstructor() + 
					"\nWho is " + c.getStatus() + 
					" with " + c.getExperienceYear() + "year of experience. "
							+ "\nThe Phone number of Instructor is " + c.getPhoneNumber());
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Course> coursesList = new ArrayList<Course>();
		
		//Create three Instructor Object 
		Instructor instructor1 = new Instructor("Jane", "Li", 1234567891, 2);
		Instructor instructor2 = new Instructor("Sarah", "Smith", 1234567891, 4);		
		Instructor instructor3 = new Instructor("Mike", "Small", 1234567891, 3);
		
		//Create four Course Object 
		Course course1 = new Course("Math", 6, instructor1);
		Course course2 = new Course("Language", 8, instructor2);
		Course course3 = new Course("P.E.", 2, instructor3);
		Course course4 = new Course("Sience", 12, instructor1);
		
		coursesList.add(course1);
		coursesList.add(course2);
		coursesList.add(course3);
		coursesList.add(course4);

		//After Printing all Courses, Ask User to give the name of Instructor 
		//and then you should return the name of course which this Instructor teaches. 
//				If we don`t have any courses Just Print
//				” This Instructor does not teach any courses” 
		System.out.println("Enter the instructors last name > ");


		
		
	}
}