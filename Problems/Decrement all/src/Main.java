import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        System.out.println((scanner.nextInt() - 1) + " " + (scanner.nextInt() - 1) + " " + (scanner.nextInt() - 1) + " " + (scanner.nextInt() - 1));
        scanner.close();
    }
}