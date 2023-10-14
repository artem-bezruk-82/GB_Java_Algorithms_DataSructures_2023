public class LinkedList
{
    private Node head;
    private Node tail;
    private int length;

    private class Node
    {
        private int value;
        private Node next;
    }

    public LinkedList()
    {
        length = 0;
    }

    public int getLength() { return length; }

    public void pushFront(int value)
    {
        Node newNode = new Node();
        newNode.value = value;
        if (head != null)
            newNode.next = head;
        else
            tail = newNode;

        head = newNode;
        length++;
    }

    public Integer pop()
    {
        Integer value = null;
        if (head != null)
        {
            value = head.value;
            head = head.next;
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

    public void pushBack(int value)
    {
        Node newNode = new Node();
        newNode.value = value;
        if (head != null)
        {
            tail.next = newNode;
            tail = newNode;
            length++;
        }
        else
            pushFront(value);
    }

    public Integer peek()
    {
        Integer value = null;
        if (tail != null)
        {
            value = tail.value;
            Node current = head;

            while (current.next.next != null)
            {
                current = current.next;
            }
            current.next = null;
            tail = current;
            length--;
        }
        return value;
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