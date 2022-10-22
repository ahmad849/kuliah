package quis;


import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee(1, "jodghi", 29);
        PayrollEmployee payroll = new PayrollEmployee(9, employee, "Payroll", 90000, 20000);
        payroll.printOut();

    }
}
