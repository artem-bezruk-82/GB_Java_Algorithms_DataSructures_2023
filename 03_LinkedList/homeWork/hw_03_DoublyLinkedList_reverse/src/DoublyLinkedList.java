public class DoublyLinkedList
{
    Node head;
    Node tail;
    int length;

    private class Node implements Comparable<Node>
    {
        private Integer value;
        private Node next;
        private Node previous;


        @Override
        public int compareTo(Node obj)
        {
            if (obj == null)
            {
                return 1;
            }
            return this.value.compareTo(obj.value);
        }
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
        return find(value) != null;
    }

    private void swap(Node left, Node right)
    {
        Node before = left.previous;
        Node after = right.next;
        left.next = after;
        left.previous = right;
        right.next = left;
        right.previous = before;

        if (before != null)
            before.next = right;
        else
            head = right;

        if (after != null)
            after.previous = left;
        else
            tail = left;
    }

    public void bubbleSort(SortOrderEnum sortOrder)
    {
        if (length > 1)
        {
            for (int i = 0; i < length ; i++)
            {
                Node current = head;
                while (current != null && current.next != null)
                {
                    switch (sortOrder)
                    {
                        case ascending ->
                        {
                            if (current.compareTo(current.next) > 0)
                                swap(current, current.next);
                        }
                        case descending ->
                        {
                            if (current.compareTo(current.next) < 0)
                                swap(current, current.next);
                        }
                    }
                    current = current.next;
                }
            }
        }
    }

    public void revert()
    {
        if (length > 1)
        {
            Node currentNode = head;
            while (currentNode != null)
            {
                Node next = currentNode.next;
                Node previous = currentNode.previous;
                currentNode.next = previous;
                currentNode.previous = next;
                if (previous == null)
                {
                    tail = currentNode;
                }
                if (next == null)
                {
                    head = currentNode;
                }
                currentNode = next;
            }
        }
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