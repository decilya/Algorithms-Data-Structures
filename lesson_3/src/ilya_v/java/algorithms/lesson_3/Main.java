// Васильев Илья

package ilya_v.java.algorithms.lesson_3;

import java.util.Arrays;

public class Main {

    /**
     * Сортировка методом пузырька
     *
     * @param arr integer[]
     * @return integer
     */
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


    /**
     * Оптимизированная сортировка методом пузырька
     *
     * @param arr integer[]
     * @return integer
     */
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

    /**
     * Бинарный поиск
     *
     * @param searchNumber integer
     * @param arr          integer[]
     * @return integer
     */
    private static int binarySearch(int searchNumber, int[] arr) {

        int l = 0;
        int r = arr.length - 1;
        int m;

        while (true) {

            m = l + ((r - l) / 2);

            if ((l <= r) && (arr[m] != searchNumber)) {

                if (arr[m] < searchNumber) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }

            } else {

                if (arr[m] == searchNumber) {
                    return m;
                } else {
                    return -1;
                }

            }
        }
    }

    private static int shakerSort(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0){
                // на четных итерациях идем справа налево


            } else {
                // на нечетных идем слева направо

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
        System.out.println(binarySearch(82, arr));

        /*
        2. *Реализовать шейкерную сортировку.
         */





    }
}
