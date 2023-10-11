public class List
{
    Node head;
    Node tail;
    public class Node
    {
        int value;
        Node next;
        Node previous;
    }

    public Node find(int value)
    {
        Node currentNode = head;
        while (currentNode != null)
        {
            if (currentNode.value == value)
                return currentNode;

            currentNode = currentNode.next;
        }
        return null;
    }

    public void pushBack(int value)
    {
        Node node = new Node();
        node.value = value;
        if (head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public Integer peek()
    {
        Integer result = null;
        if (tail != null)
        {
            result = tail.value;
            tail = tail.previous;
            tail.next = null;
        }
        return result;
    }

    public void pushFront(int value)
    {
        Node node = new Node();
        node.value = value;
        if (head == null)
        {
            head = node;
            tail = node;
        } else
        {
            head.previous = node;
            node.next = head;
            head = node;
        }
    }

    public Integer pop()
    {
        Integer result = null;
        if (head != null)
        {
            result = head.value;
            head.next.previous = null;
            head = head.next;
        }
        return result;
    }

    public void addNextTo(int value, Node node)
    {
        Node newNode = new Node();
        newNode.value = value;

        Node next = node.next;
        node.next = newNode;
        newNode.previous = node;

        if (next == null)
        {
            tail = newNode;
        }
        else
        {
            next.previous = newNode;
            newNode.next = next;
        }
    }

    public void delete(Node node)
    {
        Node previous = node.previous;
        Node next = node.next;

        if (previous == null)
        {
            next.previous = null;
            head = next;
        }
        else
        {
            if (next == null)
            {
                previous.next = null;
                tail = previous;
            } else
            {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    public void revert()
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

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        if (currentNode != null)
        {
            sb.append("List: {");
        }
        while (currentNode != null)
        {
            if (currentNode == tail)
            {
                sb.append(String.format("%d} ", currentNode.value));
            }
            else
            {
                sb.append(String.format("%d, ", currentNode.value));
            }
            currentNode = currentNode.next;
        }
        return sb.toString();
    }
}
