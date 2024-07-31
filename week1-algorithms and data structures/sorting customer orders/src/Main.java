//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O003", "Alice", 250.75),
                new Order("O001", "Bob", 120.50),
                new Order("O002", "Charlie", 320.40),
                new Order("O004", "David", 80.00)
        };
        System.out.println("Performing bubble sort:");
        SortingAlgorithms.bubbleSort(orders);
        printOrders(orders);
        orders = new Order[] {
                new Order("O003", "Alice", 250.75),
                new Order("O001", "Bob", 120.50),
                new Order("O002", "Charlie", 320.40),
                new Order("O004", "David", 80.00)
        };
        System.out.println("\nPerforming quick sort:");
        SortingAlgorithm.quickSort(orders, 0, orders.length - 1);
        printOrders(orders);
    }
    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
        System.out.println();
    }
}