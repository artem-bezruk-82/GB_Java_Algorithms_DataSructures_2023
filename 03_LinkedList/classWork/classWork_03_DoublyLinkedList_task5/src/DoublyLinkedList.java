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
