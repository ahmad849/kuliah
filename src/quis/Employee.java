package quis;

public class Employee {

    private int mhs;
    private String nama;
    private int umur;

    public Employee(int employeeId, String nama, int umur) {
        this.mhs = employeeId;
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public int getEmployeeId() {
        return mhs;
    }



}
