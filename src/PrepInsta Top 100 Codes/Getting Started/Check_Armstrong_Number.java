//Write a java program to check whether the given number is a armstrong number or not.
import java.util.Scanner;
/*
*Definition
* -----------
* A number is an Armstrong Number or narcissistic number if it is equal to the sum of its own digits raised to the power of the
* number of digits.
*
* Explanation of problem
* ------------------------
* Given an integer input, the objective is to check whether or not the number input is an Armstrong number or not.
* However, Armstrong number is any number following the given rule –
* abcd… = a^n + b^n + c^n + d^n + …
* Where n is the order(length/digits in number)
*
* Example
* Input : 371
* Output : It's an Armstrong Number.
* Explanation: 371 = 3^3 + 7^3 + 1^3
* Therefore it's an Armstrong number.
*
*
*/
public class Check_Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        //Taking user input
        int number = input.nextInt();
        //Calling checkArmstrongNumber method by passing number as parameter
        checkArmstrongNumber(number);
        input.close();
    }
    public static void checkArmstrongNumber(int number) {
        //create a variable sum and initialize it to 0
        int sum = 0;
        //create a variable temp and initialize it to number because  after while loop
        // number will be zero(because while loop will continue until number is zero) but we need original number to check Armstrong number.
        //This temp is required to find the total digits of the number.
        int temp = number;
        //Create a variable temp1 and initialize it to number.This variable is required to find the sum of number's digits raised to the power
        // of the number of digits.
        int temp1 = number;
        //Create a variable power in which we will store the total of digits
        int power = 0;
        //Finding the total digits of the number
        while (temp % 10 > 0) {
            //In each iteration temp%10 will extract each digit of the number and the value of the power will increase by 1
            power++;
            //it will shorten the number by 1 in each iteration
            temp = temp / 10;
        }
        //Logic of the armstrong number
        while (temp1 > 0) {
            int remainder1 = temp1 % 10;
            sum = (int) (sum + Math.pow(remainder1, power));
            temp1 = temp1/10;
        }
        //Checking original number is equal to the sum of its own digits raised to the power of the
        // number of digits or not
        if (sum == number) {
            //print "This is an Armstrong number"
            System.out.println("This is an Armstrong number");
        } else {
            //print "This is not an Armstrong number"
            System.out.println("This is not an Armstrong number");
        }
    }

}
