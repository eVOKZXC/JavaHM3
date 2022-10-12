package ru.mirea.Panferov.task4;

public class Program {
    static public void main(String[] args){
        Employee[] employees = new Employee[5];
        for (int i = 1; i < 6; i++) employees[i-1] = new Employee("Работник", i*23809.231);
        Report.generateReport(employees);
    }
}
