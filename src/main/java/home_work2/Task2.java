package home_work2;

import java.util.Scanner;

// Задача 2:
//Напишите программу, которая запрашивает у пользователя два числа
// и выполняет их деление. Если второе число равно нулю, программа
// должна выбрасывать исключение DivisionByZeroException с сообщением
// "Деление на ноль недопустимо". В противном случае, программа должна
// выводить результат деления.

// вариант 1
public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = iScanner.nextInt();
        int result = 0;

        try {
            if (number2 == 0) {
                throw new DivisionByZeroException();
            } else {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
        } catch (DivisionByZeroException ex) {
            System.out.println("Деление на ноль недопустимо");
        } finally {
            System.out.println("Выполнения блока finally");
        }
    }
}
class DivisionByZeroException extends Exception{
    }


