package codes;

class Employee11 {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee11(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.1;  // Default bonus calculation as 10% of salary
    }

    public void generatePerformanceReport() {
        System.out.println(name + " is performing well in their role as " + jobTitle);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}

class Manager extends Employee11 {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;  // Managers get a 20% bonus
    }

    public void manageProject() {
        System.out.println("Managing a high-level project.");
    }
}

class Developer extends Employee11 {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;  // Developers get a 15% bonus
    }

    public void developSoftware() {
        System.out.println("Developing software solutions.");
    }
}

class Programmer extends Employee11 {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.12;  // Programmers get a 12% bonus
    }

    public void writeCode() {
        System.out.println("Writing code for various software projects.");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "123 Manager St.", 80000);
        Developer developer = new Developer("Bob", "456 Developer Ave.", 70000);
        Programmer programmer = new Programmer("Charlie", "789 Programmer Rd.", 60000);

        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println("Bonus: $" + manager.calculateBonus());
        manager.generatePerformanceReport();
        manager.manageProject();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
        System.out.println("Bonus: $" + developer.calculateBonus());
        developer.generatePerformanceReport();
        developer.developSoftware();

        System.out.println("\nProgrammer Details:");
        programmer.displayDetails();
        System.out.println("Bonus: $" + programmer.calculateBonus());
        programmer.generatePerformanceReport();
        programmer.writeCode();
    }
}
