class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
}
public class UseOverride {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
