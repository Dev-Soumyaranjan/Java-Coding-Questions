import java.util.Scanner;

/*
 * Write a program in java to check if a given number is prime or not
 * Definition🚀 :
 * 
 * A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers.
 *  
 * A natural number greater than 1 that is not prime is called a composite number. For example, 5 is prime because 
 * the only ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself
 * 
 * Sample input1: 2
 * Sample output1: 2 is a prime number
 * 
 * Sample input2: 4
 * Sample output2: 4 is not a prime number
 * 
 * 
 */
public class Check_Prime_Number {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = scn.nextInt(); // Taking number from the user
    // Checking number entered number is greater than 1 or not
    if (number > 1) {
      boolean result = checkPrime(number); // Store the return value of checkPrime() method
      if (result)
        System.out.println("This is a prime number"); // If result is true print this line
      else
        System.out.println("This is not a prime number"); // If result is false print this line
    } else {
       //Number one has no other factor than itself so number one is not a prime.
      if(number == 1)
         System.out.println("1 is not a prime number.");
      else
         System.out.println("You entered "+ number + " which is smaller than 1 so it is not a prime number😒!! Please enter a number bigger than 1💡");
    }
    scn.close();
  }

  public static boolean checkPrime(int n) {
    // Initializing flag(Variable) with true
    boolean flag = true; 
    /*
     * Basically here i are those numbers starting from 2 to (original number/2)-1,
     * for example:
     *     If we enter 10 then i will be 2 to 9
     * And in each iteration we will check which numbers(i) are completely dividing the original numbers.
     * We are doing so because we need factors.
     * 
     * 
     * The logic of the below code is very simple
     * 
     * As we know Numbers having only two factors i.e. 1 and the number itself are called prime numbers. 
     * 
     * So here we start i(numbers which will divide to original number in each iteration) from 2 and increasing i value till i value is (number/2)-1
     * that means we have not divide the number by 1 and number itself as it will always true so by default the original number has two factors i.e 1 and number itself.
     * 
     * So now if any value of i will divide the original number then flag value will be false and loop will be break. The reason is now the factors of number
     * has increased from 2 to 3 which clearly indicate the given number is not a prime number.
     */
    //Iteration will continue until i value is (number/2)-1 because we know after half of the number there will be no number remain which will divide number itself.
    for (int i = 2; i < n / 2; i++) {
      // Checking number is divisible by i or not
      if (n % i == 0) 
      {
        // If number will completely divisible by i then setting flag as false

        flag = false; 

        // If condition will meet then break the loop

        break; 
      }
    }
    //If no value of i will divide the number then true will be return that means number is a prime number because by default number had two factors i.e 1 and number itself
    return flag;
  }

}
