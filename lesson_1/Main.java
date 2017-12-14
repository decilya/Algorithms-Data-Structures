package ru.java.ls1;

import java.util.Arrays;

public class Main {

    /**
     * Реализовать алгоритм поиска простых чисел “Решето Эратосфена”.
     */
    private static void fillEratosthenes(int n) {
        boolean[] arr = new boolean[n + 1];

        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                for (int j = 2; i * j < arr.length; j++) {
                    arr[i * j] = false;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Реализовать алгоритм ускоренного возведения в степень.
     */
    private static int power(int value, int pow) {
        int result = 1;
        int count = 0;

        while (pow > 0) {

            count++;

            if (pow % 2 == 1) {
                result *= value;
            }

            value *= value;
            pow /= 2;

            System.out.println("тик " + count);
        }

        return result;
    }


    public static void main(String[] args) {

        // Реализовать алгоритм поиска простых чисел “Решето Эратосфена”.
        fillEratosthenes(1073741823);


        // Реализовать алгоритм ускоренного возведения в степень.
        System.out.println(power(2, 16));
    }

}


