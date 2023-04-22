package Homework2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        checkInput();
    }
    public static void checkInput() throws Exception {
        System.out.println("Введите значение... ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        if (str.isEmpty()) throw new Exception("Пустые строки вводить нельзя!");
        else System.out.print("Введённая строка: \"" + str + "\"");
    }
}
// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.