// Курс: Алгоритмы и структуры данных (семинары)
// Урок 2: Структуры данных. Массивы. Алгоритмы массивов.
// Семинар

// Задание 4
// Алгоритм бинарного поиска по элементам

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {9,2,7,4,5,6,3,8,1};
        System.out.println(Arrays.toString(arr));
        int value = 8;
        System.out.printf("arr[%d] = %d\n", binarySearch(arr, value), value);
        System.out.println(Arrays.toString(arr));
    }

    public static int binarySearch(int[] array, int value)
    {
        Arrays.sort(array);
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex)
        {
            int currentIndex = (endIndex + startIndex)/2;
            if (value == array[currentIndex])
                return currentIndex;

            if (array[currentIndex] < value)
                startIndex = currentIndex + 1;

            if (array[currentIndex] > value)
                endIndex = currentIndex - 1;
        }
        return -1;
    }
}