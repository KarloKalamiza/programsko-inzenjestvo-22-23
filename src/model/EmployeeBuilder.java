package model;

public class EmployeeBuilder {

    private final Employee employee;

    public EmployeeBuilder(String name) {
        employee = new Employee(name);
    }

    public EmployeeBuilder setSalary(double salary){
        employee.setSalary(salary);
        return this;
    }

    public Employee build(){
        return employee;
    }
}