import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var sc = new Scanner(System.in);
        var n = sc.nextInt();
        var i = 0;
        var ctr = 0;
        while (ctr < n) {
            i++;
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                if (++ctr == n) {
                    break;
                }
            }
        }
        sc.close();
    }
}