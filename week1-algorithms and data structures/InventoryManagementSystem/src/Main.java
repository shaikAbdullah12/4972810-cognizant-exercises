public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Product product1 = new Product("P001", "Laptop", 10, 1200.99);
        Product product2 = new Product("P002", "Smartphone", 25, 699.49);
        Product product3 = new Product("P003", "Tablet", 15, 450.89);
        ims.addProduct(product1);
        ims.addProduct(product2);
        ims.addProduct(product3);
        System.out.println("Inventory after adding products:");
        printProductDetails(ims.getProduct("P001"));
        printProductDetails(ims.getProduct("P002"));
        printProductDetails(ims.getProduct("P003"));
        Product updatedProduct2 = new Product("P002", "Smartphone", 30, 679.99);
        ims.updateProduct(updatedProduct2);
        System.out.println("\nInventory after updating product P002:");
        printProductDetails(ims.getProduct("P002"));
        ims.deleteProduct("P003");
        System.out.println("\nInventory after deleting product P003:");
        Product deletedProduct = ims.getProduct("P003");
        if (deletedProduct == null) {
            System.out.println("Product P003 is not found in the inventory.");
        }
        System.out.println("\nRemaining products in the inventory:");
        printProductDetails(ims.getProduct("P001"));
        printProductDetails(ims.getProduct("P002"));
    }
    private static void printProductDetails(Product product) {
        if (product != null) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Price: " + product.getPrice());
            System.out.println();
        }
    }
}
