package quis;

public class PayrollEmployee {



    private int payrollId;
    private Employee employee;
    private String description;
    private int gapok;
    private float tunjangan;

    public int getPayrollId() {
        return payrollId;
    }

    public Employee getCustomer() {
        return employee;
    }

    public String getDescription() {
        return description;
    }

    public int getGapok() {
        return gapok;
    }

    public float getTunjangan() {
        return tunjangan;
    }

    public PayrollEmployee(int payrollId, Employee employee, String description, int gapok, float tunjangan) {
        this.payrollId = payrollId;
        this.employee = employee;
        this.description = description;
        this.gapok = gapok;
        this.tunjangan = tunjangan;
    }

    public void printOut() {
        int total = 0;
        System.out.println("Hai " + this.employee.getNama());
        System.out.println("Berikut adalah payroll anda . . .");
        System.out.println("Ket       : " + this.getDescription());
        System.out.println("Gapok     : " + this.getGapok());
        System.out.println("Tunjangan : " + this.getTunjangan());
        total = (int) (this.getGapok() + this.getTunjangan());
        System.out.println("Total     : " + total);

    }



}
