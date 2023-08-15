// Курс: Алгоритмы и структуры данных
// Урок 1: Вводная лекция. Алгоритмы. Сложность алгоритмов
// Семинар

// Задача #6
// Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел Фибоначчи и определить, какой из них работает быстрее.
// Так различия начнутся уже с 40 члена последовательности.

public class Main
{
    public static void main(String[] args)
    {
        long timeRec = 0;
        for (int i = 3; i < 50; i++)
        {
            long timeStartRec = System.currentTimeMillis();
            System.out.println(getFibonacciValueRec(i));
            long timeEndRec = System.currentTimeMillis();
            System.out.println("Recursion time " + i + ": " + (timeEndRec - timeStartRec));
            timeRec += timeEndRec - timeStartRec;
        }

        long timeLoop = 0;
        for (int i = 3; i < 50; i++)
        {
            long timeStartLoop = System.currentTimeMillis();
            System.out.println(getFibonacciValueLoop(i));
            long timeEndLoop = System.currentTimeMillis();
            System.out.println("Loop time " + i + ": " + (timeEndLoop - timeStartLoop));
            timeLoop += timeEndLoop - timeStartLoop;
        }

        System.out.println("Recursion time total: " + timeRec);
        System.out.println("Loop time total: " + timeLoop);
    }

    public static long getFibonacciValueRec(int pos)
    {
        if (pos == 1 || pos == 2)
            return 1;

        return getFibonacciValueRec(pos - 1) + getFibonacciValueRec(pos - 2);
    }

    public static long getFibonacciValueLoop(int position)
    {
        if (position <= 1)
            return 0;

        long minusTwo = 0;
        long minusOne = 1;
        long fibonacciValue = 0;

        for (int i = 1; i < position; i++)
        {
            fibonacciValue = minusOne + minusTwo;
            minusOne = minusTwo;
            minusTwo = fibonacciValue;
        }
        return fibonacciValue;
    }
}