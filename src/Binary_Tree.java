import javax.naming.BinaryRefAddr;

/**
 * Definition Arbre binaire:
 *       Tout noeud de l'arbre binaire possède deux sous-arbres (vides ou non)
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

    //###### Méthodes de bases vues en cours ######//

    public static Binary_Tree G(Binary_Tree B) //Retourne le sous arbre gauche de la racine de B
    {
        return new Binary_Tree(B.root.left());
    }

    public static Binary_Tree D(Binary_Tree B) //Retourne le sous arbre droit de la racine de B
    {
        return new Binary_Tree(B.root.right());
    }

    public static Binary_Tree Cons(Node node, Binary_Tree G, Binary_Tree D) //Étant donné un nœud et deux arbres, crée l’arbre binaire ayant comme racine ce nœud, et comme sous-arbres de la racine le premier arbre à Gauche et le deuxième arbre à Droite
    {
        if(node.next == null)
        {
            node = new Node(node.value);
        }
        else
        {
            if(node.next.next == null)
            {
                node = new Node(node.value);
            }
        }
        node.left(G.root);
        node.right(D.root);
        node.next.next.next = null; // On s'assure que node n'a pas de troisième fils

        return new Binary_Tree(node);
    }

    public static Node Elt(Binary_Tree B)
    {
        return B.root;
    }

    //##########################################//

    


















    ///////////// Essaie non concluant de la fonction de transformation d'un arbre n-aire en arbre binaire /////////////
    /*
    public void treeToBinaryTree(Tree T)
    {
        Binary_Tree U = new Binary_Tree();
        if (!T.emptyTree())
        {
            U.root = copyNodeFromtree(T.root);
            treeToBinTree(T, U);
        }
        this.root = U.root;
    }

    public static void treeToBinTree (Tree T, Binary_Tree U) //Stocke la transformation binaire de T dans U.
    {
        Node X = T.root;
        Node Y = U.root;
        if (X.next != null)
        {
            Binary_Tree last = new Binary_Tree();
            Branch W = X.next;
            while(W.next != null)
            {
                courseTreeSons(Y, last, W);
                W = W.next;
            }
            courseTreeSons(Y, last, W);
        }
    }

    private static void courseTreeSons(Node Y, Binary_Tree last, Branch W) // --Permet d'éviter les répétitions dans le code-- Tri tous les fils du noeud Y pour les mettre sous forme binaire puis fait un appel recursif sur treeToBinTree
    {
        if (last.emptyTree())
        {
            Y.left(copyNodeFromtree(W.node));
            last.root = Y.left();
        }
        else
        {
            last.root.right(copyNodeFromtree(W.node));
            last.root = last.root.right();
        }
        treeToBinTree(new Tree(W.node), last);
    }
    */
}
