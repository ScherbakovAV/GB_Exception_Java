package Homework3;

import java.util.List;

public class Verifications {
    public static int checkArraySize(String[] arr) { // проверка размера массива
        if (arr.length < 6) return -1;
        else if (arr.length > 6) return -2;
        return 0;
    }
    public static void isField(int index, String field) throws Exception { // проверка наличия поля
        if (index == -1) {
            throw new NoFieldException(field);
        }
    }
    public static int checkDateField(List<String> arr) throws Exception { // проверка поля Дата
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains(".")) {
                String[] tempStr = arr.get(i).split("\\.");
                if (!((tempStr.length == 3) &&
                        (strIsNumber(tempStr[0])) && (strToNumber(tempStr[0]) >= 1) && (strToNumber(tempStr[0]) <= 31) && // упрощение до 31 дня во всех месяцах
                        (strIsNumber(tempStr[1])) && (strToNumber(tempStr[1]) >= 1) && (strToNumber(tempStr[1]) <= 12) &&
                        (strIsNumber(tempStr[2])) && (strToNumber(tempStr[2]) >= 1950) && (strToNumber(tempStr[2]) <= 2023))) { // упрощение в годе
                    throw new DateFieldException();
                }
                return i;
            }
        } return -1;
    }
    public static int checkPhoneField(List<String> arr) { // проверка поля Телефон
        for (int i = 0; i < arr.size(); i++) {
            if ((strIsNumber(arr.get(i)))) return i;
        }
        return -1;
    }
    public static int checkGenderField(List<String> arr) { // проверка поля Пол
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals("f") || arr.get(i).equals("m")) return i;
        }
        return -1;
    }
    public static boolean strIsNumber(String str) { // проверка, что строка - это число
        try {
            Long.parseLong(str);
        } catch (NumberFormatException e) {
            return false;
        } return true;
    }
    public static int strToNumber(String str) { // преобразование строки в число
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
