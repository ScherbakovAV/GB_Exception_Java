package Lecture2;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
//        // Runtime Exceptions:
//        String name = null;
//        System.out.println(name.length()); // NullPointerException

//        Object object = new String(("123"));
//        File file = (File) object;
//        System.out.println(file); // ClassCastException

//        String number = "123fq";
//        int result = Integer.parseInt(number);
//        System.out.println(result); // NumberFormatException

//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object()); // UnsupportedOperationException

        int number = 1;
        try {
            number = 10 / 1;
            // String test = null;
            // System.out.println(test.length());
            Collections.emptyList().add(new Object());
        } catch (ArithmeticException e)
        {
            System.out.println("Operation divide by zero not supported");
        } catch (NullPointerException e) {
            System.out.println("Nullpointer exception");
        } catch (Exception e) {
        System.out.println("Exception");
        }
        System.out.println(number);
    }
}
