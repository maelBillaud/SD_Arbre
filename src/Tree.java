/**
 * Definition Arbre :
 *      Ensemble de relation entre objets, qui ne crée pas de cycle
 *
 * Pour cette Structure de donnée, nous avons choisis la représentation des listes de sous-arbres par chaînage.
 * De plus, nous allons considerer que nous stockerons des entier. Nous pouvons bien entudu étendre cette SD pour stocker des objets au d'autre type de donnée.
**/

public class Tree
{
    //Attributes
    protected Node root;

    //Constructor
    public Tree(Node root)
    {
        this.root = root;
    }

    public Tree(int value)
    {
        this.root = new Node(value, null);
    }

    public Tree()
    {
        this.root.next = null;
    }

    //Methods
    public void addRoot(int value) //Ajoute une valeur à la racine de arbre (/!\ écrase la valeur précédante si il y en à une)
    {
        this.root.value = value;
    }

    public void addNode(int father, int value, Node node) //Ajoute un noeud de valeur value comme un fils du noeud qui à pour valeur father ///Faire l'appel dans main avec node = root///
    {
        Node tempN = node; //Poiteur temporaire sur un noeud
        Branch tempB = node.next; // Pointeur temporaire sur une branche

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
        }
        else
        {
            if (tempN.next != null) {
                while (tempB.next != null) {
                    addNode(father, value, tempB.node);
                    tempB = tempB.next;
                }
                addNode(father, value, tempB.node);
            }
        }
    }

    public String toString() // retourne le parcours en largeur de l'arbre (hauteur 0 sur la première ligne, puis hauteur 1 sur la deuxième ect...)
    {
        //aucune idée de comment faire
        String str = "";
        return str;
    }


}