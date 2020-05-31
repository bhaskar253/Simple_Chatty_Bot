import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        var A = sc.nextInt();
        var B = sc.nextInt();
        var C = sc.nextInt();
        System.out.println(((A+B>C) && (B+C>A) && (C+A>B))?"YES":"NO");
        sc.close();
    }
}