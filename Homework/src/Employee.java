import java.util.Scanner;

public class Employee {
    private double salary;
    private int hoursWorkedPerDay;

    public void getInfo(double salary, int hoursWorkedPerDay) {
        this.salary = salary;
        this.hoursWorkedPerDay = hoursWorkedPerDay;
    }

    public void AddSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void AddWork() {
        if (hoursWorkedPerDay > 6) {
            salary += 5;
        }
    }

    public double getFinalSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee's salary: $");
        double initialSalary = scanner.nextDouble();

        System.out.print("Enter the number of hours worked per day: ");
        int hoursWorked = scanner.nextInt();

        scanner.close();

        employee.getInfo(initialSalary, hoursWorked);
        employee.AddSal();
        employee.AddWork();
        double finalSalary = employee.getFinalSalary();

        System.out.println("Final Salary: $" + finalSalary);
    }
}

