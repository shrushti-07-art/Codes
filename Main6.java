package codes;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee1 extends Person {
    private String employeeId;
    private String jobTitle;

    public Employee1(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class Main6 {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());

        Employee1 employee = new Employee1("Jane", "Smith", "E12345", "Software Engineer");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name (with job title): " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
