package Seminar3;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        String[][] array = {
                {"5", "4", "3", "2"},
                {"5", "4", "9", "4"},
                {"8", "0", "-5", "-8"},
                {"2", "3", "5", "1"},
        };
        System.out.println("Сумма элементов массива равна " + addStrArr(array));
    }
    public static int addStrArr(String[][] arr) throws Exception{
        for (int i = 0; i < arr.length; i++) {
            if ((arr.length != 4) || (arr[i].length != 4)) {
                throw new Ex4_MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new Ex4_MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}

// 1. Напишите метод, на вход которого подаётся двумерный строковый массив
//    размером 4х4. При подаче массива другого размера необходимо бросить
//    исключение MyArraySizeException.
// 2. Далее метод должен пройтись по всем элементам массива, преобразовать
//    в int и просуммировать. Если в каком-то элементе массива преобразование
//    не удалось (например, в ячейке лежит символ или текст вместо числа),
//    должно быть брошено исключение MyArrayDataException с детализацией, в
//    какой именно ячейке лежат неверные данные.
// 3. В методе main() вызвать полученный метод, обработать возможные
//    исключения MyArraySizeException и MyArrayDataException и вывести
//    результат расчета (сумму элементов, при условии, что подали на вход
//    корректный массив).