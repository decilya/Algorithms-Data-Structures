// Васильев Илья

package ilya_v.java.algorithms.lesson_3;

import java.util.Arrays;

public class Main {

    private static int[] bubbleSort(int[] arr){

        int tmp, count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j =0; j < arr.length - 1; j++){
                if (arr[j] > arr[j + 1]){
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    count++;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        /*
        1.  Попробовать оптимизировать пузырьковую сортировку.
            Сравнить количество операций сравнения оптимизированной и не оптимизированной программы.
            Написать функции сортировки, которые возвращают количество операций.
        */
        int[] arr = {1, 2, 33, 6, 8, 10, 23, 5, 7};

        System.out.println(Arrays.toString(bubbleSort(arr)));



       /*
        3.  Реализовать бинарный алгоритм поиска в виде функции, которой передается отсортированный массив.
            Функция возвращает индекс найденного элемента или -1, если элемент не найден.
        */


    }
}
