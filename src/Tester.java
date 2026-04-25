public class Tester extends Employee {
    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName, double baseSalary, boolean automationTester, int scenarioCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    @Override
    public double calculateMonthlyCost() {
        double bonus = automationTester ? 500.0 : 0.0;
        return super.calculateMonthlyCost() + bonus;
    }

    @Override
    public String introduceYourself() {
        String type = automationTester ? "Automation" : "Manual";
        return "I am a " + type + " Tester. Scenarios handled: " + scenarioCount;
    }

    public void runTestingReport() {
        System.out.println("Running report for " + scenarioCount + " test cases...");
    }
}
