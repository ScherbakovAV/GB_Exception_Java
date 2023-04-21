package Seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    // Скорректировать код:
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[10];
//        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
//        int index = scanner.nextInt();
//        try {
//            arr[index] = 1;
//        } catch (Exception e) {
//            System.out.println("Указан индекс за пределами массива");
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        try {
            int index = scanner.nextInt();
            arr[index] = 1;
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Указан индекс за пределами массива");
        } catch (InputMismatchException e2) {
            System.out.println("Вы ввели не число!");
        }
    }
}
