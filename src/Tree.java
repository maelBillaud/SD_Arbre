/**
 * Definition Arbre :
 *      Ensemble de relation entre objets, qui ne crée pas de cycle
 *
 * Pour cette Structure de donnée, nous avons choisis la représentation des listes de sous-arbres par chaînage.
 * De plus, nous allons considerer que nous stockerons des entier. nous pouvons bien entudu étendre cette SD pour stocker des objets au d'autre type de donnée.
**/

public class Tree
{
    //Attributes
    private Node root;

    //Constructor
    public Tree(Node root)
    {
        this.root = root;
    }

    public Tree() {}

    //Methods
    public void addBranch(int value) //Ajoute une branche au niveau du noeud qui contient la valeur value
    {
        Node temp = root;
        boolean valueIn = false;
        if (temp.getNext() != null)
        {

        }
    }


    public void addNode(Node node)
    {

    }
}