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


        System.out.println(test.root.value);

        System.out.print(test.root.next.node.value);
        System.out.print(" " + test.root.next.next.node.value);
        System.out.println(" " + test.root.next.next.next.node.value);

        System.out.print(test.root.next.node.next.node.value);
        System.out.print(" " + test.root.next.next.node.next.node.value);
        /*
        System.out.println(" " + test.root.next.next.next.node.next.node.value);

        System.out.print(test.root.next.node.next.node.next.node.value);
        System.out.print(" " + test.root.next.node.next.node.next.next.node.value);

         */

    }
}