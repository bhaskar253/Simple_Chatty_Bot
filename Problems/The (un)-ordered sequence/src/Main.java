import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var numA = scanner.nextInt();
        var numB = scanner.nextInt();
        var isIncreasingOrder = numA <= numB;
        var res = true;
        while (scanner.hasNext()) {
            numA = numB;
            numB = scanner.nextInt();
            if (numB == 0) {
                break;
            }
            if (isIncreasingOrder && numA > numB
                    || !isIncreasingOrder && numA < numB) {
                res = false;
                break;
            }
        }
        System.out.println(res);
        scanner.close();
    }
}