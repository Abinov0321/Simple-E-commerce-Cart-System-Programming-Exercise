import java.util.*;

public class Cart {
    Map<Product, Integer> items;

    public Cart() {
        items = new HashMap<>();
    }

    void addProduct(Product product) {
        try {
            if (product.available) {
                items.put(product.clone(), items.getOrDefault(product, 0) + 1);
            } else {
                System.out.println("Product is not available");
            }
        } catch (CloneNotSupportedException e) {
            System.out.println("Error cloning product: " + e.getMessage());
        }
    }

    void updateQuantity(Product product, int quantity) {
        if (items.containsKey(product)) {
            items.put(product, quantity);
        } else {
            System.out.println("Product is not in the cart");
        }
    }

    void removeProduct(Product product) {
        items.remove(product);
    }

    double calculateTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPriceAfterDiscount() * entry.getValue();
        }
        return total;
    }
}
