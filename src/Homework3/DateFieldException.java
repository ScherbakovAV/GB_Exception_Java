package Homework3;

public class DateFieldException extends Exception{ // исключение при вводе данных неверного формата в поле Дата
    public DateFieldException() {
        super("Ошибка в формате ввода даты рождения! Перезапустите программу.");
    }
}
