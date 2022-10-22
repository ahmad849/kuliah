package quis;


import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer(1, "jodghi", 29);
        SaleOrder so = new SaleOrder(9, customer, "Kopi", 9, 20000);
        so.printOut();

    }
}
