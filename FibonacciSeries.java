/*an ecommerce website wishes to find the lucky customer who will be eligible for full value cashback. for this purpose, a number n is fed to the system. it will return another number that is calculated by an algorithm. in an algorithm, a sequence is generated, in which each number is the sum of the two preceding numbers. initially, the sequence will have two 1's in it. the system will return the nth number from the generated sequence which is treated as the order id. the lucky customer will be the one who has placed that order. write an algorithm to help the website find the lucky customer
*/
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if(n==0){
            return 0;
        }else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int temp;

            for (int i = 2; i <= n; i++) {
                temp = a+b;
                a = b;
                b = temp;
            }

            return b;
        }
    }
}