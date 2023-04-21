package Seminar2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Ex3 {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "D:\\Geek Brains\\Git\\Exception_Java\\src\\Seminar2\\ForEx3.txt";
        HashMap<String, Integer> students = fromFileToArray(file);
        System.out.println(students.entrySet());
    }
    public static HashMap<String, Integer> fromFileToArray(String filename){
        HashMap<String, Integer> students = new HashMap<>();
        BufferedReader file;
        String tempStr = "";
        try {
            file = new BufferedReader(new FileReader(filename));
            String line = file.readLine();
            while (line != null) {
                String[] row = line.split("=");
                try {
                    int l = Integer.parseInt(row[1]);
                    students.put(row[0], l);
                } catch (Exception err) {
                    students.put(row[0], row[0].length());
                }
                line = file.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        return students;
    }
}

// Запишите в файл следующие строки:
// Анна=4
// Елена=5
// Марина=6
// Владимир=?
// Константин=?
// Иван=4
// Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
// (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти
// по структуре данных, если сохранено значение ?, заменить его на соответствующее число.
// Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее
// исключение. Записать в тот же файл данные с замененными символами ?.