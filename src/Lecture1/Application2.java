package Lecture1;

public class Application2 {
    public static void main(String[] args) {
        divide(10, 0);
    }

    public static int divide(int a1, int a2){
        if (a2 == 0){
            throw new RuntimeException("Divide by zero no permitted"); // собственное исключение
        }
        return a1 / a2;
    }
}
