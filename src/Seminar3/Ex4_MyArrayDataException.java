package Seminar3;

public class Ex4_MyArrayDataException extends Exception{
    public Ex4_MyArrayDataException(int i, int j) {
        super("В ячейке с индексом [" + i + "][" + j + "] не целое число!");
    }
}
