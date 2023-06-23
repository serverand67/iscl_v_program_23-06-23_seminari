package home_work1;
import java.util.Scanner;
public class Divide0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextInt();

        System.out.print("Введите число b: ");
        double b = scanner.nextInt();

        try {
            System.out.println(a + " / " + b + " = " + a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Попытка деления на ноль");
        }
    }
}
