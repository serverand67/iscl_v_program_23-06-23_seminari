package claswork3;
// не верно работает, в Task6_1 переделанно как правильно
import java.util.Scanner;

// Задача: Написать программу, которая запрашивает у пользователя
// два числа и выполняет деление первого числа на второе число.
// В случае деления на ноль, необходимо выбросить пользовательское
// исключение DivisionByZeroException.
public class Task6 {
    public static void main(String[] args) throws DivisionByZeroException1 {
        int a = getInt("Введите первое число:");
        int b = getInt("Введите второе число");
        try {
            System.out.println(divide(a, b));
        } catch (DivisionByZeroException1 ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double divide(int a, int b) throws DivisionByZeroException1 {

        if (b == 0) {
            throw new DivisionByZeroException1("Деление на 0");
        }
        return (double) a / b;
    }

    public static int getInt(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println(message);
                if (scanner.hasNextInt()) {
                    return scanner.nextInt();
                } else {
                    scanner.next();
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } return 0;
    }
}

class DivisionByZeroException1 extends Exception{
    public DivisionByZeroException1(String message) {
        super(message);

    }
}