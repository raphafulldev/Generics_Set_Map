package set.application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

//union. Junta os que tem no A e no B sem repetir numeros.
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

//intersection. Mostra somente os numeros que estao no mesmo grupo.
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

//difference. Os elementos que estão no conjunto A e que não estão no conjunto B.
        Set<Integer> e = new TreeSet<>(b);
        e.removeAll(a);
        System.out.println(e);
    }
}
