import java.util.List;

public class Calculator {
    public double calculateTotal(Order order) {
        List<String> items = order.getItems();
        double total = 0.0;

        for (String item : items) {
            total += 10.0;
        }
        return total;
    }
}
