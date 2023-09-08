package test1;

public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int id) {
        employee_id = id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String name) {
        employee_name = name;
    }

    public double getEmployeeSalary() {
        return employee_salary;
    }

    public void setEmployeeSalary(double salary) {
        employee_salary = salary;
    }

    public String toString() {
        return "Employee ID: " + employee_id + "\nEmployee Name: " + employee_name + "\nEmployee Salary: " + employee_salary;
    }



    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(7);
        emp.setEmployeeName("prajakta");
        emp.setEmployeeSalary(2000.0);

        System.out.println(emp.toString());
    }
}