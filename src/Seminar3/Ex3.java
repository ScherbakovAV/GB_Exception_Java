package Seminar3;

public class Ex3 {
    public static void main(String[] args) {
        try {
            throw new Ex3_DivByZeroException();
        } catch (Ex3_DivByZeroException e) {
            System.out.println(e);
        };
        try {
            throw new Ex3_emptyArrayException();
        } catch (Ex3_emptyArrayException e) {
            System.out.println(e);
        };
        try {
            throw new Ex3_absentFile();
        } catch (Ex3_absentFile e) {
            System.out.println(e);
        };
    }
}

// 1. Создайте класс исключения, который будет выбрасываться при делении на 0.
//    Исключение должно отображать понятное для пользователя сообщение об ошибке.
// 2. Создайте класс исключений, которое будет возникать при обращении к
//    пустому элементу в массиве ссылочного типа. Исключение должно
//    отображать понятное для пользователя сообщение об ошибке
// 3. Создайте класс исключения, которое будет возникать при попытке открыть
//    несуществующий файл. Исключение должно отображать понятное для
//    пользователя сообщение об ошибке.