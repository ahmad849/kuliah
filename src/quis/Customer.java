package quis;

public class Customer {

    private int customerId;
    private String nama;
    private int umur;

    public Customer(int customerID, String nama, int umur) {
        this.customerId = customerID;
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public int getCustomerID() {
        return customerId;
    }



}
