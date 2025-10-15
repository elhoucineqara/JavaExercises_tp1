package exercice2;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("El Houcine", 27, 1);
        s1.displayInfo();
        System.out.println("Is adult ? " + s1.isAdult());
        System.out.println();
        Student s2 = new Student("Oumar", 8, 2);
        s2.displayInfo();
        System.out.println("Is adult ? " + s2.isAdult());


    }
}
