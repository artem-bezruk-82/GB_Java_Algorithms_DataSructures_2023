// Курс: "Алгоритмы и структуры данных"
// Урок 3. Структуры данных. Связный список.
// Домашнее задание

// Задание
// Реализовать метод разворота связного списка
public class Main
{
    public static void main(String[] args)
    {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.pushFront(3);
        linkedList.pushFront(5);
        linkedList.pushFront(7);
        linkedList.pushFront(9);
        System.out.println(linkedList);

        System.out.println("\n*** Reverse list ***");
        linkedList.revert();
        System.out.println(linkedList);
    }
}