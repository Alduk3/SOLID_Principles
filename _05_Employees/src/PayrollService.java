public class PayrollService {
    public void calculatePay(Employee employee) {
        double salary = employee.getSalary();
        employee.setSalary(salary);
    }
}
