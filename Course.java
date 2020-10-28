package marina1027w4w2;

//Course Class
//Course name 
//Duration 
//Instructor 
//All the String should check for null and empty 
//　　if it is null or empty put “Unknown”
//Year of experience should be more than 1 
//Duration of course should be more than 4 

public class Course {
	private String courseName;
	private int duration;
	private instructor instructor;
	private int experienceYear;	

	
		public Course(String courseName, int duration, instructor instructor) {
			setCourseName(courseName);
			setDuration(duration);
			setInstructor(instructor);
		}
		
		public void setCourseName(String courseName) {
		if (courseName == "" || courseName == null) {
			this.courseName = "Unknown";
		} else {
			this.courseName = courseName;
		}

		public void setDuration(int duration) {
		if (duration < 4) {
			this.duration = 4;
		} else {
			this.duration = duration;	
		}
		
		
		public void setInstructor(instructor instructor) {
			this.instructor = instructor;	
		}		
		
//		if (instructor == "" || instructor == null) {
//			this.instructor = "This Instructor does not teach any courses";
//		} else {
//			this.instructor = instructor;
//		}
	
		
		 /*
	     * @return courseName 
	     */
		public String getCourseName() {
			return this.courseName;
		}
		public int getDuration() {
			return this.duration;
		}		
		public instructor getInstructor() {
			return this.instructor;
		}				
		
		public int getExperienceYear() {
			return this.experienceYear;
		}						
}