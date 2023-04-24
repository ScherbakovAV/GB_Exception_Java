package Seminar3;

public class Ex3_emptyArrayException extends NullPointerException{
    public Ex3_emptyArrayException() {
        super("Обращение к пустому элементу массива");
    }

}
