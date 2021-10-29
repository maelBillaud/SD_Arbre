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
        this.root = null;
    }

    //Methods
    public void addRoot(Node node) //Ajoute un noeud à la racine de arbre (/!\ écrase la valeur précédante si il y en à une)
    {
        this.root = node;
    }

    public void addNode(int father, int value, Node node) //Ajoute un noeud de valeur value comme un fils du noeud qui à pour valeur father ///Faire l'appel dans main avec node = root///
    {
        Node tempN = node; //Poiteur temporaire sur un noeud
        Branch tempB = node.next; // Pointeur temporaire sur une branche

        //Cas ou on à un arbre vide

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

    public boolean emptyTree()
    {
        return this.root == null;
    }
    //Retourne une copie d'un noeud venant d'un arbre n-aire (tous les pointeurs ont été changés)
    //Différent d'une copie venant d'un BinaryTree car leurs feuilles pointent vers 2 branches dont le .node est null. (Alors que les feuilles d'un Tree pointent vers null directement)
    public static Node copyNodeFromtree(Node node)
    {
        if(node == null)
        {
            return null;
        }
        else
        {
            if (node.next == null)
            {
                return new Node(node.value, null);
            }
            else
            {
                Branch oldBranch = node.next;
                Branch newBranch;//Nouvelle branche sur laquelle va pointer le noeud copié
                Branch temp;

                newBranch = new Branch(oldBranch.node);
                copyNodeFromtree(oldBranch.node);
                temp = newBranch;
                if (oldBranch.next != null) {
                    do {
                        oldBranch = oldBranch.next;
                        temp.next = new Branch(oldBranch.node);
                        copyNodeFromtree(oldBranch.node);
                    } while (oldBranch.next != null);
                }
                return new Node(node.value, newBranch);
            }
        }
    }

    /*
    public String toString() // retourne le parcours en largeur de l'arbre (hauteur 0 sur la première ligne, puis hauteur 1 sur la deuxième ect...)
    {
        //aucune idée de comment faire
        String str = "";
        return str;
    }
     */


}