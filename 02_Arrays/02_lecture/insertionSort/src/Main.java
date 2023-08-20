// Курс: Алгоритмы и структуры данных
// Урок 2: Структуры данных. Массивы. Алгоритмы массивов
// Лекция

// Алгоритм сортировки вставками

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1,8,3,5,6,7,2,9};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] array)
    {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}