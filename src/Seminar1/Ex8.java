package Seminar1;

public class Ex8 {
    public static void main(String[] args) {
        int[][] array = {{1, 0}, {1, 1}};
        System.out.println(checkArray(array));
    }
    public static boolean checkArray(int[][] arr) {
        if (arr[0].length == arr.length){
            return true;
        } return false;
    }
}

// Реализуйте метод, принимающий в качестве аргументов двумерный массив.
// Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
// детализировать какие строки со столбцами не требуется.
// Как бы вы реализовали подобный метод?