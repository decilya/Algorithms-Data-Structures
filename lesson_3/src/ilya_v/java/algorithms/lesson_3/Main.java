// Васильев Илья

package ilya_v.java.algorithms.lesson_3;

import java.util.Arrays;

public class Main {

    private static int countBubbleSort(int[] arr) {

        int tmp;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    count++;
                }
            }
        }

        return count;
    }


    private static int fixCountBubbleSort(int[] arr) {

        int tmp;
        int count = 0;
        boolean f;

        for (int i = 0; i < arr.length; i++) {
            f = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1] && !f) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    count++;
                    f = true;
                }
            }

        }

        return count;
    }


    public static void main(String[] args) {

        /*
        1.  Попробовать оптимизировать пузырьковую сортировку.
            Сравнить количество операций сравнения оптимизированной и не оптимизированной программы.
            Написать функции сортировки, которые возвращают количество операций.
        */
        int[] arr = {8, 5, 4, 3, 2, 1, 10, 11, 12, 23, 33, 33, 81, 80, 82, 83, 99};
        System.out.println("count = " + countBubbleSort(arr) + "; arr = " + Arrays.toString(arr));

        int[] newArr = {8, 5, 4, 3, 2, 1, 10, 11, 12, 23, 33, 33, 81, 80, 82, 83, 99};
        System.out.println("count = " + fixCountBubbleSort(newArr) + "; arr = " + Arrays.toString(newArr));


       /*
        3.  Реализовать бинарный алгоритм поиска в виде функции, которой передается отсортированный массив.
            Функция возвращает индекс найденного элемента или -1, если элемент не найден.
        */

    }
}
