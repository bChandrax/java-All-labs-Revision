package lab5;

public class Student {
    private String name;
    private int age;
    private double gpa;

    Student(String name, int age, double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }

    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public double getGpa(){return this.gpa;}


}
