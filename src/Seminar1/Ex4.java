package Seminar1;

public class Ex4 {
    public static void main(String[] args) {
        Integer[] arr = {5, null, 4, null, 2};
        checkArray(arr);
    }
    public static void checkArray(Integer[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("В ячейке массива [" + i + "] значение равно null");
                result += 1;
            }
        }
        if (result != 0) {
            System.out.println("В этом массиве найдено " + result + " ячеек со значением null");
        } else System.out.println("Всё ОК");
    }
}

// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”