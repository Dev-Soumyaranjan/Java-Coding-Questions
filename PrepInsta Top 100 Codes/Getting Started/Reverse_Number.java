import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();// Taking number from the user
        // Calling reverseTheNumber() which will return reverse number of the entered
        // number
        System.out.println("Reverse of the entered number is: " + reverseTheNumber(number));
        input.close();

    }

    public static int reverseTheNumber(int number) {
        int rev = 0; // initializing rev with 0;
        while (number != 0) {
            int rem = number % 10; // Storing remainder of the number in rem
            rev = rev * 10 + rem; // In each iteration value of rev will get updated
            number = number / 10; // In each iteration number will shorten by 1 digit
        }
        return rev; // Returning reverse of the entered number
    }
}
/*
 * Explanation of the above code:=
 * ---------------------------------
 * Declaring and initializing the rev variable in which the reverse form of the
 * number will be store
 *
 * rev = 0;
 *
 * number = 123(suppose)
 *
 * While loop
 * ************
 * 1st iteration
 * --------------
 * int rem = number % 10;(123 % 10)
 * --> rem = 3
 * rev = rev * 10 + rem; (o * 10 + 3)
 * --> rev = 3
 * number = number / 10; (123 / 10)
 * --> number = 12
 * ====================================
 * So after first iteration
 * rem = 3
 * rev = 3
 * number = 12
 * ====================================
 * 2nd iteration
 * --------------
 * int rem = number % 10;(12 % 10)
 * --> rem = 2
 * rev = rev * 10 + rem; (3 * 10 + 2)
 * --> rev = 32
 * number = number / 10; (123 / 10)
 * --> number = 1
 *
 * ====================================
 * So after second iteration
 * rem = 2
 * rev = 32
 * number = 1
 * ====================================
 * 3rd iteration
 * --------------
 * int rem = number % 10;(1 % 10)
 * --> rem = 1
 * rev = rev * 10 + rem; (32 * 10 + 1)
 * --> rev = 321
 * number = number / 10; (123 / 10)
 * --> number = 0
 *
 *
 * After third iteration while loop will break because condition will false.
 */
