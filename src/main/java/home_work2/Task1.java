package home_work2;

import java.util.Scanner;
// Задача 1
// Напишите программу, которая запрашивает у пользователя число и проверяет,
// является ли оно положительным. Если число отрицательное или равно нулю,
// программа должна выбрасывать исключение InvalidNumberException с сообщением
// "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = iScanner.nextInt();

        try {
            myInput(number);
        } catch (InvalidNumberException ex){
            System.out.println("Ошибка: " + ex.getMessage());
        } finally {
            System.out.println("Выполнения блока finally");
        }
    }
    public static void myInput(int value) throws InvalidNumberException {
        if (value <= 0){
            throw new InvalidNumberException(value + " Некорректное число");
        }
        System.out.println("Число " + value + " корректно");
    }
}
class InvalidNumberException extends Exception{
    public InvalidNumberException(String message){
        super(message);
    }
}