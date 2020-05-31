import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var sc = new Scanner(System.in);
        var a = sc.nextInt();
        var b = sc.nextInt();
        double sum = 0;
        var count = 0;
        while (a <= b) {
            if (a % 3 == 0) {
                sum += a;
                count++;
                a += 3;
            } else {
                a++;
            }
        }
        System.out.println(sum / count);
        sc.close();
    }
}