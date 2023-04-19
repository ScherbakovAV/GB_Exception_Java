package Homework1;

public class Ex3 {
    public static void main(String[] args) {
        int[] array1 = {5, 4, -2, 0, 7};
        int[] array2 = {-2, -2, 8, 1, 3};
        arrDiff(array1, array2);
    }
    public static int[] arrDiff(int[] arr1, int[] arr2) {
        int[] arrResult = new int[arr1.length];
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                arrResult[i] = arr1[i] - arr2[i];
                System.out.print(arrResult[i] + " ");
            }
            System.out.println();
        } else System.out.println("Ошибка: длины массивов не равны!");
        return arrResult;
    }
}

// 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
//    новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//    Если длины массивов не равны, необходимо как-то оповестить пользователя.
