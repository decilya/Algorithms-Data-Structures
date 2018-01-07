package ilya_v.java.algorithms.lesson_4;

import java.lang.Math;
import java.util.Arrays;

public class Main {

    private static void maxPos(char[] firstStr, char[] secondStr) {

        int firstLength = firstStr.length + 1;
        int secondLength = secondStr.length + 1;

        int[][] matrix = new int[firstLength][secondLength];
        int tmpForJ = 1;

        // начинаем с 1, так как по 0 индексам будут нули; i - цикл по secondStr, "по колонкам"
        for (int i = 1; i < secondLength; i++) {
            // так как смещаемся по диагонали, j начинаем с tmpForJ - в этой переменной находится значение текущей строки
            // с которой нет совпадения, это цикл по firstStr, "по строкам"
            for (int j = tmpForJ; j < firstLength; j++) {
                if (secondStr[i - 1] == firstStr[j - 1]) {
                    // ход по "диагонали", когда буквы совпали
                    matrix[j][i] = matrix[j - 1][i - 1] + 1;

                    // заполняем данными вертикаль
                    for (int x = i; x < secondLength; x++) {
                        matrix[j][x] = matrix[j][i];
                    }

                    // заполняем данными горизонт
                    for (int y = j; y < firstLength; y++) {
                        matrix[y][i] = matrix[j][i];
                    }
                    // проходим на следующую букву первой строки
                    tmpForJ++;
                    break;
                } else {
                    // буквы не совпали, продолжаем искать по "вертикали" матрицы
                    for (int k = j; k < firstLength; k++) {
                        if (secondStr[i - 1] == firstStr[k - 1]) {
                            // нашли совпадение по вертикали, шагаем по вертикали
                            matrix[k][i] = matrix[k - 1][i - 1] + 1;

                            // заполняем данными вертикаль
                            for (int x = k; x < firstLength; x++) {
                                matrix[x][i] = matrix[k][i];
                            }

                            // заполняем данными горизонт
                            for (int y = i; y < firstLength; y++) {
                                matrix[k][y] = matrix[k][i];
                            }

                            // проходим на следующую букву первой строки
                            tmpForJ++;
                            break;
                        } else {
                            // заполняем "горизонт" по не найденному совпадению
                            for (int t = i; t < firstLength; t++) {
                                matrix[k][t] = Math.max(matrix[k - 1][t], matrix[k][t - 1]);
                            }
                        }
                    }

                }

            }
        }

        System.out.print(Arrays.deepToString(matrix));
    }

    public static void main(String args[]) {

        // 2. Решить задачу о нахождении длины максимальной последовательности с помощью матрицы.
        maxPos("geekminds".toCharArray(), "geekbrains".toCharArray());


    }
}
