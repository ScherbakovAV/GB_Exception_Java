package Homework2;

import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Введённое число: " + checkFloat());
    }
    public static float checkFloat() {
        System.out.print("Введите дробное число... ");
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                return input.nextFloat();
            } catch (InputMismatchException e) {
                System.out.print("Ошибка ввода! Повторите... ");
            }
        }
    }
}
// 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float)
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.