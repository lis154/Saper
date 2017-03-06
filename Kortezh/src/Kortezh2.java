/**
 * Created by i.lapshinov on 06.03.2017.
 */

/**
 *
 * @param <A>
 * @param <B>
 * @param <C>
 */
public class Kortezh2<A,B,C> extends Kortezh {
    private final C third;

    public Kortezh2(A a, B b, C third) {
        super(a,b);
        this.third = third;
    }
    public String toString()
    {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
