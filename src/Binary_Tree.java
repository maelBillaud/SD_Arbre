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
        this.root.next = new Branch(null, new Branch(null, null));
    }

    //Méthodes
    public void treeToBinTree ()
    {

    }



}
