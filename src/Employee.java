import java.util.Objects;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private double baseSalary;

    public Employee(String employeeId, String firstName, String lastName, double baseSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }


    public final String getEmployeeId() {
        return employeeId;
    }

    public double calculateMonthlyCost() {
        return baseSalary;
    }

    public String introduceYourself() {
        return "I am an employee: " + firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s | Base Salary: %.2f",
                employeeId, firstName, lastName, baseSalary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }

    public String getFirstName() { return firstName; }
}