package com.softserve.tasks;

public class ContractEmployee extends Employee implements IEmlpoyee{

    protected int salary = 2500;

    public ContractEmployee(int salary) {
        this.salary = salary;
    }

    public ContractEmployee(String name, String employeedId, int salary) {
        super(employeedId, name);
        this.salary = salary;
    }
    public ContractEmployee(){}

    public ContractEmployee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return "Salaried Employee" +
                " Id is " + employeedId +
                " his name is" + name +
                " and his salary is "+salary+"\n";
    }
}
