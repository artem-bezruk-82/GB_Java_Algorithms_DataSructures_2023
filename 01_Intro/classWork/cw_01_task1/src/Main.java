// Курс: Алгоритмы и структуры данных
// Урок 1: Вводная лекция. Алгоритмы. Сложность алгоритмов
// Семинар

// Задача #1
// Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
// Согласно свойствам линейной сложности, количество итераций цикла будет линейно изменяться относительно изменения размера N.

public class Main
{
    public static void main(String[] args)
    {
        int start = 1;
        int end = 5;
        System.out.printf("sum(%d,%d) = %d", start, end, getSumInRange(start,end));
    }

    public static int getSumInRange(int min, int max)
    {
        if (min > max)
        {
            int temp = max;
            max = min;
            min = temp;
        }
        int sum = 0;
        for (int i = min; i <= max; i++)
            sum += i;
        return sum;
    }
}