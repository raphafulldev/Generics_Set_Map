package generics.application;

import generics.entities.PrintService;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
