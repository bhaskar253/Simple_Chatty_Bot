import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        var sc = new Scanner(System.in);
        double m = sc.nextInt();
        var p = sc.nextInt();
        var k = sc.nextInt();
        var res = 0;
        while (k > m) {
            m += m * p / 100;
            res++;
        }
        System.out.println(res);
        sc.close();
    }
}