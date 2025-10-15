package exercice2;

public class Student {
    String name;
    int age;
    int studentId;

    // Constructor
    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
    public void displayInfo(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public boolean isAdult(){
        return age >= 18;
    }
}
