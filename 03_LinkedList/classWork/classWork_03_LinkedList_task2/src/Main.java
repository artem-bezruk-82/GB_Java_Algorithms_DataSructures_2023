// Курс: "Алгоритмы и структуры данных"
// Урок 3. Структуры данных. Связный список.
// Семинар

// Задание #2
// Реализуем методы односвязного списка:
// - добавления новых элементов в начало списка
// - удаление первого элемента связного списка.

public class Main
{
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList);

        System.out.println("\n*** Push front new node ***");
        linkedList.pushFront(3);
        linkedList.pushFront(5);
        linkedList.pushFront(7);
        linkedList.pushFront(9);
        System.out.printf("%s [Length: %d]\n", linkedList, linkedList.getLength());

        System.out.println("\n*** Pop node ***");
        System.out.printf("Value %d deleted\n%s [Length: %d]\n", linkedList.pop(), linkedList, linkedList.getLength());
    }
}