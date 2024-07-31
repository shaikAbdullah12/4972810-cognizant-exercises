public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Load and display image1
        System.out.println("First call to display image1:");
        image1.display();

        // Load and display image2
        System.out.println("\nFirst call to display image2:");
        image2.display();

        // Display image1 again, should be loaded from cache
        System.out.println("\nSecond call to display image1:");
        image1.display();
    }
}

