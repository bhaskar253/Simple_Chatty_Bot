import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var sc = new Scanner(System.in);

        while (sc.hasNext()) {
            var n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println((n % 2 == 0) ? "even" : "odd");
        }

        sc.close();
    }
}