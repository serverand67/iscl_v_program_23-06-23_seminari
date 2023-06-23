package home_work1;
import java.util.Scanner;
public class Incorrect_data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        try {
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Ваш возраст: " + age);
        } catch (NumberFormatException ex) {
            System.out.println("Введены некорректные данные");
        }
    }
}

