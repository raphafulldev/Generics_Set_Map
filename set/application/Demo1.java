package set.application;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        //HashSet nao garante a ordem, mas é extremamente rápido. O TreeSet ordena por ordem alfabética
        //O LinkedHashSet mantem a ordem que em os dados foram inseridos.
        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");


        set.removeIf(x -> x.charAt(1) == 'V');

        for (String p : set) {
            System.out.println(p);
        }
        System.out.println(set.size());
    }
}
