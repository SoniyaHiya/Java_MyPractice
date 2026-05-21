package java_inheritance;

class Employee {
    String name;
    int id;
    String department;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void calculatePay() {
        System.out.println("Employee Pay Calculation");
    }

    void displayEmployee() {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + department);
    }
}

class FullTimeEmployee extends Employee {

    double fixedSalary;

    FullTimeEmployee(String name, int id,
                     String department, double fixedSalary) {

        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }

    void calculatePay() {
        System.out.println("Full Time Salary: " + fixedSalary);
    }
}

class PartTimeEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id,
                     String department,
                     double hourlyRate,
                     int hoursWorked) {

        super(name, id, department);

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    void calculatePay() {
        double salary = hourlyRate * hoursWorked;

        System.out.println("Part Time Salary: " + salary);
    }
}

class ContractEmployee extends Employee {

    String projectName;
    double contractAmount;

    ContractEmployee(String name, int id,
                     String department,
                     String projectName,
                     double contractAmount) {

        super(name, id, department);

        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    void calculatePay() {
        System.out.println("Contract Amount: " + contractAmount);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        FullTimeEmployee f1 = new FullTimeEmployee(
                "Soniya",
                101,
                "SWE",
                70000
        );

        PartTimeEmployee p1 = new PartTimeEmployee(
                "Mubasshir",
                102,
                "SWE",
                500,
                60
        );

        ContractEmployee c1 = new ContractEmployee(
                "Hiya",
                103,
                "IT",
                "Software Project",
                120000
        );

        System.out.println(" Full Time Employee ");
        f1.displayEmployee();
        f1.calculatePay();

        System.out.println("\n Part Time Employee");
        p1.displayEmployee();
        p1.calculatePay();

        System.out.println("\n Contract Employee ");
        c1.displayEmployee();
        c1.calculatePay();
    }
}