import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        var N = sc.nextInt();
        var M = sc.nextInt();
        var K = sc.nextInt();
        System.out.println(((K%N == 0 && K/N < M) || (K%M == 0 && K/M < N))?"YES":"NO");
        sc.close();
    }
}