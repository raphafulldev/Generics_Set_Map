package map;

import java.util.Map;
import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {

        Map<String,String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

//        cookies.remove("email");


        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Contains 'username' key: " + cookies.containsKey("username"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Name: " + cookies.get("username"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("====================");
        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
