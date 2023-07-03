package claswork3;
import java.util.InputMismatchException;
import java.util.Scanner;

// Задача: Написать программу, которая запрашивает у пользователя
// два числа и выполняет деление первого числа на второе число.
// В случае деления на ноль, необходимо выбросить пользовательское
// исключение DivisionByZeroException.
public class Task6_1 {
    public static void main(String[] args) {
        try {
            int a = getInt("Введите первое число:");
            int b = getInt("Введите второе число:");

            System.out.println(divide(a, b));
        } catch (DivisionByZeroException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на 0");
        }
        return (double) a / b;
    }

    public static int getInt(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка: Введено некорректное число. Повторите ввод.");
                scanner.next(); // Очистка буфера сканера
            }
        }
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}

