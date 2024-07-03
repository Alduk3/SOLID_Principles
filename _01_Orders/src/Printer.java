import java.util.List;

public class Printer {
    public void printOrder(Order order) {
        List<String> items = order.getItems();

        System.out.println("Order:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}
