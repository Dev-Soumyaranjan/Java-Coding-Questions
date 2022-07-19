import java.util.*;

/*
 * Write a program in java to check whether the entered number given by the user even or odd.
 */
public class Check_Even_Odd {

    public static void main(String[] args) {
        //Declaring scanner class object inorder to get the input from the user
         Scanner input = new Scanner(System.in);
        //Taking user input
        System.out.println("Enter a number:");
        int number = input.nextInt();
        /*
         * Here when we divide a number by 2 we always get a integer number
         * because in java when we divide an integer by an integer we get an integer
         * number.
         * So if number will be an odd number then we won't get fractional part.
         * e.g
         * number = 5
         * number / 2 = 2.5
         * but in res 2 will be stored
         */
        int res = number/2; //Storing the quotient value in res
        //Multiply 2 with res and storing the value in check
        int check = res*2;
        if(number == check){
            System.out.println(number+" is an even number.");
        }else{
            System.out.println(number+" is an odd number.");
        }
        input.close();
    }
}
