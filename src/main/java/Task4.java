import java.util.Scanner;

public class Task4 {
    /* Максимальное из N чисел
    В этой задаче тебе нужно:
    Ввести с клавиатуры число N.
    Считать N целых чисел и заполнить ими массив array.
    Найти максимальное число среди элементов массива.
     */

    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println(max);
    }
}