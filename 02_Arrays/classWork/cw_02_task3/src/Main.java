// Курс: Алгоритмы и структуры данных (семинары)
// Урок 2: Структуры данных. Массивы. Алгоритмы массивов.
// Семинар

// Задание 3
// Пишем тесты для сравнения производительности сортировки больших массивов.

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        long time = 0;
        long timeStart = System.currentTimeMillis();
        quickSort(getRandomArray(100000, 1, 50));
        long timeEnd = System.currentTimeMillis();
        time += timeEnd - timeStart;
        System.out.println("Quick sort time total: " + time);

        time = 0;
        timeStart = System.currentTimeMillis();
        bubbleSort(getRandomArray(100000, 1, 50));
        timeEnd = System.currentTimeMillis();
        time += timeEnd - timeStart;
        System.out.println("Bubble sort time total: " + time);
    }

    public static int[] getRandomArray(int size, int minValue, int maxValue)
    {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(minValue, maxValue);
        }
        return array;
    }

    public static void bubbleSort(int[] array)
    {
        for (int i = 1; i < array.length - 1; i++)
        {
            for (int j = 1; j < array.length; j++)
            {
                if (array[j - 1] > array[j])
                {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
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