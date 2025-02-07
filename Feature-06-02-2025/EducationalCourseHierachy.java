class EducationalCourseHierachy{
	public static void main(String[]args){
		Course course = new Course("Java Basics", 6);
        course.displayCourseDetails();
        
        OnlineCourse onlineCourse = new OnlineCourse("ReactJS Fundamentals", 8, "Udemy", true);
        onlineCourse.displayCourseDetails();
        
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Machine Learning", 12, "Coursera", false, 200, 20);
        paidCourse.displayCourseDetails();
	}
}
class Course{
	private String courseName;
	private int courseDuration;
	Course(String courseName, int courseDuration){
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}
	public void displayCourseDetails(){
		System.out.println("Course Name: "+courseName+" Course Duration: "+courseDuration);
	}
}
class OnlineCourse extends Course{
	private String platform;
	private boolean isRecorded;
	OnlineCourse(String courseName, int courseDuration, String platform, boolean isRecorded){
		super(courseName, courseDuration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	public void displayCourseDetails(){
		super.displayCourseDetails();
		System.out.println("Course Platform: "+platform+" Course isRecorded: "+isRecorded);
	}
}
class PaidOnlineCourse extends OnlineCourse{
	private int fee;
	private double discount;
	PaidOnlineCourse(String courseName, int courseDuration, String platform, boolean isRecorded, int fee, double discount){
		super(courseName, courseDuration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	public void displayCourseDetails(){
		super.displayCourseDetails();
		System.out.println("Course Fee: "+fee+" Course Discount: "+discount);
	}
}