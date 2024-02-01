package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("userName", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "11981287897");

        cookies.remove("email");

        cookies.put("phone", "133"); // o Map sobreescreve valores.

        System.out.println("Contains 'phone' key: "+ cookies.containsKey("phone"));
        System.out.println("Phone number: "+ cookies.get("phone"));
        System.out.println("Email: "+ cookies.get("email"));
        System.out.println("Size: "+ cookies.size());

        System.out.println();
        System.out.println("ALL COOKIES: ");

        for(Map.Entry<String, String> entry : cookies.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() );
        }

    }
}
