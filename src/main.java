public class main
{
    public static void main (String[] args)
    {

        Tree test = new Tree(1);
        test.addNode(1, 2, test.root);
        test.addNode(1, 3, test.root);
        test.addNode(1, 4, test.root);
        test.addNode(2, 5, test.root);
        test.addNode(3, 6, test.root);
        test.addNode(4, 7, test.root);
        test.addNode(5, 8, test.root);
        test.addNode(5, 9, test.root);

        //Test copie d'un noeud == null
        Tree test1 = new Tree(1);
        System.out.print(test1.root);
        System.out.println(" " + test1.root.value);
        //Test copie d'une feuille
        System.out.print(Tree.copyNodeFromtree(test1.root));
        System.out.println(" " + Tree.copyNodeFromtree(test1.root).value);
        //Test copie arbre entier
        Tree copied = new Tree();
        copied.addRoot(Tree.copyNodeFromtree(test.root));







        /*
        Binary_Tree testB = new Binary_Tree();
        testB.treeToBinaryTree(test);
        System.out.println("kk");

         */


    }
}