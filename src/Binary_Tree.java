/**
 * Definition Arbre binaire:
 *       Tout noeud de l árbre binaire possède deux sous-arbres (vides ou non)
 *
 * Un arbre binaire complet est un arbre binaire où tous les noeud internes possèdent 2 enfants
 **/

public class Binary_Tree extends Tree {
    //Constructor
    Binary_Tree(Node root)
    {
        super(root);
    }

    Binary_Tree(int value){
        super(value);
        this.root.next = new Branch(null, new Branch(null, null));
    }

    Binary_Tree()
    {
        this.root = null;
    }

    //Méthodes
    public static Node copy(Tree X) //--Voir fonction suivante-- Crée un noeud de U, copie du noeud pointé par X dans T
    {
        return X.root;
    }

    public void treeToBinTree (Tree T, Tree U) //Stocke la transformation binaire de T dans U.
    {
        Node X = T.root;
        Node Y = U.root;
        if (X.next != null)
        {
            Tree last = new Tree();
            Branch W = X.next;
            while(W != null)
            {
                courseTreeSons(Y, last, W);
                W = W.next;
            }
            courseTreeSons(Y, last, W);
        }
    }

    private void courseTreeSons(Node Y, Tree last, Branch W) // --Permet d'éviter les répétitions dans le code-- Tri tous les fils du noeud Y pour les mettre sous forme binaire puis fait un appel recursif sur treeToBinTree
    {
        if (last == new Tree())
        {
            Y.left(W.node);
            last.root = Y.left();
        }
        else
        {
            last.root.right(W.node);
            last.root = last.root.right();
        }
        treeToBinTree(new Tree(W.node), last);
    }


}
