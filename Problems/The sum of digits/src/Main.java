import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var n = scanner.nextInt();
        var a = n / 100;
        var b = (n % 100) / 10;
        var c = n % 10;
        System.out.println(a+b+c);
        scanner.close();
    }
}