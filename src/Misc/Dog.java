package Misc;

public class Dog extends Animal {

    @Override
    public void bark(){
        System.out.println(name+ ": Wow - wow!");
        System.out.println("Hop!");

    }
    public void move(){
        System.out.println("Hop!");
    }
}
