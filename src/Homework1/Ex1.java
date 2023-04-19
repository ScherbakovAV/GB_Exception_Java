package Homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 3;
        int[] array = {5, 4, 6, 0, 4, 3};
        // method1(num1, num2);
        // method2(array);
        // method3("fff");
    }
    public static int method1 (int a, int b) {
        return a / (b -b); // ArithmeticException
    }
    public static int method2 (int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) { // ArrayIndexOutOfBoundsException
            sum += arr[i];
        }
        return sum;
    }
    public static int method3 (String a) {
        return Integer.parseInt(a); // NumberFormatException
    }

}

// 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
// 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
