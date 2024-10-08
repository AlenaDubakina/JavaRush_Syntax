import java.util.Scanner;

public class Task8 {
    /* Создаем двумерный массив
    Двумерный массив — это массив массивов,
    то есть в каждой его ячейке находится ссылка на некий массив.
    Но гораздо проще его представить в виде таблицы,
    у которой задано количество строк (первое измерение)
    и количество столбцов (второе измерение).
    В этой задаче мы будем создавать такой массив.
    Для этого реализуй метод main(String[]), который:

    Считывает из консоли число N — количество строк массива
    (считай, что это число будет больше 0, можно не проверять).
    Считывает N чисел из консоли
    (любые числа, которые будут больше 0, можно не проверять).
    Инициализирует двумерный массив multiArray:
    - количеством строк N;
    - строки — массивами, размер которых соответствует числам,
    введенным в п.2 (в порядке ввода).
     */

    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[console.nextInt()];
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }
    }
}