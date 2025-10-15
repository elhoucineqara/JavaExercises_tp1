package exercice1;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator c1 = new Calculator(17, 4);  // Calculator object

        // Display results
        System.out.println("Operand 1: " + c1.operand1);
        System.out.println("Operand 2: " + c1.operand2);
        System.out.println("Addition: " + c1.add());
        System.out.println("Subtraction: " + c1.subtract());
        System.out.println("Multiplication: " + c1.multiply());
        System.out.println("Division: " + c1.divide());
    }
}
