import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        int max = -1;
        for (int i = 0; i < n; i++) {
            var input = sc.nextInt();
            if (input % 4 == 0 && input > max) {
                max = input;
            }
        }
        System.out.println(max);
        sc.close();
    }
}