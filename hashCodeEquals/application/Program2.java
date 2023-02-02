package hashCodeEquals.application;

public class Program2 {
    public static void main(String[] args) {

        String a = "Maria";
        String b = "Bob";

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
