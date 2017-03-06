import java.util.InputMismatchException;

/**
 * Created by i.lapshinov on 06.03.2017.
 */
public class Obobsh<T> {
    private T a;
    public Obobsh(T a){this.a = a;}
    public void setA(T a){this.a = a;}

    public T getA(){return a;}

    public static void main(String[] args)
    {
        Obobsh<Integer> a = new Obobsh<Integer>(15);
        System.out.println("Integer  " + (a.getA()+5));

        Obobsh<String> b = new Obobsh<String>("15");
        System.out.println("String   "+ b.getA() + 5);
    }
}
