package tiposCuringa.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {


        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();
        copy(myInts, myObjs);
        print(myObjs);
        copy(myDoubles, myObjs);
        print(myObjs);

    }
    public static void copy (List<? extends Number> source, List<? super Number> destiny){
        for (Number number : source){
            destiny.add(number);
        }
    }
    public static void print (List <?> list){
        for (Object x : list){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
