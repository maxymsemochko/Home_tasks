package com.softserve.tasks;

class Main {

    public static void main(String[] args) {
        Employee employee1 = new ContractEmployee("Max","45", 2000);
        Employee employee2 = new SalariedEmployee("Petya","54" ,5, 525.5);
        Employee employee3 = new SalariedEmployee("Vanya","123", 5, 540);
        Employee employee4 = new ContractEmployee("Bodya","321", 2300);

        Employee[] employees = new Employee[4];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

}