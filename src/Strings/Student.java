package Strings;

public class Student {
    int age;
    String fname;
    String lname;

    Student(int age, String fname,String lname){
        this.age=age;
        this.fname=fname;
        this.lname=lname;
    }

    public String toString(){
        return age+" "+fname+" "+ lname;
    }

    public static void main(String[] args) {
        Student s1=new Student(10,"Sweet","Mary");
        System.out.println(s1);
    }
}
