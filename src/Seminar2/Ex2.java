package Seminar2;

import java.util.InputMismatchException;

public class Ex2 {
    public static void main(String[] args) {
        String[][] arrayStr = {{"1", "5"}, {"4", "-3"}};
        System.out.println(sum2d(arrayStr));
    }
    // Обработайте возможные исключительные ситуации.
    // “Битые” значения в исходном массиве считайте нулями.
    // Можно внести в код правки, которые считаете необходимыми.
//    public static int sum2d(String[][] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < 5; j++) {
//                int val = Integer.parseInt(arr[i][j]);
//                sum += val;
//            }
//        }
//        return sum;
//    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        int val = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (NumberFormatException e1) {
        System.out.println("Введены не числа!");
        } catch (ArrayIndexOutOfBoundsException e2) {
        System.out.println("Выход за пределы массива");
        }
        return sum;
    }
}
