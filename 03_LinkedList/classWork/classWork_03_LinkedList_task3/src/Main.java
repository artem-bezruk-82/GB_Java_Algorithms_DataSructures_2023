// Курс: "Алгоритмы и структуры данных"
// Урок 3. Структуры данных. Связный список.
// Семинар

// Задание #3
// Реализуем метод поиска элемента в односвязном списке для проверки наличия элемента внутри списка.

public class Main
{
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList);

        System.out.println("\n*** Push front new value ***");
        linkedList.pushFront(3);
        linkedList.pushFront(5);
        linkedList.pushFront(7);
        linkedList.pushFront(9);
        System.out.printf("%s [Length: %d]\n", linkedList, linkedList.getLength());

        System.out.println("\n*** Pop value ***");
        System.out.printf("Value %d deleted\n%s [Length: %d]\n", linkedList.pop(), linkedList, linkedList.getLength());

        System.out.println("\n*** Find value ***");
        int value = 5;
        System.out.printf("List %s value %d\n", (linkedList.exists(value) ? "contains" : "does not contain"), value);
        value = 15;
        System.out.printf("List %s value %d\n", (linkedList.exists(value) ? "contains" : "does not contain"), value);

    }
}