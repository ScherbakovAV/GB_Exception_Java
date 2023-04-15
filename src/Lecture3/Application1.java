package Lecture3;

import java.io.FileReader;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) { // изменение кода с прошлой лекции
        // блок try-with-resources - не требует закрытия файла после выполнения метода
        try (FileReader test = new FileReader("D:/Geek Brains/Git/Exception_Java/src/Lecture1")) {
             test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        }
    }
}
