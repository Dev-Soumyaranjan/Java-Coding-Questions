//Write a java program to find out greater between two numbers
import java.util.Scanner;

public class Greatest_TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int firstNumber = sc.nextInt(); // Taking first number from the user
        int secondNumber = sc.nextInt();// Taking second number from the user
        checkGreaterUsingTernary(firstNumber, secondNumber);
        checkGreater(firstNumber, secondNumber);
        sc.close();
    }

    // Method to check greater between two numbers using if-else statement
    static void checkGreater(int Number_1, int Number_2) {
        if (Number_1 > Number_2) // Comparing Number_1 and Number_2
            System.out.println(Number_1 + " is greater than " + Number_2);
        else
            System.out.println(Number_2 + " is greater than " + Number_1);
    }

    // Method to check greater between two numbers using ternary operator
    static void checkGreaterUsingTernary(int FirstNumber, int SecondNumber) {
        int max = Math.max(FirstNumber, SecondNumber);
        /*
         * FirstNumber will be store into max if condition will be true
         * And SecondNumber will be store into max if condition will be false
         * 
         * We can use Math.max() method to compare two numbers.
         * If I do so then above line in which I have used ternary operator will be:
         *
         * int max = Math.max(FirstNumber>SecondNumber);
         */
        System.out.println(max + " is greater number.");
    }
}
