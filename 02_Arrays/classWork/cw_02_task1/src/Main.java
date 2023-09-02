// Курс: Алгоритмы и структуры данных (семинары)
// Урок 2: Структуры данных. Массивы. Алгоритмы массивов.
// Семинар

// Задание 1
// 1.Необходимо написать один из простых алгоритмов сортировки, имеющий сложность O(n2).
// 2.Можно выбрать из пузырьковой сортировки, сортировки вставками и сортировки выбором.
// 3.Следует обратить внимание на сложность данных алгоритмов и указать признаки квадратичной сложности для каждого из них.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] myArray = {23,1,3,5,7,8,9,0,6,4,2, 11, 2, 25, 0};
        System.out.println(Arrays.toString(myArray));
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));s
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


}