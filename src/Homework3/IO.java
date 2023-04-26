package Homework3;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static Homework3.Verifications.checkArraySize;

public class IO {
    public static String enterPersonalData(int param) { // ввод с клавиатуры персональных данных
        Scanner scn = new Scanner(System.in);
        if (param == 0) {
            System.out.println("""
                    Введите через пробел:
                    - Фамилию
                    - Имя
                    - Отчество
                    - Дату рождения в формате dd.mm.yyyy
                    - номер телефона (целое беззнаковое число)
                    - пол (f - женский или m - мужской)""");
        } return scn.nextLine();
    }
    public static List<String> StrToArrayList(){ // преобразование в лист введённой строки
        String[] data;
        int checkSize = 0;
        data = enterPersonalData(checkSize).split(" ");
        while (true) {
            checkSize = checkArraySize(data);
            if (checkSize == -1) {
                System.out.println("Вы ввели меньше данных, чем требуется, повторите ввод...");
                data = enterPersonalData(checkSize).split(" ");
            }
            else if (checkSize == -2) {
                System.out.println("Вы ввели больше данных, чем требуется, повторите ввод...");
                data = enterPersonalData(checkSize).split(" ");
            }
            else break;
        }
        return new ArrayList<>(Arrays.asList(data));
    }
    public static void arrayListToFile(List<String> arr){ // запись в файл данных листа
        try (FileWriter write = new FileWriter(arr.get(0) + ".txt", true)) {
            for (int i = 0; i < arr.size(); i++) {
                if (i != arr.size() - 1) write.append(arr.get(i)).append(" ");
                else write.append(arr.get(i)).append("\n");
            }
            System.out.println("Пользователь успешно добавлен");
            System.out.println("Создан файл \"" + arr.get(0) + ".txt\"");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи файла...");
        }
    }
}
