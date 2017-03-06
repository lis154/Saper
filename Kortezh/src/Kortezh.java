/**
 * Created by i.lapshinov on 06.03.2017.
 */

import java.util.SimpleTimeZone;

/**
 *
 * @param <A>
 * @param <B>
 */
public class Kortezh <A,B> {
    public final A first;
    public final B second;
    public Kortezh(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public String toString(){return "(" + first + ", " + second + ")";}


    public static void main (String[] args)
    {
        Kortezh2<String, Integer, Double> a = new Kortezh2<String, Integer, Double>("ttt", 5, 7.58);

        System.out.println(a);
    }
}






