import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        while (n > 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n *= 3;
                n++;
            }
        }
        System.out.println(n);
        sc.close();
    }
}