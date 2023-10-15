public class DoublyLinkedList
{
    Node head;
    Node tail;
    int length;

    private class Node
    {
        private int value;
        private Node next;
        private Node previous;
    }

    public DoublyLinkedList() { length = 0; }

    public int getLength() { return length; }

    public void pushFront(int value)
    {
        Node newNode = new Node();
        newNode.value = value;
        if (head != null)
        {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        else
        {
            head = newNode;
            tail = newNode;
        }
        length++;
    }

    public Integer pop()
    {
        Integer value = null;
        if (head != null)
        {
            value = head.value;
            head = head.next;
            head.previous = null;
            length--;
        }
        return value;
    }

    public void pushBack(int value)
    {
        if (tail != null)
        {
            Node newNode = new Node();
            newNode.value = value;
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        else
            pushFront(value);

        length++;
    }

    public Integer peek()
    {
        Integer value = null;
        if (tail != null)
        {
            value = tail.value;
            tail = tail.previous;
            tail.next = null;
            length--;
        }
        return value;
    }

    private Node find(int value)
    {
        Node current = head;
        while (current != null)
        {
            if (current.value == value)
                return current;

            current = current.next;
        }
        return null;
    }

    public boolean exists(int value)
    {
        return find(value) == null ? false : true;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        if (currentNode != null)
        {
            sb.append("List: {");
            while (currentNode != null)
            {
                if (currentNode.next != null)
                    sb.append(String.format("%d, ", currentNode.value));
                else
                    sb.append(String.format("%d", currentNode.value));

                currentNode = currentNode.next;
            }
            sb.append("}");
        }
        else
        {
            sb.append("List is empty");
        }
        return sb.toString();
    }
}
