import java.util.*;

/*
 * Write a program in java to check whether the entered number given by the user even or odd.
 * We can do this program easily by using % (Modulo) operator but here  i try to do this program without 
 * using % operator.
 */
public class Check_Even_Odd {

    public static void main(String[] args) {
        //Declaring scanner class object inorder to get the input from the user
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
         //Taking user input
        int number = input.nextInt();
        /*
         * Here when we divide a number by 2 we always get a integer number
         * because in java when we divide an integer by another integer we get an integer
         * number as a result.
         * So if number will be an odd number then we won't get fractional part.
         * e.g
         * number = 5
         * number / 2 = 2.5
         * here in res only 2 will be stored and .5 will be ignored for above reason
         */
        int res = number/2; //Storing the quotient value in res
        //Multiply 2 with res and storing the value in check
        int check = res*2;
        //Comparing original number with check
        if(number == check){
            System.out.println(number+" is an even number.");
        }else{
            System.out.println(number+" is an odd number.");
        }
        input.close();
    }
}

