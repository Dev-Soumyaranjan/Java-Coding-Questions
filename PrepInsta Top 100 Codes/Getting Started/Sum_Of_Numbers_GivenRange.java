import java.util.Scanner;

/*
 * This program demonstrates the sum of numbers between a given range. 
 * The user is prompted to enter the starting number and ending number.
 * The program will then calculate the sum of all numbers between the starting and ending number.
 * 
 * For example:
 * 
 * Sample Input:
 *    Enter the starting number: 1
 *    Enter the ending number: 10
 * sample Output:
 *    Sum of the numbers between 1 and 10 is: 55
 * Explanation:
 * 
 * The sum of the numbers between 1 and 10 is equal to the sum of the numbers 1, 2, 3, 4, 5, 6, 7, 8, 9 and 10.
 * i.e  1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
 * 
 * 
 */
public class Sum_Of_Numbers_GivenRange {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the starting number:");
    int startingNumber = input.nextInt(); // Taking starting number from the user.
    System.out.println("Enter the ending number:");
    int endingNumber = input.nextInt(); // Taking ending number from the user.
    //Checking if the starting number is greater than the ending number.If it is, then the program will exit.
    if(startingNumber > endingNumber){
        System.out.println("Ending number should be greater than starting number.🙂");
     }else if(startingNumber == 0 && endingNumber == 0){
        System.out.println("Starting number and ending number should be greater than 0.");
    }else{
       /* Calling the sumOfNumbers() method and passed the first number and second number as parameter*/
       sumOfNumbers(startingNumber, endingNumber);
    }

    input.close();
}

static void sumOfNumbers(int firstNumber, int lastNumber) {
    int sum = 0; // Initialize sum with zero.
    // The value of i ranges from firsNumber to lastNumber.
    for (int i = firstNumber; i <= lastNumber; i++) {
        sum = sum + i; // In each iteration,the sum value will be updated.
    }
    System.out.print("Sum of ");
    //Print the all numbers between firstNumber and lastNumber including firstNumber and lastNumber itself.
    for (int i = firstNumber; i <= lastNumber; i++) {
        // It will check which is last number.Here lastNumber is last number, so it will print '=' instead of '+'symbol.
        if (i == lastNumber) {
            System.out.print(i + " = "); // After last number '=' symbol will be print.
            break; //After printing the last number,the loop will be break and control will jump out from the loop.
        }
        System.out.print(i + " + "); // Printing '+' symbol in between two numbers.
    }
    System.out.print(sum);// Printing the value of sum.

}
}
