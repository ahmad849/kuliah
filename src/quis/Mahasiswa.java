package quis;

public class Mahasiswa {

    private int mhs;
    private String nama;
    private int umur;

    public Mahasiswa(int customerID, String nama, int umur) {
        this.mhs = customerID;
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
        return mhs;
    }



}
