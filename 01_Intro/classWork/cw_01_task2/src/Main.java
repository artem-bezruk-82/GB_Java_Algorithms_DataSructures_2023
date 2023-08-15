// Курс: Алгоритмы и структуры данных
// Урок 1: Вводная лекция. Алгоритмы. Сложность алгоритмов
// Семинар

// Задача #2
// Написать алгоритм поиска простых чисел (делятся только на себя и на 1 в диапазоне от 1 до N.
// В алгоритме будет использоваться вложенный for, что явно говорит о квадратичной сложности,
// на этом стоит акцентировать внимание

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getSimpleValues(20));
    }

    public static ArrayList<Integer> getSimpleValues(int value)
    {
        ArrayList<Integer> simpleValues = new ArrayList<>();
        for (int i = 1; i < value; i++)
        {
            if (isSimpleValue(i))
                simpleValues.add(i);
        }
        return simpleValues;
    }

    public static boolean isSimpleValue(int value)
    {
        for (int i = 2; i < value; i++)
        {
            if (value % i == 0)
                return false;
        }
        return true;
    }
}