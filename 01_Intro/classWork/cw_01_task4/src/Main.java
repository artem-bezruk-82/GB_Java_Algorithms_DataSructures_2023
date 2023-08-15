// Курс: Алгоритмы и структуры данных
// Урок 1: Вводная лекция. Алгоритмы. Сложность алгоритмов
// Семинар

// Задача #4
// 1. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
// 2. Считаем, что 1 и 2 значения последовательности равны 1.
// 3. Искать будем по формуле On=On-1+On-2 что предполагает использовать рекурсивного алгоритма.

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(fibonachiRec(5));
    }

    public static int fibonachiRec(int pos)
    {
        if (pos == 1 || pos == 2)
            return 1;

        return fibonachiRec(pos - 1) + fibonachiRec(pos - 2);
    }
}