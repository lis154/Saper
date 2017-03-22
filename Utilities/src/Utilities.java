import sun.text.resources.lt.CollationData_lt;

import java.util.*;

/**
 * Created by i.lapshinov on 22.03.2017.
 * Команды применяемыв для работы с Collections
 */
public class Utilities {
    static List<String> list = Arrays.asList("one Two tree Four five six one".split(" "));
    public static void main(String[] args) {
        print(list);
        print("'list' disjoint (For)? " + Collections.disjoint(list, Collections.singletonList("Four")));

        print("max: " + Collections.max(list));
        print("min: " + Collections.min(list));

        print ("max w/ comparator: " + Collections.max(list, String.CASE_INSENSITIVE_ORDER));
        print ("min w/ comparator: " + Collections.min(list, String.CASE_INSENSITIVE_ORDER));

        List<String> sublist = Arrays.asList("For five six".split(" "));
        print("indexOfSublist: " + Collections.indexOfSubList(list, sublist));

        Collections.replaceAll(list, "one", "Yo");

        print("replaceAll: " + list);

        Collections.reverse(list);

        print ("reverce: " + list);

        Collections.rotate(list, 3);

        print("rotate: " + list);

        List<String> source = Arrays.asList("in eth matrix".split(" "));
        Collections.copy(list, source);
        print("copy: " + list);

        Collections.swap(list, 0, list.size() - 1);
        print("swap: " + list);

        Collections.shuffle(list, new Random(47));
        print("shuffle: "+  list);

        Collections.fill(list, "pop");
        print("fill: " + list );

        print("frequency of 'pop': " + Collections.frequency(list, "pop"));

        List<String> dups = Collections.nCopies(3, "snap");
        print("dups: " + dups);

        print("'list' disjoint 'dups'?: " + Collections.disjoint(list, dups));

        Enumeration<String> e = Collections.enumeration(dups);
        Vector<String> v = new Vector<String>();
        while(e.hasMoreElements())
            v.addElement(e.nextElement());

        //Преобразование Vector в старом стиле

        ArrayList<String> arrayList = Collections.list(v.elements());
        print("arrayList: " + arrayList);

    }
    public static <T>  void print(T t)
    {
        System.out.println(t);
    }
}
