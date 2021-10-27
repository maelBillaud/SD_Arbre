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
        this.next = null;
    }

    public Node() {}

    //Methods
    public boolean addNode(int father, int value) //Ajoute un noeud de valeur value comme un fils du noeud qui à pour valeur father. Retourne vrai si si un fils à été ajouté
    {
        Node tempN = this; //Poiteur temporaire sur un noeud
        Branch tempB; //Pointeur temporaire sur une branche

        if (tempN.value == father)
        {
            if (tempN.next == null)
            {
                tempN.next = new Branch(new Node(value, null), null);
            }
            else
            {
                tempB = tempN.next;
                while(tempB.next != null)
                {
                    tempB= tempB.next;
                }
                tempB.next = new Branch(new Node(value, null), null);
            }
            return true;
        }
        return false;
    }

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