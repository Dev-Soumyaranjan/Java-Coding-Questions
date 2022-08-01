import java.util.Scanner;
/*
    A number is said to be armstrong number if it is equal to the sum of its own digits raised to the power of the number of digits in the given number.
 */
public class Armstrong_Number {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);      
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int temp=n;
        int temp1=n;
        int sum=0;
        int count=0;
        int rem;
        while(n>0)
        {
            // we have to decrease the value of 'n' by 1 and update the value of count by 1 with each iteration so that we can get the count of number of digits in the given number.
            count++;
            n=n/10;
        }
        while(temp>0){
            // we have to get the remainder of the given number after dividing it by 10.
            rem=temp%10;
            //now we will use the power function to get the value of the given number raised to the power of the count of number of digits in the given number and add it to the sum. 
            sum=sum+(int)(Math.pow(rem,count));
            temp=temp/10;
        }
        // now we will check if the value of 'sum' is equal to the value of 'temp1' or not , if it is equal then it is an armstrong number otherwise it is not.
        if(sum==temp1)
        {
            System.out.println("The number is an Armstrong number");
        }
        else
        {
            System.out.println("The number is not an Armstrong number");
        }
     }   
}
