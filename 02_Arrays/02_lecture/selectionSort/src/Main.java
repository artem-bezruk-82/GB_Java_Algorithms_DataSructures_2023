import java.util.Arrays;

// Курс: Алгоритмы и структуры данных
// Урок 2: Структуры данных. Массивы. Алгоритмы массивов
// Лекция

// Алгоритм сортировки выбором

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1,6,3,9,4,7,2,5,8};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int array[])
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            if (minIndex != i)
            {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}