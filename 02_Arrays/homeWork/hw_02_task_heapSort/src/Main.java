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

    static void heapify(int[]array, int length, int rootIndex)
    {
        int leftChildIndex = 2 * rootIndex + 1;
        int rightChildIndex = 2 * rootIndex + 2;s
        int largestIndex = rootIndex;

        if (leftChildIndex < length && array[leftChildIndex] > array[largestIndex])
            largestIndex = leftChildIndex;

        if (rightChildIndex < length && array[rightChildIndex] > array[largestIndex])
            largestIndex = rightChildIndex;

        if (largestIndex != rootIndex)
        {
            int temp = array[rootIndex];
            array[rootIndex] = array[largestIndex];
            array[largestIndex] = temp;
            heapify(array, length, largestIndex);
        }
    }
}