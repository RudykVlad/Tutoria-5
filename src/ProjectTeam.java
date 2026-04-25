import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printTeamMembers() {
        System.out.println("--- Team: " + projectName + " ---");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Employee e : employees) {
            total += e.calculateMonthlyCost();
        }
        return total;
    }
}