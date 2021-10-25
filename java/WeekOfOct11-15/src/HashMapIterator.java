
import java.util.HashMap;

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>();

        	products.put("Cake", 12.99);
            products.put("Strawberries", 6.99);
        
        for(String value: products.keySet()) {
        	System.out.println("Title: " + value + "\nCost: " + products.get(value) + "\n");
        }
        
    }
}