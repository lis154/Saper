import sun.awt.image.ImageWatched;

/**
 * Created by i.lapshinov on 06.03.2017.
 */
public class LinkedStack <T>{
    private static class Node<U>{
        U item;
        Node<U> next; // внутри будет храниться объект класса (U item, Node<U>(U item,Node<U>(U item, Node<U> next)))

        Node() {item = null; next = null;}
        Node (U item, Node<U> next)
        {
            if (next != null)
            System.out.println("pervui  " + next.item);
            this.item = item;
            this.next = next;
            System.out.println(this.next.item + " " + item);
        }
        boolean end() {return item == null && next == next;}
    }

    private Node<T> top = new Node<T>();// сторож
    public void push(T item)
    {
        top = new Node(item, top);
    }

    public T pop()
    {
        T result = top.item;
        if (!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args)
    {
        LinkedStack<String> lss = new LinkedStack<String>();
        for (String s : "Phrasers on stun asdd dasa asd !".split(" "))
            lss.push(s);
        String s;
        while ((s = lss.pop()) != null)
            System.out.println(s);
    }
}
