public class main
{
    public static void main (String[] args)
    {
        Node test = new Node(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.delete(4);

        System.out.println(test.toString());
    }
}