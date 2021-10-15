
import java.util.HashMap;
import java.util.Iterator;

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>();
        
        boolean quit = false;

        	products.put("Cake", 12.99);
            products.put("Strawberries", 6.99);
        
        for(String value: products.keySet()) {
        	System.out.println("Title: " + value + "\nCost: " + products.get(value) + "\n");
        }
        
    }
}