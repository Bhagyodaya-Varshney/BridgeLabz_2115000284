class AnimalHierarchy{
	public static void main(String[]args){
		Animal dog = new Dog("James", 4);
        Animal cat = new Cat("Shila", 1);
        Animal bird = new Bird("Munni", 3);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
	}
}
class Animal{
	private String name;
	private int age;
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void makeSound(){
		System.out.println("Sounds By Animal");
	}
	public String getName(){
		return name;
	}
}
class Dog extends Animal{
	Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(getName() + " : Woof!");
    }
}
class Cat extends Animal{
	Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(getName() + " : Meow!");
    }
}
class Bird extends Animal{
	Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " : Tweet!");
    }
}