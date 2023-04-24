package Seminar3;

import java.io.FileNotFoundException;

public class Ex3_absentFile extends FileNotFoundException {
    public Ex3_absentFile() {
        super("Такого файла нет!");
    }
}
