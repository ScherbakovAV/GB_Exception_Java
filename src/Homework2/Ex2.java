package Homework2;

public class Ex2 {
    public static void main(String[] args) {
        float[] floatArray = {5, 4, 0, 3, 4, -7, 3, 1, 5, -4};
        try {
            int d = 2;
            double catchedRes1 = floatArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}
// 2. Если необходимо, исправьте данный код
// try {
//   int d = 0;
//   double catchedRes1 = intArray[8] / d;
//   System.out.println("catchedRes1 = " + catchedRes1);
//} catch (ArithmeticException e) {
//   System.out.println("Catching exception: " + e);
//}