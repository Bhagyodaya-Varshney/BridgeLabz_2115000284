class RestaurantManagementSystem{
	public static void main(String[]args){
		Chef chef = new Chef("Kunal Chaudhary", 100101, "North Indian");
        Waiter waiter = new Waiter("Anuj Choudhary", 100102, 10);

        chef.displayInfo();
        chef.performDuties();

        waiter.displayInfo();
        waiter.performDuties();
	}
}
class Person {
    private String name;
    private int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("Person ID: " + id + ", Person Name: " + name);
    }
}
interface Worker {
    void performDuties();
}
class Chef extends Person implements Worker {
    private String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println(getName() + " is cooking " + specialty);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef, Specialty: " + specialty);
    }
}
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println(getName() + " is serving " + tablesAssigned + " tables.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter, Tables Assigned: " + tablesAssigned);
    }
}