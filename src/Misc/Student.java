package Misc;

public class Student {
    String name;
    int age;
    static String school="TTÜ";

    //constructor

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    //printer
    void show(){
        System.out.println("Student name "+name+" Student age: "+age+" School: "+school);
    }

    //input


    public static void main (String[] args){
        Student s1=new Student("Karl",21);
        Student s2=new Student("Pear",20);

        s1.show();
        s2.show();
    }
}
