package Seminar1;

public class Ex7 {
    public static void main(String[] args) {
        int[] array1 = {5, 4, 3, 7};
        int[] array2 = {2, 8, 1, 4};
        int[] arrayResult = sumArrays(array1, array2);
        System.out.print("Результат: { ");
        for (int i = 0; i < arrayResult.length; i++) {
            System.out.print(arrayResult[i] + " ");
        }
        System.out.println("}");
    }
    public static int[] sumArrays(int[] arr1, int[] arr2) throws RuntimeException {
        int[] arrSum = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Эта программа работает только с массивами одинаковой длины");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                arrSum[i] = arr1[i] + arr2[i];
            }
            return arrSum;
        }
    }
}

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
// новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.