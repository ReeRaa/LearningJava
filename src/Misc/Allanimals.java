package Misc;

public class Allanimals {
    public static void main(String[] args) {
        Animal doggy=new Dog();
        Animal catty=new Cat();

        doggy.name="Swarts";
        catty.name="Bully";

        doggy.bark();
        catty.bark();

        ((Dog) doggy).move();
        Dog d=new Dog();
        d.name="Mops";
        d.bark();
    }
}
