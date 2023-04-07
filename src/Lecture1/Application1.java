package Lecture1;

import java.io.File;

public class Application1 {

    public static void main(String[] args) {
        System.out.println(getFileSize(new File("123")));
        System.out.println(divide(10, 0));
        a(); // stack trace
    }

    public static int divide(int a1, int a2){
        if (a2 == 0){
            return -1; // код ошибки при делении на 0
            // при использовании кодов ошибок есть проблема, что невозможно при исполнении кода
            // определить, является ли результат кодом ошибки или это возврат исполнения метода
        }
        return a1 / a2;
    }

    public static long getFileSize(File file){
        if (!file.exists()){
            return -1; // код ошибки, если файл не существует
        }
        return file.length(); // возврат размера файла (может быть 0)
    }

    public static void a(){
        b();
    }

    public static void b(){
        c();
    }

    public static void c(){
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }
}