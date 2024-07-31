import java.util.HashMap;
public class InventoryManagementSystem {
    private HashMap<String, Product> inventory;

    // Constructor
    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Method to update a product
    public void updateProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Method to delete a product
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    // Method to get a product
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

}
