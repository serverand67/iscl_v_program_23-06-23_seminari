package homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

// Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет
// операцию возведения первого числа в степень второго числа. Если введены некорректные числа или
// происходит деление на ноль, необходимо обработать соответствующие исключения и вывести информативное
// сообщение об ошибке.
//Важно! С использованием принципа одного уровня абстракции!
//**В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(), выполняющий
// операцию возведения числа в степень. Если введено некорректное основание (ноль) и отрицательная степень,
// выбрасывается исключение InvalidInputException.
//
//В методе main() мы запрашиваем у пользователя основание и показатель степени, вызываем метод calculatePower()
// и выводим результат. Если введены некорректные числа или происходит ошибка ввода, соответствующие исключения
// перехватываются и выводится информативное сообщение об ошибке.
//
//Обратите внимание, что в этой задаче мы использовали собственное исключение InvalidInputException, чтобы явно
// указать на некорректный ввод. Это помогает разделить обработку ошибок на соответствующие уровни абстракции.**
public class PowerCalculator {
    public static void main(String[] args) {
        try {
            double base = getInt("Введите основание: ");

            int exponent = getInt("Введите степень: ");

            double result = calculatePower(base, exponent);
            System.out.println("Результат: " + result);
        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка");
        }
    }
    public static int getInt (String message){
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                try {
                    System.out.println(message);
                    return scanner.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Ошибка: Введено некорректное число. Повторите ввод.");
                    scanner.next();
                }
            }
        } finally {
            scanner.close();
        }
    }
    public static double calculatePower(double base, int exponent) throws InvalidInputException {
        if (base == 0 || exponent < 0) {
            throw new InvalidInputException("Вы ввели некорректные числа");
        }
        return Math.pow(base, exponent);
      }
    }
    class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
