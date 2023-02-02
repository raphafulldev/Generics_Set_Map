package tiposCuringa.application;

import tiposCuringa.entities.Circle;
import tiposCuringa.entities.Rectangle;
import tiposCuringa.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List <Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));


        System.out.println("Total area: " + String.format("%.2f",totalArea(myShapes)));

        sc.close();

    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0;
        for (Shape x : list) {
            sum += x.area();
        }
        return sum;
    }
}
