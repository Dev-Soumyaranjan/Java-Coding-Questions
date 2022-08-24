package Company_Coding_Round_Questions;
/*
* Problem statement:
* -------------------
* You are provided THREE four-digit numbers and a string as input.
* Let us call the THREE input numbers(input1,input2 and input3) as alpha,beta
* and gamma respectively.
* You are expected to find a PIN using the below calculation -
*   ((Largest digit of alpha x 2nd Largest digit of alpha) + (Largest digit of beta x 2nd
* Largest digit of beta) - (Largest digit of gamma x 2nd Largest digit of gamma)) x
* (Number of vowels in the string)
*
* Note: Below example illustrate how to determine the "Largest digit","2nd Largest
* digit", "2nd Smallest digit" and "Smallest digit" In a four-digit number.
*
* If the number is 2951
*   Largest digit = 9
*   2nd Largest digit = 5
*   2nd Smallest digit = 2
*   Smallest digit = 1
*
* Example:
* --------
* If input1 = 4679 input2=5028 input3=9119 input4="WipRo"
* PIN = ((Largest digit of alpha x 2nd Largest digit of alpha) + (Largest digit of beta x 2nd
 * Largest digit of beta) - (Largest gamma of alpha x 2nd Largest digit of gamma)) x
 * (Number of vowels in the string) = ((9x7) + (8x5) - (9x9))x(2) = (63 + 40 - 81) x (2) =
 * 22x2 = 44
*
* */
import java.util.*;
public class Find_PIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Taking input from the user
        System.out.println("input1");
        int input1 = input.nextInt();
        System.out.println("input2");
        int input2 = input.nextInt();
        System.out.println("input3");
        int input3 = input.nextInt();
        System.out.println("input4");
        String str = input.next();
        //Creating String variable and assigning the integer number to it by converting to string usin toString() method
        String temp1 = Integer.toString(input1);
        String temp2 = Integer.toString(input2);
        String temp3 = Integer.toString(input3);
        //Checking is entered number are four digits or not
        if(temp1.length() >4 ||
           temp2.length() >4 ||
           temp3.length() >4){
            System.out.println("Please enter four digits numbers.Try Again!!!");
        }else{
            //Declaring integer array with size 4 because according to question we have to enter four digits number
            int[] alpha = new int[4];
            int[] beta = new int[4];
            int[] gamma = new int[4];

            //For loop for assigning character of each string to their corresponding integer array.
            for(int i = 0; i< 4;i++){

              /*
               Uncomment it if you want to directly assign integer value of each character(i.e digit) of temp1,temp2 and temp3 to their corresponding integer array.
               After using this method you won't require subtracting ASCII value of 0 from the index of integer array to get the actual digit.


               alpha[i]=Character.getNumericValue(temp1.charAt(i));
               beta[i]=Character.getNumericValue(temp2.charAt(i));
               gamma[i]=Character.getNumericValue(temp3.charAt(i));
               */

                /*
                 * We have converted the input integer to String and stored inside temp1,temp2 and temp3
                 * respectively.And as we know strings are nothing but array of characters. And now each character is digit of input number.
                 *
                 * Now we will store each character(which is basically a digit) of  these strings to their corresponding integer array.
                 * And now inside the integer array ASCII value of each character(digit) will be store.
                 *
                 * For example:
                 *
                 * Let us understand by taking one input:
                 *
                 * input1 = 4679
                 * After we convert it to string,it becomes
                 * temp1 = "4679"
                 * Now we store each character(digit) of string into integer array
                 *
                 * index  0   1   2   3
                 * alpha[ 52, 54, 55, 57]
                 */
                alpha[i]=temp1.charAt(i);
                beta[i]=temp2.charAt(i);
                gamma[i]=temp3.charAt(i);

            }
            //Sorting the array to get the 1st and 2nd largest digit of the number
            Arrays.sort(alpha);
            Arrays.sort(beta);
            Arrays.sort(gamma);

            //Declaring noOfVowel variable which will store the number of vowel of the string
            int noOfVowel = 0;
            //Counting the number of vowel of the string
            for(int i = 0; i< str.length();i++){
                //If any of the character of the  given string(str) will match with any vowel then noOfVowel value will increase by 1
                if(str.charAt(i)=='a' ||
                        str.charAt(i)=='e' ||
                        str.charAt(i)=='i' ||
                        str.charAt(i)=='o' ||
                        str.charAt(i)=='u' ||
                        str.charAt(i)=='A' ||
                        str.charAt(i)=='E' ||
                        str.charAt(i)=='I' ||
                        str.charAt(i)=='O' ||
                        str.charAt(i)=='U'){
                    noOfVowel++;
                }
            }
            /*
            * Formula for finding PIN.
            * As we know inside integer array ASCII value of the input number's digit has stored,
            * So inorder to get the actual digit we need to subtract '0' from index of integer array
            *
            * Let us understand it with example:
            *
            * input = 4679
            * After converting input to string and sorting it and assigning to alpha(integer array),it will look like as follow:
            * index  0   1   2   3
            * alpha[ 52, 54, 55, 57]
            *
            * if i will subtract '0'(ASCII value of 0 i.e 48) then we will get the actual digit of corresponding ASCII value
            *
            * alpha[3] - '0'
            *     57   -  48   --------> 9
            * alpha[2] - '0'
            *     55   -  48   --------> 7
            * alpha[1] - '0'
            *     54   -  48   --------> 6
            * alpha[0] - '0'
            *     52   -  48   --------> 4
            */
            int pin = (((alpha[3]-'0') * (alpha[2]-'0')) + ((beta[3]-'0') * (beta[2]-'0')) - ((gamma[3]-'0') * (gamma[2]-'0')))*noOfVowel;
            //Printing PIN
            System.out.println("PIN = " + pin);

        }

    }
}
