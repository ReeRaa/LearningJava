package Misc;

public class Student {
    String name;
    int age;
    static String school="TTÜ";
    int counter1=0;
    static int counter2=0;

    //constructor

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    //printer
    void show(){
        System.out.println("Student name "+name+" Student age: "+age+" School: "+school+" counter 1 value: "+counter1+" counter 2 value: "+counter2);
    }

    void increaseCounter(){
        counter2++;
        System.out.println("Student name "+name+" Student age: "+age+" School: "+school+" counter 1 value: "+counter1+" counter 2 value: "+counter2);
    }




    public static void main (String[] args){
        Student s1=new Student("Karl",21);
        Student s2=new Student("Pear",20);
        Student s3=new Student("See counter!",20);

        s1.show();
        s2.show();
        s3.increaseCounter();
    }
}
