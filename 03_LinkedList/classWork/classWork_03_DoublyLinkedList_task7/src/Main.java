// Курс: "Алгоритмы и структуры данных"
// Урок 3. Структуры данных. Связный список.
// Семинар

// Задание #6
// Добавляем метод сортировки для связного списка.
// C точки зрения работы связного списка лучше ориентироваться на пузырьковую сортировку,
// т.к. она взаимодействует с соседними элементами, а не только по индексам, как делают все остальные сортировки.

public class Main
{
    public static void main(String[] args)
    {
        DoublyLinkedList linkedList = new DoublyLinkedList();
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

        System.out.println("\n*** Push back new value ***");
        linkedList.pushBack(11);
        linkedList.pushBack(13);
        linkedList.pushBack(15);
        System.out.printf("%s [Length: %d]\n", linkedList, linkedList.getLength());

        System.out.println("\n*** Peek value ***");
        System.out.printf("Value %d deleted\n%s [Length: %d]\n", linkedList.peek(), linkedList, linkedList.getLength());

        System.out.println("\n*** Bubble sort ***");
        linkedList.bubbleSort(SortOrderEnum.ascending);
        System.out.println(linkedList);
        linkedList.bubbleSort(SortOrderEnum.descending);
        System.out.println(linkedList);
    }
}