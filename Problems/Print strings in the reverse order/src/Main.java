//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var first = scanner.nextLine();
        var second = scanner.nextLine();
        var third = scanner.nextLine();
        System.out.println(third+"\n"+second+"\n"+first);
        scanner.close();
    }
}