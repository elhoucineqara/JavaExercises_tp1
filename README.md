# Java Exercises - TP1

This repository contains a collection of basic Java programming exercises designed to practice fundamental concepts including classes, methods, control structures, and user input.

## Project Structure

```
JavaExercises_tp1/
├── src/
│   ├── exercice1/    # Calculator
│   ├── exercice2/    # Student
│   ├── exercice3/    # Even/Odd Checker
│   └── exercice4/    # Multiplication Table
```

## Exercises Overview

### Exercise 1: Calculator

**Package:** `exercice1`  
**Files:** `Calculator.java`, `TestCalculator.java`

#### Description
A simple calculator class that performs basic arithmetic operations on two integer operands.

#### Features
- **Addition**: Adds two numbers
- **Subtraction**: Subtracts the second number from the first
- **Multiplication**: Multiplies two numbers
- **Division**: Divides the first number by the second (with zero-division protection)

#### Implementation Details
- The `Calculator` class stores two operands as instance variables
- Constructor initializes both operands
- All operations are implemented as methods
- Division returns a `double` for precision and handles division by zero

#### Usage Example
```java
Calculator c1 = new Calculator(17, 4);
System.out.println("Addition: " + c1.add());           // 21
System.out.println("Subtraction: " + c1.subtract());   // 13
System.out.println("Multiplication: " + c1.multiply()); // 68
System.out.println("Division: " + c1.divide());        // 4.25
```

---

### Exercise 2: Student Management

**Package:** `exercice2`  
**Files:** `Student.java`, `TestStudent.java`

#### Description
A student information management system that stores and displays student data.

#### Features
- Store student information (name, age, student ID)
- Display complete student information
- Check if a student is an adult (age ≥ 18)

#### Implementation Details
- The `Student` class has three attributes: `name`, `age`, and `studentId`
- Constructor initializes all student attributes
- `displayInfo()` method prints student details
- `isAdult()` method returns `true` if age is 18 or above

#### Usage Example
```java
Student s1 = new Student("El Houcine", 27, 1);
s1.displayInfo();
System.out.println("Is adult? " + s1.isAdult());  // true

Student s2 = new Student("Oumar", 8, 2);
s2.displayInfo();
System.out.println("Is adult? " + s2.isAdult());  // false
```

---

### Exercise 3: Even/Odd Checker

**Package:** `exercice3`  
**File:** `EvenOddChecker.java`

#### Description
An interactive program that checks whether a user-entered number is even or odd.

#### Features
- Accept user input from the console
- Determine if the number is even or odd
- Display the result

#### Implementation Details
- Uses `Scanner` class for user input
- Applies modulo operator (`%`) to check divisibility by 2
- If `number % 2 == 0`, the number is even; otherwise, it's odd

#### Usage Example
```
Enter an integer number: 42
The number 42 is even.
```

```
Enter an integer number: 15
The number 15 is odd.
```

---

### Exercise 4: Multiplication Table

**Package:** `exercice4`  
**File:** `MultiplicationTable.java`

#### Description
An interactive program that generates and displays the multiplication table for a user-specified number.

#### Features
- Accept a number from the user
- Generate multiplication table from 1 to 10
- Display formatted results

#### Implementation Details
- Uses `Scanner` class for user input
- Employs a `for` loop to iterate from 1 to 10
- Formats and displays each multiplication result

#### Usage Example
```
Enter an integer number: 7
Multiplication table of 7:
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
```

---

## Compilation and Execution

### Compile All Exercises
```bash
cd src
javac exercice1/*.java exercice2/*.java exercice3/*.java exercice4/*.java
```

### Run Individual Exercises
```bash
java exercice1.TestCalculator
java exercice2.TestStudent
java exercice3.EvenOddChecker
java exercice4.MultiplicationTable
```


## Author

EL HOUCINE QARA - Master TNPEIC S3
