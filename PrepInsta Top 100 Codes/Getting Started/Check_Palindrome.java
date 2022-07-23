//Wrtite a java program to check whether an entered number is a palindrom or not

//Importing scanner class inorder to use nextInt() method for taking input from user
import java.util.Scanner;

/*
* We are given an integer input as the number, the objective is to check whether or not the given number is a palindrome.
* To do so, we’ll first reverse the string input using loops and check if it matches the original number.
* If it matched then the given input number is a palindrome number
*
* Example-1
* -------
* Input : 121
* Output : This is a palindrome number

* Example-2
* -------
* Input : 369
* Output : This is not a palindrome number
*
* */
public class Check_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();// Taking input from the user
        // If isPalindrome() method returns true then the number is palindrome and if it
        // returns false then it is not
        if (isPalindrome(number))
            System.out.println("This is a palindrome number");
        else
            System.out.println("This is not a palindrome number");
        input.close();
    }

    public static boolean isPalindrome(int number) {
        /*
         * Declaring and initializing flag variable with false
         * if number will not palindrome then flag will return false
         */
        boolean flag = false;
        /*
         * Storing number in temp variable because
         * after while loop number will be zero(because while loop will continue until
         * and unless number is zero)
         * But after while loop we need to check reverse number with original number
         * That's why first we store the number in temp variable so that after
         * completion of while loop
         * we can compare temp with reverse number
         */
        int temp = number;
        // Initializing rev variable with zero and after while loop the reverse of the
        // number will store in rev
        int rev = 0;
        //Logic for reverse a number
        while (number != 0) {
            int rem = number % 10;// Storing remainder of the number in rem
            rev = rev * 10 + rem;// In each iteration value of rev will get updated according to the given formula
            number = number / 10;// In each iteration number will shorten by 1 digit

        }
        /*
         * Checking reversed value of number with original number(here we have stored
         * value of number in temp)
         * if rev match with temp then update flag from false to true means the entered
         * number is palindrome
         * because the reverse of the given number matched with original number
         */
        if (rev == temp)
            flag = true;
        /*
         * Returning flag,if rev will not match with temp then default value of flag
         * will return which is false
         * and if it will match then true will return.
         */
        return flag;
    }
}