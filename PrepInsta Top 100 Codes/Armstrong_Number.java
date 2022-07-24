import java.util.Scanner;

public class Armstrong_Number {
     public static void main(String[] args) {
        // first we have to give a input number using the Scanner class also we have to import the package of Scanner class
        Scanner sc=new Scanner(System.in);      
        System.out.println("Enter a number");
        int n=sc.nextInt();
        // we have to store the value of 'n' in a variable 'temp' because with every iteration the value of 'n' will be change.
        int temp=n; 
        // we have to declare the a variable 'sum' in which we will store the sum of the cube of each digit of 'n'
        int sum=0;
        // we have to declare the variable 'rem' in which we will store the remainder of the division of 'n' by 10
        int rem;
        // now we will start our while loop to get the sum of the cube of each digit of 'n'
        while(n>0)
        {
            // we have to store the remainder of the division of 'n' by 10 in the variable 'rem'
            rem=n%10;
            // we have to store the cube of 'rem' in the variable 'sum'
            sum=sum+(rem*rem*rem);
            // we have to decrease the value of 'n' by 1
            n=n/10;
        }
        // now we will check if the value of 'sum' is equal to the value of 'temp' or not
        if(sum==temp)
        {
            // if the value of 'sum' is equal to the value of 'temp' then we will print the message
            System.out.println("The number is an Armstrong number");
        }
        else
        {
            // if the value of 'sum' is not equal to the value of 'temp' then we will print the message
            System.out.println("The number is not an Armstrong number");
        }
     }   
}
