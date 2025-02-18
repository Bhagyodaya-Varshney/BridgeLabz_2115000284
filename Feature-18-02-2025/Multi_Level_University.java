import java.util.*;

class Multi_Level_University{
	public static void main(String[]args){
		Course <ExamCourse> ec = new Course<>();
		ec.addCourse(new ExamCourse("Chemistry"));
		ec.addCourse(new ExamCourse("Physics"));
		ec.addCourse(new ExamCourse("Mathmatics"));
		Course.displayCourse(ec.getCourseList());
		
		Course<AssignmentCourse> ac = new Course<>();
        ac.addCourse(new AssignmentCourse("DSA"));
        ac.addCourse(new AssignmentCourse("DIP"));
		Course.displayCourse(ac.getCourseList());


        Course<ResearchCourse> rc = new Course<>();
        rc.addCourse(new ResearchCourse("NLP"));
        rc.addCourse(new ResearchCourse("DAA"));
		Course.displayCourse(rc.getCourseList());

	}
}
abstract class CourseType{
	private String courseName;
	CourseType(String courseName){
		this.courseName = courseName;
	}
	
	public String getCourseName(){
		return courseName;
	}
}
class ExamCourse extends CourseType{
	ExamCourse(String courseName){
		super(courseName);
	}
}
class AssignmentCourse extends CourseType{
	AssignmentCourse(String courseName){
		super(courseName);
	}
}
class ResearchCourse extends CourseType{
	ResearchCourse(String courseName){
		super(courseName);
	}
}
class Course<T extends CourseType>{
	private List<T> courseList = new ArrayList<>();
	void addCourse(T course){
		courseList.add(course);
	}
	List<T> getCourseList(){
		return courseList;
	}
	public static void displayCourse(List<? extends CourseType> list){
		for(CourseType c : list)
			System.out.println("Course: "+c.getCourseName());
	}
}