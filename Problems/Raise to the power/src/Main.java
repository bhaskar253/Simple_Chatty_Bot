import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        // write your code here
        long base = n;
        long power = m;
        long res = 1;
        while (power > 0) {
            if (power % 2 == 1) {
                res = res * base;
            }
            power /= 2;
            base = base * base;
        }
        return res;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}