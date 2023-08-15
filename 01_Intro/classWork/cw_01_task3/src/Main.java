// Курс: Алгоритмы и структуры данных
// Урок 1: Вводная лекция. Алгоритмы. Сложность алгоритмов
// Семинар

// Задача #3
// Необходимо написать алгоритм поиска всех доступных комбинаций (посчитать количество) для количества кубиков K
// с количеством граней N.
// У вас есть 2 варианта на выбор:
// - количество кубиков может быть строго ограничено (4 кубика, например),
// - их количество будет динамическим.
// Выбор за вами.


public class Main
{
    public static void main(String[] args)
    {
        System.out.printf("Number of combinations: %d", getNumberOfCombinations(4));
    }

    public static int getNumberOfCombinations(int numberOfDices)
    {
        return (int)Math.pow(6,numberOfDices);
    }
}