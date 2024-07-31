//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P003", "Tablet", "Electronics"),
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics")
        };
        System.out.println("Performing linear search for product P002:");
        Product linearSearchResult = SearchAlgorithms.linearSearch(products, "P002");
        if (linearSearchResult != null) {
            System.out.println("Found: " + linearSearchResult);
        } else {
            System.out.println("Product not found.");
        }
        SearchAlgorithm.sortProductsById(products);
        System.out.println("\nProducts sorted by ID:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("\nPerforming binary search for product P002:");
        Product binarySearchResult = SearchAlgorithm.binarySearch(products, "P002");
        if (binarySearchResult != null) {
            System.out.println("Found: " + binarySearchResult);
        } else {
            System.out.println("Product not found.");
        }
    }
}