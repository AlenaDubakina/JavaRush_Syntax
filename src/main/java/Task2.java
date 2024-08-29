import java.util.Scanner;

public class Task2 {
    /* Reverse
    Тебе нужно написать программу, которая:
    Считывает с консоли целое число N.
    Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
    Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
    Каждое число выводить с новой строки. Число N выводить не нужно.
     */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int countN = console.nextInt();
        int[] arr = new int[countN];
        for (int i = 0; i < countN; i++) {
            arr[i] = console.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (countN % 2 == 0)
                System.out.println(arr[arr.length - 1 - i]);
            else
                System.out.println(arr[i]);
        }
    }
}