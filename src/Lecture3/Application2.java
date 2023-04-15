package Lecture3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("D:/Geek Brains/Git/Exception_Java/src/Lecture3/file");
             FileWriter writer = new FileWriter("D:/Geek Brains/Git/Exception_Java/src/Lecture3/test")) {
            while (reader.ready()){
                writer.write(reader.read()); // копирование файла
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successfully");
    }
}
