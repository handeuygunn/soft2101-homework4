import java.util.Scanner;

public class RangePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        if (first < second) {
            for (int i = first + 1; i < second; i++) {
                System.out.println(i);
            }
        } else if (first > second) {
            for (int i = second + 1; i < first; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("No numbers between equal values.");
        }

        scanner.close();
    }
}
