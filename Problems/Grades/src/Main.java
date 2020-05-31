import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        for (int i = 0; i < size; i++) {
            var input = sc.nextInt();
            if (input == 2) {
                d++;
            } else if (input == 3) {
                c++;
            } else if (input == 4) {
                b++;
            } else if (input == 5) {
                a++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
        sc.close();
    }
}