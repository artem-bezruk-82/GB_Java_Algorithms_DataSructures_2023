// Курс: Алгоритмы и структуры данных
// Урок 2: Структуры данных. Массивы. Алгоритмы массивов.
// Домашняя работа

// Задание
// Реализовать алгоритм пирамидальной сортировки (сортировка кучей).

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] myArray = {8, 5, 6, 3, 1, 2, 4};
        System.out.println(Arrays.toString(myArray));
        heapSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void heapSort(int[] array)
    {
        if (array.length == 0) return;

        // Build heap
        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--)
            heapify(array, length, i);

        for (int i = length - 1; i >= 0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    static void heapify(int[]array, int length, int elementIndex)
    {
        int leftChildIndex = 2 * elementIndex + 1;
        int rightChildIndex = 2 * elementIndex + 2;
        int parentIndex = elementIndex;

        if (leftChildIndex < length && array[leftChildIndex] > array[parentIndex])
            parentIndex = leftChildIndex;

        if (rightChildIndex < length && array[rightChildIndex] > array[parentIndex])
            parentIndex = rightChildIndex;

        if (parentIndex != elementIndex)
        {
            int temp = array[elementIndex];
            array[elementIndex] = array[parentIndex];
            array[parentIndex] = temp;
            heapify(array, length, parentIndex);
        }
    }


}