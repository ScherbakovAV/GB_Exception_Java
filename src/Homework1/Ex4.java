package Homework1;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3};
        int[] arr2 = {0, 4, 7};
        arrDiff(arr1, arr2);
    }

    public static int[] arrDiff(int[] arr1, int[] arr2) {
        int[] arrResult = new int[arr1.length];
        try {
            if (arr1.length == arr2.length) {
                for (int i = 0; i < arr1.length; i++) {
                    arrResult[i] = arr1[i] / arr2[i];
                    System.out.print(arrResult[i] + " ");
                }
                System.out.println();
            } else System.out.println("Ошибка: длины массивов не равны!");
            return arrResult;
        } catch (Exception e) {
            throw new RuntimeException("Ошибка выполнения");
        }
    }
}

// 4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
//    не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
//    которое пользователь может увидеть - RuntimeException, т.е. ваше.