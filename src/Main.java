public class Main {
    public static void main(String[] args) {
        ProjectTeam team = new ProjectTeam("Campus App");


        Employee e1 = new Developer("E-101", "Anna", "May", 12000.0, "Java", 4);
        Employee e2 = new Tester("E-201", "Peter", "Fox", 9800.0, true, 25);
        Employee e3 = new Developer("E-102", "Charles", "Smith", 11500.0, "Kotlin", 3);

        team.addEmployee(e1);
        team.addEmployee(e2);
        team.addEmployee(e3);


        team.printTeamMembers();
        System.out.println("Total monthly labor cost: $" + team.calculateTotalCost());
        System.out.println("--------------------------------------------------");


        System.out.println(e1.getFirstName() + " says: " + e1.introduceYourself());
        System.out.println(e2.getFirstName() + " says: " + e2.introduceYourself());


        System.out.println("\nChecking technical skills:");
        if (e1 instanceof Developer) {
            Developer dev = (Developer) e1;
            dev.printTechnologies();
        }


        System.out.println("\n--- Testing Equality ---");
        Employee duplicateCheck = new Tester("E-201", "New", "User", 0, false, 0);
        System.out.println("Is e2 same as duplicate ID? " + e2.equals(duplicateCheck));
        System.out.println("Is e2 same as e3? " + e2.equals(e3));
    }
}