package Seminar1;

public class Ex2 {
    public static void main(String[] args) {
        int[][] array = {{1, 0 }, {1, 1}};
        System.out.println(arraySum(array));
    }
    public static int arraySum(int[][] arr){
        if (arr[0].length == arr.length){
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 0 || arr[i][j] == 1)  {
                    sum += arr[i][j];
                    } else throw new RuntimeException("Значения в массиве отличаются от 0 и 1");
                }
            } return sum;
        } throw new RuntimeException("Эта программа работает только с квадратными массивами");
    }
}
// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
// (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.