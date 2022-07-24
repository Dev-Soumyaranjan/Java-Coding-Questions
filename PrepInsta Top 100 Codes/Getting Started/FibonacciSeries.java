//Importing scanner class
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth term:");
        int n = input.nextInt();
        // Uncomment the below if you want to print fibonacci series within a given
        // number
        // Prerequisite:Replace the above print statement with "Enter the range upto
        // which you want to print fibonacci series"
        /*
         * for (int i = 0;fibo(i)<=n; i++) {
         * System.out.print(fibo(i)+",");
         * }
         */
        fibo(n);
        input.close();
    }

    public static void fibo(int n) {
        int prev = 0;
        int curr = 1;
        int next = 0;
        // * Uncomment this if you want to print fibonacci series within a given range.
        /*
         * if ( n == prev){
         * return prev;
         * }
         * if ( n == curr){
         * return curr;
         * }
         */
        System.out.print(prev + " , " + curr + " , ");
        for (int i = 2; i <= n; i++) {
            next = prev + curr;
            System.out.print(next + ",");
            prev = curr;
            curr = next;
        }
    }

}
