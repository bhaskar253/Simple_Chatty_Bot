import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var first = scanner.next();
        var second = scanner.next();
        var third = scanner.next();
        var fourth = scanner.next();
        System.out.println(first+"\n"+second+"\n"+third+"\n"+fourth);
        scanner.close();
    }
}