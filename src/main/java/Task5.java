import java.util.Scanner;

public class Task5 {
    /* Удаляем одинаковые строки
    В этой задаче тебе нужно:
    Считать 6 строк и заполнить ими массив strings.
    Удалить повторяющиеся строки из массива strings,
    заменив их на null (null должны быть не строками "null").
     */

    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }

        String[] copyArray = new String[6];
        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i] = strings[i];
        }

        for (int i = 0; i < copyArray.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (copyArray[i].equals(strings[j])) {
                    strings[i] = strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}