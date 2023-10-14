public class LinkedList
{
    private Node head;
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
                sb.append(String.format("%d, ", currentNode.value));
                currentNode = currentNode.next;
            }
            sb.append("%d}");
        }
        else
        {
            sb.append("List is empty");
        }
        return sb.toString();
    }
}
