package ru.mirea.Panferov.task4;

public class Report {
    static public void generateReport(Employee[] employees){
        for (int i = 0; i < employees.length; i++) System.out.printf("Зарплата: %.2f\n", employees[i].getSalary());
    }
}
