package home_work3;
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

import java.util.Scanner;
public class PowerCalculator1 {
    public static void main(String[] args) {
    try {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основание: ");
        double base = scanner.nextDouble();
        System.out.print("Введите степень: ");
        int exponent = scanner.nextInt();

        double result = calculatePower(base, exponent);
        System.out.println("Результат: " + result);
    } catch (InvalidInputException1 e) {
        System.out.println("Ошибка: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Произошла ошибка, вы ввели некорректные данные!");
    }
}
    public static double calculatePower(double base, int exponent) throws InvalidInputException1 {
        if (base == 0 || exponent < 0) {
            throw new InvalidInputException1("Вы ввели некорректные числа (основание = 0 или степень < 0)");
        }
        return Math.pow(base, exponent);
    }
}
    class InvalidInputException1 extends Exception {
        public InvalidInputException1(String message) {
            super(message);
        }
    }

