import java.sql.SQLOutput;

/** Coding: Java Intro
 Create your first program and execute it.

 Step 1: Create a new class with the name 'HelloWorld'.
 Step 2: Define the main method in your class.

 Step 3: In the main method, print the text 'Hello, Java!' to the console.
 Step 4: Save and run your program. Check if 'Hello, Java!' appears on the console.
 Step 5: Change the text you print to the console to 'Java is cool!'
  Step 6: Save and run your program again. Check if the modified text appears on the console.

 Coding: Operators
 Perform arithmetic operations and use variables in Java.

 Step 1: Declare two variables 'a' and 'b' of type int and assign them any integer values.
 Step 2: Add the values of 'a' and 'b' and store the result in a new variable 'sum'.
 Step 3: Print the value of 'sum' to the console, along with the text 'Sum: '.

 Coding: Relational Operators
 Perform arithmetic operations with different data types and use relational operators.

 Step 1: Perform arithmetic operations with two 'int' values (addition, subtraction, multiplication, division) and print the results on the console.
 Step 2: Compare 2 'int' values for: greater than, less than, equality, and print the results on the console.
 Step 3: Repeat steps 1 and 2, but this time use 'float' and 'double' values.
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Java is cool!");
        float a = 4.5f;
        double b = 8.5;

        double sum = (a+b);
        System.out.println("Sum: " + sum);


        System.out.println("Subtracrtion: " + (a-b));
        System.out.println("Multiplication: " + a*b);
        System.out.println("Division: " + b/a);

        boolean isGreater = b>a;
        boolean isSmaller = a<b;
        boolean isEqual = a==b;

        System.out.println("Greater than: " + isGreater);
        System.out.println("Less than: " + isSmaller);
        System.out.println("Equal: " + isEqual);
    }
}

