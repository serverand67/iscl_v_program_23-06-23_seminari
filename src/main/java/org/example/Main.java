package org.example;

public class Main {
        static void genException(){
            int[] array = new int[4];
            System.out.println("До генерации исключения");
            array[7] = 15;
            System.out.println("Эта строка не будет отображаться");
        }
    }
class UseMain{
    public static void main(String[] args) {
        try {
            Main.genException();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Стандартное сообщение");
            System.out.println(ex);
            System.out.println("Стэк вызовов");
            ex.printStackTrace();
        }
        System.out.println("После оператора catch");
    }
    }
