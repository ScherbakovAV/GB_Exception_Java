package Lecture2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("D:/Geek Brains/Git/Exception_Java/src/Lecture1"); // обязательное (checked) исключение
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        } finally { // выполняется независимо от результатов выполнения кода
            System.out.println("Finally starts");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("Finally finished");
        }
    }
}
