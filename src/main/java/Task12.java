import java.util.Arrays;

public class Task12 {
    /* Есть ли кто?
    Реализуй метод main(String[]), который выводит в консоль true,
    если элемент содержится в переданном массиве, иначе — false.
    Массив array не должен изменять расположение своих элементов.
    Для поиска элемента в массиве нужен бинарный поиск.
    Чтобы это сделать, используй статический метод Arrays.binarySearch(int[], int) класса Arrays.
    Первым параметром нужно передать отсортированный массив, в котором выполнить поиск,
    вторым параметром — искомый элемент.
    Метод Arrays.binarySearch(int[], int) возвращает индекс искомого элемента, если такой элемент есть в массиве.
    */

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 39;

    public static void main(String[] args) {
        int[] copyArr = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArr);
        int searchIndex = Arrays.binarySearch(copyArr, element);
        //  boolean result = searchIndex > 0 ? true : false;
        System.out.print(searchIndex >= 0);
    }
}