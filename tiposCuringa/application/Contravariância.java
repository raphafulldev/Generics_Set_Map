package tiposCuringa.application;

import java.util.*;

import static java.lang.System.in;

public class Contravariância {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        List<Object> myObj = new ArrayList<>();
        myObj.add("Maria");
        myObj.add("Alex");

        List<? super Number> myNums = myObj;

        myNums.add(10);
        myNums.add(3.14);

//        Number x = myNums.get(0);
//        Get - error e put é permitido


        sc.close();
    }
}
