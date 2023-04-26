package Homework3;

import java.util.ArrayList;
import java.util.List;

import static Homework3.IO.*;
import static Homework3.Verifications.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> data = enterCheckedPersonalData();
        arrayListToFile(data);
    }
    private static List<String> enterCheckedPersonalData() throws Exception { // ввод и проверка данных с использованием других методов
        List<String> arrData = StrToArrayList();
        List<String> arrCopy = new ArrayList<>(arrData);

        int fieldIndex = checkDateField(arrData);
        isField(fieldIndex, "Data");
        arrData.remove(fieldIndex);

        fieldIndex = checkPhoneField(arrData);
        isField(fieldIndex, "Phone");
        arrData.remove(fieldIndex);

        fieldIndex = checkGenderField(arrData);
        isField(fieldIndex, "Gender");

        return arrCopy;
    }
}