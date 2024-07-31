import java.util.Arrays;
import java.util.Comparator;
public class SearchAlgorithm {
    public static Product binarySearch(Product[] products, String productId) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(productId);
            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Product not found
    }
    public static void sortProductsById(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductId));
    }
}
