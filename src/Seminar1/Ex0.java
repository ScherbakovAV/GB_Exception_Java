package Seminar1;
public class Ex0 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arrayLengthCheck(arr, 3));
    }
    public static int arrayLengthCheck(int[] arr, int len){
        if (arr == null || arr.length < len) {
            return -1;
        }
        return arr.length;
    }
}
// Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
// в качестве кода ошибки, иначе - длину массива.