package home_work2;

import java.util.Scanner;
import java.util.InputMismatchException;
// Задача 2:
//Напишите программу, которая запрашивает у пользователя два числа
// и выполняет их деление. Если второе число равно нулю, программа
// должна выбрасывать исключение DivisionByZeroException с сообщением
// "Деление на ноль недопустимо". В противном случае, программа должна
// выводить результат деления.

// вариант 2
public class Task2_2 {
    public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            int number1, number2, result;

            while (true){
                try {
                    System.out.print("Введите первое число: ");
                    number1 = iScanner.nextInt();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Ошибка ввода, попробуйте еще раз");
                    iScanner.nextLine();
                }
            }
            while (true){
                try {
                    System.out.print("Введите второе число: ");
                    number2 = iScanner.nextInt();
                    if (number2 != 0){
                        break;
                    } else {
                        throw new DivisionByZeroException1();
                    }
                }catch (DivisionByZeroException1 ex){
                    System.out.println("Деление на ноль недопустимо");
                }
            }
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        }
    }
    class DivisionByZeroException1 extends Exception{
    }
