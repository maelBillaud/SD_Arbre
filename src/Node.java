public class Node
{
    //Attributes
    int value;
    Branch next;

    //Constructor
    public Node(int value, Branch next)
    {
        this.value = value;
        this.next = next;
    }

    public Node(int value)
    {
        this.value = value;
        this.next = new Branch(null, new Branch(null, null));
    }

    public Node() {}

    //Methods
    public void left(Node node)
    {
        this.next.node = node;
    }

    public Node left()
    {
        return this.next.node;
    }
    public void right(Node node)
    {
        this.next.next.node = node;
    }

    public Node right()
    {
        return this.next.next.node;
    }
}