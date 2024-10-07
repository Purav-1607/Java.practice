import java.util.Scanner;
public class Main {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a : ");
        int a = sc.nextInt();
    System.out.print("Enter b : ");
        int b = sc.nextInt();
        int resultSum = sum(a, b);
        int resultSubtract = subtract(a, b);
    System.out.println("Sum of " + a + " and " + b + " is: " + resultSum);
    System.out.println("Subtraction of " + a + " and " + b + " is: " + resultSubtract);
    }
}
