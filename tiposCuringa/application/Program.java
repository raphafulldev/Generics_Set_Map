package tiposCuringa.application;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.in;

public class Program {
    public static void main(String[] args) {

        List<Integer > myInts = Arrays.asList(5,2,10);
        printList(myInts);

        List<String > myStrs = Arrays.asList("maria", "Anna", "Bob");
        printList(myStrs);
    }
    public static void printList(List<?> list) {
//        list.add(3); não é possível adicionar dados a uma coleção do tipo coringa.
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}


