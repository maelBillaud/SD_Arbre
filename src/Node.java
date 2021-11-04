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
    public void left(Node node) //Ajoute node dans le sous arbre gauche du noeud this
    {
        this.next.node = node;
    }
    public Node left() //Retourne la racine du sous arbre gauche du noeud this
    {
        return this.next.node;
    }

    public void right(Node node) //Ajoute node dans le sous arbre droit du noeud this
    {
        this.next.next.node = node;
    }
    public Node right() //Retourne la racine du sous arbre droit du noeud this
    {
        return this.next.next.node;
    }
}