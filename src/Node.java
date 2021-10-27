public class Node
{
    //Attributes
    private int value;
    private Branch next;

    //Constructor
    public Node(int value, Branch next)
    {
        this.value = value;
        this.next = next;
    }

    public Node(int value)
    {
        this.value = value;
        this.next = null;
    }

    public Node() {}

    //Getters and Setters

    public int getValue() {
        return value;
    }

    public Branch getNext() {
        return next;
    }


    //Methods

    /*
    public void add(int value) //Adds a value to the Node
    {
        Node temp = this;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new Node(value);
    }

    public void delete(int value) // Remove a value of the Node
    {
        Node temp1 = this;
        Node temp2;
        while (temp1.next.value != value)
        {
            temp1 = temp1.next;
        }
        temp2 = temp1.next;
        temp1.next = temp2.next;
        temp2 = null;
    }

    @Override
    public String toString()
    {
        Node temp;
        String str = "";

        temp = this;
        while(temp.next != null)
        {
            str += temp.value + ", ";
            temp = temp.next;
        }
        str += temp.value;
        return str;
    }
    */

}