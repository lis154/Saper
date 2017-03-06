import sun.nio.cs.Surrogate;
import java.util.*;
/**
 * Created by i.lapshinov on 06.03.2017.
 */
public class Fibonacci //implements Generator<Integer>
{
    private int count = 0;
    private Integer next() {return fib(count++);}
    private int fib(int n)
    {
        if (n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args)
    {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.println(gen.next() + " ");
        }
    }


}
