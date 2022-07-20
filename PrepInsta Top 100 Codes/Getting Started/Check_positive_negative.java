import java.util.Scanner;

/*
*  This is a java program to check whether the number entered by the user is positive or negative.
*  The number is demonstrated as positive or negative by comparing the entered number with the Zero(0).
*  If the number entered by the user is greater than zero, then the number is positive, else if the
*  number is less than zero,then the number is negative and else the number is zero.
*/
public class Check_positive_negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if (number < 0)// Checking number is smaller than zero or not
        {
            System.out.println("This is a negative number.");
        } else if (number > 0)// Checking number is greater than zero or not
        {
            System.out.println("This is a positive number.");
        } else {
            System.out.println("You entered zero!which is neither positive nor negative😜");
        }
        input.close();
    }
}
