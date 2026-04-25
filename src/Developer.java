public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;

    public Developer(String employeeId, String firstName, String lastName, double baseSalary, String mainLanguage, int repositoryCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    @Override
    public double calculateMonthlyCost() {
        return super.calculateMonthlyCost() + (repositoryCount * 50);
    }

    @Override
    public String introduceYourself() {
        return "I am a Developer specializing in " + mainLanguage + ".";
    }

    public void printTechnologies() {
        System.out.println("Tech Stack: " + mainLanguage + ", Git, Docker.");
    }
}

