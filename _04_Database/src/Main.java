public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        DataService dataService = new DataService(database);

        dataService.saveData("Data to save in database");
    }
}