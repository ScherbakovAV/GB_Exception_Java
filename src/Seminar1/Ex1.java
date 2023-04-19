package Seminar1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
         int[] arr = {5, 3, -2, 6, 1};
        // int[] arr = {}; // ошибка -1
        interfaceArrayCheck(arr);
    }
    public static int arrayIndexCheck(int[] arr, int num){
        if (arr.length < 1) return -1;
        if (arr == null) return -3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return i;
        }
        return -2;
    }
    public static void interfaceArrayCheck(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите искомый элемент массива");
        int number = input.nextInt();
        input.close();
        int result = arrayIndexCheck(arr, number);
        if (result == -1){
            System.out.println("В массиве нет элементов");
        }
        else if (result == -2) {
            System.out.println("Искомый элемент (" + number + ") отсутствует в массиве");
        }
        else if (result == -3) {
            System.out.println("Массив не существует");
        }
        else System.out.println("Индекс искомого элемента: " + result);
    }
}

//  Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
// - если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
// - если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// - если вместо массива пришел null, метод вернет -3.
// Придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
// Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит
// искомое число у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат
// пользователю. Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.