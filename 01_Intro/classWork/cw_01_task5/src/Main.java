// Курс: Алгоритмы и структуры данных
// Урок 1: Вводная лекция. Алгоритмы. Сложность алгоритмов
// Семинар

// Задача #5
// Пишем алгоритм поиска нужного числа последовательности Фибоначчи,
// но в этот раз откажемся от рекурсии и воспользуемся обычным алгоритмом, что даст нам линейную сложность,
// т.к. вычисление каждого из чисел последовательности будет происходить ровно 1 раз.

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getFibonacсiValue(7));
    }

    public static int getFibonacсiValue(int position)
    {
        if (position <= 1)
            return 0;

        int minusTwo = 0;
        int minusOne = 1;
        int fibonacciValue = 0;

        for (int i = 1; i < position; i++)
        {
            fibonacciValue = minusOne + minusTwo;
            minusOne = minusTwo;
            minusTwo = fibonacciValue;
        }
        return fibonacciValue;
    }
}