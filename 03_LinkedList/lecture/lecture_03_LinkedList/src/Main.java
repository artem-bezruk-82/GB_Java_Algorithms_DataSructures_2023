
public class Main
{
    public static void main(String[] args)
    {
        List list = new List();

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        System.out.println(list);

        list.pushFront(-1);
        list.pushFront(-2);
        list.pushFront(-3);
        System.out.println(list);

        //add node with value 13 right after node with value 3
        int valueNew = 13;
        List.Node nodeA = list.find(3);
        if (nodeA != null)
        {
            list.addNextTo(valueNew, nodeA);
        }
        System.out.println(list);

        //delete node with value 2
        List.Node nodeToDelete = list.find(2);
        if (nodeToDelete != null)
        {
            list.delete(nodeToDelete);
        }
        System.out.println(list);

        System.out.printf("pop front: %d\n", list.pop());
        System.out.println(list);
        System.out.printf("peek back: %d\n", list.peek());
        System.out.println(list);

        list.revert();
        System.out.println(list);


    }
}