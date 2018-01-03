// Васильев Илья

package ilya_v.java.algorithms.lesson_2;

/*
1. Реализовать функцию перевода из 10 системы в двоичную используя рекурсию.

2. Реализовать функцию возведения числа a в степень b:
    a. без рекурсии;
    b. рекурсивно;
    c. *рекурсивно, используя свойство чётности степени.

3. Исполнитель Калькулятор преобразует целое число, записанное на экране.
    У исполнителя две команды, каждой команде присвоен номер:
    Прибавь 1 2.Умножь на 2 Первая команда увеличивает число на экране на 1,
    вторая увеличивает это число в 2 раза. Сколько существует программ,
     которые число 3 преобразуют в число 20? а) с использованием массива; б) с использованием рекурсии.

    Записывайте в начало программы условие и свою фамилию. Все решения создавайте в одной программе.
     Со звёздочками выполняйте в том случае, если вы решили задачи без звёздочек.
*/

import java.nio.Buffer;
import java.util.Arrays;

public class Main {

    /*
        Алгоритм перевода из десятичной системы в двоичную
        1) Выполнить деление исходного числа на 2.
        Если результат деления больше или равен 2, продолжать делить его на 2 до тех пор, пока результат деления не станет равен 1.

        2) Выписать результат последнего деления и все остатки от деления в обратном порядке в одну строку.
    */
    private static StringBuilder convertToBinary(int n) {

        StringBuilder result = new StringBuilder();
        int[] tmpArr = new int[countArrOfN(n, 0)];
        //int[] arr = new int[tmpArr.length];

        tmpArr = setArrOfN(n, tmpArr, 0);

        for (int i = tmpArr.length - 1, j = 0; i >= 0; --i, j++) {
            //arr[j] = tmpArr[i];
            result = result.append(tmpArr[i]);
        }

        return result;
    }

    private static int countArrOfN(int n, int count) {

        n = n / 2;
        count++;

        if (n >= 2) {
            return countArrOfN(n, count);
        }

        return ++count;
    }

    private static int[] setArrOfN(int n, int[] arr, int count) {

        int tmp = n % 2;

        arr[count] = tmp;
        count++;

        n = n / 2;

        if (n >= 2) {
            return setArrOfN(n, arr, count);
        }

        // Последним номером выписываем результат деляения, а не остаток от деляения
        arr[count] = n;

        return arr;
    }


    public static void main(String[] args) {

       /* Реализовать функцию перевода из 10 системы в двоичную используя рекурсию */
        System.out.println(convertToBinary(18));

        /* 2. Реализовать функцию возведения числа a в степень b:
           a. без рекурсии;
           b. рекурсивно; */




    }
}
