package quis;

public class SaleOrder {



    private int saleId;
    private Customer customer;
    private String product;
    private int qty;
    private float price;

    public int getSaleId() {
        return saleId;
    }

    public Customer getCustomer() {
        return customer;
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

    public SaleOrder(int saleId, Customer customer, String product, int qty, float price) {
        this.saleId = saleId;
        this.customer = customer;
        this.product = product;
        this.qty = qty;
        this.price = price;
    }

    public void printOut() {
        System.out.println("Hai " + this.customer.getNama());
        System.out.println("Berikut adalah pesanan anda . . .");
        System.out.println("Product   : " + this.getProduct());
        System.out.println("Qty       : " + this.getQty());
        System.out.println("Price     : " + this.getPrice());
        System.out.println("Total     : " + this.getQty() * this.getPrice());

    }



}
