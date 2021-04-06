package com.softserve.tasks;

public class SalariedEmployee extends Employee implements IEmlpoyee{
    protected int hoursWorked;
    protected double hoursRate;

    public SalariedEmployee(String name, String employeedId, int hoursWorked, double hoursRate) {
        super(employeedId, name);
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    public SalariedEmployee(String name, int hoursWorked, double hoursRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    public SalariedEmployee(int hoursWorked, double hoursRate) {
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(double hoursRate) {
        this.hoursRate = hoursRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked*hoursRate;
    }

    @Override
    public String toString() {
        return "Salaried Employee" +
                " Id is " + employeedId +
                " his name is" + name +
                " he worked " + hoursWorked +
                " hours and his hours rate is " + hoursRate+". His average monthly wage is "+calculatePay()+"\n";
    }
}
