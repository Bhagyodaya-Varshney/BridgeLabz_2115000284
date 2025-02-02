public class Course{
	private String courseName;
	private int duration,fee;
	private static String instituteName;
	public Course(String courseName, int duration, int fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	public void displayCourseDetails(){
		System.out.println("Course Name: "+courseName);
		System.out.println("Course Duration: "+duration+" Yrs.");
		System.out.println("Course Fee: "+fee);
		System.out.println("Institute Name: "+instituteName);
	}
	public static void updateInstituteName(String updatedInstituteName){
		instituteName = updatedInstituteName;
	}
	public static void main(String[]args){
		Course.updateInstituteName("GLA University");
		Course course = new Course("B-Tech",4,8000000);
		course.displayCourseDetails();
		Course.updateInstituteName("Rajiv Academy");
		course.displayCourseDetails();
	}
}