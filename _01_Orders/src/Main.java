import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");

        Order order = new Order(items);

        Calculator calculator = new Calculator();
        double totalAmount = calculator.calculateTotal(order);

        Printer printer = new Printer();
        printer.printOrder(order);


        Database databaseSaver = new Database();
        databaseSaver.saveToDatabase(order);
    }
}