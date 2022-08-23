//Write a program in java to find all the Prime numbers in a given interval
import java.util.Scanner;
/*
 * Given two integer inputs for the range or the interval for the search. The objective is to search and find 
 * all the Prime Numbers that lay in the given interval or range. To do so we’ll iterate through the numbers and 
 * check whether or not they are prime simultaneously. We’ll use loops to check whether the number has any factors 
 * other than 1 and the number itself.
 * 
 * Example-1: 
 *  FirstRange = 1
 *  LastRange = 10
 * Output: 
 * 2,3,5,7
 * 
 * 
 */
public class Prime_Number_Given_Range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first range:");
        int firstRange = input.nextInt(); // Taking first range from the user
        System.out.println("Enter second range:");
        int secondRange = input.nextInt(); // Taking second range from the user
        /*
         * Condition for checking range greater than zero or not
         * because 0 is neither prime number nor composite number
         * and negative numbers can't be prime number.
         */
        if ((firstRange <= 0) | (secondRange <= 0)) {
            System.out.println("Both ranges should be greater than 0👈");
        } else {
            System.out.println("Prime numbers between " + firstRange + " and " + secondRange + " are: ");
            // i will start from first range and ends in second range
            for (int i = firstRange; i <= secondRange; i++) 
            {
                // initializing flag with true
                boolean flag = true;
                /*
                 * Since 1 is not a prime number so I set flag as false
                 * If we won't set flag as false for 1 then it will be treated as prime number,because
                 * we set flag value true by default and when second for loop will start then condition will be false
                 * because 2 is not smaller than equal to 0.5(Second for loop condition:[int j = 2; j <= i / 2; j++] )
                 * then flag value will be true(as flag default value is true) because second for loop did not run 
                 * so it will print 1 as prime number.
                 * 
                 */
                if(i == 1)
                    flag = false;
                /*
                 * j will start from 2 and will end at half of the i,after i/2
                 * there will be no number which can completely divide i
                 */
                for (int j = 2; j <= i / 2; j++) {
                    /*
                     * In each iteration we will check is i completely divisible by j or not
                     */
                    if (i % j == 0) {
                       // If i is divisible by j then set flag to false
                        flag = false; 
                        // If condition will meet then break the loop
                        break;
                    }
                }
                /*
                 * if flag is true then number is prime number
                 * because as we know prime number has at most two multiples(1 and the number
                 * itself)
                 * but we start j(which will divide i(number)) from 2 which means if no
                 * number(here j) will divide i then it will be prime number.
                 *
                 * By default, we set flag as true so if j will divide i then flag will become
                 * false which means that number is not a prime number because if it was a prime number then no
                 * number would be divide i.
                 */
                if (flag)
                    System.out.print(i + " ");// if flag is true print this line
            }
        }
        input.close();

    }
}
