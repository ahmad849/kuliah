package quis;

public class SaleOrder {



    private int saleId;
    private Mahasiswa mhs;
    private String product;
    private int qty;
    private float price;

    public int getSaleId() {
        return saleId;
    }

    public Mahasiswa getCustomer() {
        return mhs;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public float getPrice() {
        return price;
    }

    public SaleOrder(int saleId, Mahasiswa mhs, String product, int qty, float price) {
        this.saleId = saleId;
        this.mhs = mhs;
        this.product = product;
        this.qty = qty;
        this.price = price;
    }

    public void printOut() {
        System.out.println("Hai " + this.mhs.getNama());
        System.out.println("Berikut adalah pembayaran anda . . .");
        System.out.println("Product   : " + this.getProduct());
        System.out.println("Qty       : " + this.getQty());
        System.out.println("Price     : " + this.getPrice());
        System.out.println("Total     : " + this.getQty() * this.getPrice());

    }



}
