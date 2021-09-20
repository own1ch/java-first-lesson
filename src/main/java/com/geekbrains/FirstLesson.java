package com.geekbrains;

public class FirstLesson {
    /*public static void main(String[] args) {
        byte byte1 = (byte) 129; //-128 127
        short short1 = (short) 100;
        int int1 = 200; //от -2147483648 до 2147483647
        long long1 = 300;

        //System.out.println(byte1);

        float float1 = 1.2f;
        double double1 = 1.2;

        char char1 = 'a';
        char char2 = 'b';

        boolean boolean1 = false;
        boolean boolean2 = true;

        final String string1 = "Тестируем строки";
        //System.out.println(string1);

        //Суммируем два числа
        int sum = int1 * short1;

        sum += 150;
        System.out.println(++sum);

        int value = 110;

        if(value != 110) {
            System.out.println("value больше или равно чем 110");
        } else {
            System.out.println("value меньше чем 110");
        }

        System.out.println("Программа закончила работу");
    }*/

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = sum(a, b);
        int d = sum(c, a);

        sumAndPrint(5, 1);

        SecondLesson.print(c);
        SecondLesson.print(d);

        String s = "asd";
        String d1 = " и что это?";
        String j = s + d1;

        String exampleDigit = "10";

        System.out.println(a + b);
    }



    /**
     * Метод суммировует два числа
     * @param a Первое число
     * @param b Второе число
     * @return Сумма этих чисел
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Метод отображает в консоли сумму значений
     * @param firstDigit Первое значение
     * @param secondDigit Второе значение
     */
    public static void sumAndPrint(int firstDigit, int secondDigit) {
        int c = sum(firstDigit, secondDigit);
        System.out.println(c);
    }
}
