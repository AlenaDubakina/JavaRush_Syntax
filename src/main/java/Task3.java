import java.util.Scanner;

public class Task3 {
    /* Минимальное из N чисел
    Чтобы выполнить эту задачу, тебе нужно:
    Ввести с клавиатуры число N.
    Считать N целых чисел и заполнить ими массив.
    Найти минимальное число среди элементов массива и вывести в консоль.
     */

    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println(min);
    }
}