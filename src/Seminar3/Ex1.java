package Seminar3;

import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }
    public static void doSomething() throws IOException {
        throw new IOException("Something went wrong!");
    }
}

// Создайте метод doSomething(), который может быть источником одного из
// типов checked exceptions(тело самого метода прописывать необязательно).
// Вызовите этот метод из main и обработайте в нем исключение, которое
// вызвал метод doSomething()