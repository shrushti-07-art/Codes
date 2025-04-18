package codes;
class Employee {
    public void work() {
        System.out.println("Employee is working");
    }

    public void getSalary() {
        System.out.println("Employee's salary is $5000");
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing the HR team and operations");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee myEmployee = new Employee();
        myEmployee.work();
        myEmployee.getSalary();

        HRManager myHRManager = new HRManager();
        myHRManager.work();
        myHRManager.getSalary();
        myHRManager.addEmployee();
    }
}


