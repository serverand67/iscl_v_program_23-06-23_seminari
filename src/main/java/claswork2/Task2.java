package claswork2;

import java.util.Scanner;

// Задача: Проверка правильности ввода пароля
//Напишите программу, которая запрашивает у пользователя пароль. Правила для пароля следующие:
//
//Длина пароля должна быть не менее 8 символов.
//Пароль должен содержать хотя бы одну заглавную букву.
//Пароль должен содержать хотя бы одну цифру.
//Пароль должен содержать хотя бы один специальный символ (!@#$%^&*).
//Если пользователь вводит неправильный пароль, программа должна выбрасывать
// исключение InvalidPasswordException с сообщением о причине ошибки.
// Необходимо обработать исключение и вывести соответствующее сообщение.
public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Введите пароль: ");
        String pass = iScanner.next();

        try {
            check(pass);
        } catch (MyNewException ex){
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
    public static void check(String value) throws MyNewException{
        if (value.length() < 8){
            throw new MyNewException("Меньше 8 символов");
        }
        if(!value.matches(".*[A-Z].*")){
            throw new MyNewException("Нет заглавных");
        }
        if ((!value.matches(".*\\d.*"))){     // любое чисол так обозначается
            throw new MyNewException("Нет цифр");
        }
        if (!value.matches(".*[!@#$%^&*].*")){
            throw new MyNewException("Нет спец. символа");
        }
    }
}
class MyNewException extends Exception{
    public MyNewException(String mes){
        super(mes);
    }
}

