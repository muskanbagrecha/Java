package src.oops.inheritance;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow!!");
    }
}
