
public class Main {
    /*
    Преимущества моего решения:
    1) При решении инвертировании массива не используется дополнительный масссив.
    Используется только дополнительная переменная, которая хранит одну ячейку массива, который нужно инвертировать.
    Это решение использует меньше памяти компьютера.
    2) Оформление кода в метод позволяет в дальнейшем использовать его многократно.
    3) Использование перегруженных методов позволяет использовать метод с одним названием для массивов с разным типом данных.
    4) Использование типа var сокращет время написание кода.
     */
    public static int[] invertArray(int[] array) {
        for (int i = 0; i < (array.length/2); i++) {
            var buff = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buff;
        }
        return array;
    }

    public static double[] invertArray(double[] array) {
        for (int i = 0; i < (array.length/2); i++) {
            var buff = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buff;
        }
        return array;
    }

    public static char[] invertArray(char[] array) {
        for (int i = 0; i < (array.length/2); i++) {
            var buff = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buff;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] testIntArray = {1, 2, 3};
        double[] testDoubleArray = {1.0, 2.0, 3.0};
        char[] testCharArray = {'g', 'e', 'l', 'O'};
        System.out.println("Исходный массив.");
        for (int i = 0; i < testIntArray.length; i++) {
            System.out.println(testIntArray[i]);
        }
        invertArray(testIntArray);
        System.out.println("Массив после инвертирования.");
        for (int i = 0; i < testIntArray.length; i++) {
            System.out.println(testIntArray[i]);
        }

        System.out.println("Исходный массив.");
        for (int i = 0; i < testDoubleArray.length; i++) {
            System.out.println(testDoubleArray[i]);
        }
        invertArray(testDoubleArray);
        System.out.println("Массив после инвертирования.");
        for (int i = 0; i < testDoubleArray.length; i++) {
            System.out.println(testDoubleArray[i]);
        }

        System.out.println("Исходный массив.");
        for (int i = 0; i < testCharArray.length; i++) {
            System.out.println(testCharArray[i]);
        }
        invertArray(testCharArray);
        System.out.println("Массив после инвертирования.");
        for (int i = 0; i < testCharArray.length; i++) {
            System.out.println(testCharArray[i]);
        }
    }
}