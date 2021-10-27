public class Branch
{
    //Attributes
    Node node;
    Branch next;

    //Constructor
    public Branch(Node node, Branch next)
    {
        this.node = node;
        this.next = next;
    }

    public Branch(Node node)
    {
        this.node = node;
        this.next = null;
    }

    public Branch(Branch next)
    {
        this.node = null;
        this.next = next;
    }

    public Branch(){}
}
