public class Answer
{
    Node head;
    public void reverse()
    {
        Node previous = null;
        Node current = head;
        while (current != null)
        {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        head = previous;
    }
}
