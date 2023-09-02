// Курс: Алгоритмы и структуры данных (семинары)
// Урок 2: Структуры данных. Массивы. Алгоритмы массивов.
// Семинар

// Задание 2
// Написать алгоритм быстрого поиска (quicksort)

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {9,2,7,4,5,6,3,8,1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] array)
    {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int startPosition, int endPosition)
    {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition)/2];
        do
        {
            while (array[leftPosition] < pivot)
                leftPosition++;

            while (array[rightPosition] > pivot)
                rightPosition--;

            if (leftPosition <= rightPosition)
            {
                if (leftPosition < rightPosition)
                {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);

        if (leftPosition < endPosition)
            quickSort(array, leftPosition, endPosition);

        if (startPosition < rightPosition)
            quickSort(array, startPosition, rightPosition);
    }

}