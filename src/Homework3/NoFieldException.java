package Homework3;

public class NoFieldException extends Exception{ // исключения для пустых полей
    public NoFieldException(String field) {
        if (field.equals("Data")) {
            System.out.println("Не введена дата рождения или ошибка формата! Перезапустите программу и повторите ввод.");
        } else if (field.equals("Phone")) {
            System.out.println("Не введен номер телефона или ошибка формата! Перезапустите программу и повторите ввод.");
        } else if (field.equals("Gender")) {
            System.out.println("Не введен пол или ошибка формата! Перезапустите программу и повторите ввод.");
        }
    }
}
