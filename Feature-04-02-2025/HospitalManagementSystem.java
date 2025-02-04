class HospitalManagementSystem{
	public static void main(String[]args){
		Patient patient1 = new Patient("Bhagyodaya","Fever",21,10101);
		Patient patient2 = new Patient("Ayush","Flu",21,10102);
		
		patient1.displayDetails(patient1);
		patient2.displayDetails(patient2);
		
		Patient.getTotalPatients();
		
	}
}
class Patient{
	private static String hospitalName = "ABC Hospital";
	private String name, ailment;
	private int age;
	private final int patientId;
	private static int totalPatients = 0;
	
	Patient(String name, String ailment, int age, int patientId){
		this.name = name;
		this.ailment = ailment;
		this.age = age;
		this.patientId = patientId;
		totalPatients++;
	}
	public void displayDetails(Patient patient){
		if(patient instanceof Patient){
			System.out.println("Hospital Name: " + hospitalName);
			System.out.println("Patient Name: " + name);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient Age: " + age);
            System.out.println("Patient Id: " + patientId);
		}
	}
	public static void getTotalPatients(){
		System.out.println("Total Number of Patients are: "+totalPatients);
	}
}