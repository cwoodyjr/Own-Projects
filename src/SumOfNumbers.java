import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you wish to sum up to: ");
        int sumTo = scanner.nextInt();
        System.out.println(sumNumbers(sumTo));

    }

    public static int sumNumbers(int sumTo) {
        int sum = 0;
        for (int i = 0; i <= sumTo; i++) {
            sum = sum + i;
        }
        System.out.print("The Sum Total of " + sumTo + " is: ");
        return sum;
    }
}
