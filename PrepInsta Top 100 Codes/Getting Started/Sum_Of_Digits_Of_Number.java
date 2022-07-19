import java.util.Scanner;

/*
* Given an input integer as the number, our objective is to break down the number into its individual
* digits and sum them up together.
* To do so we’ll use the following two operators,
*     Modulo Operator % : We’ll use this to extract the digits from the number.
*     Divide Operator / : We’ll use it to shorten the number by 1 digit.
*Once we get the digits, we sum them up one by one with each iteration.
* */
public class Sum_Of_Digits_Of_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();// Taking number from the user
        int sum = 0;// Initializing sum with zero and in each iteration sum value will be updated with the digit of the number
        while (number != 0)// While loop will continue until number is 0
        {
            int rem = number % 10;// In each iteration remainder(digit) of the number will store in rem
            sum = sum + rem; // In each iteration sum value will be updated
            number = number / 10; // After each iteration number will shorten by 1 digit
        }
        System.out.println("Sum of the digits is: " + sum);// Printing the value of sum
        input.close();
    }

}
