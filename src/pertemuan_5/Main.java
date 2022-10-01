
package pertemuan_5;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {


    private static int grandTotal =0;

    public static void main (String[] args){
        Scanner input =new Scanner(System.in);
        Integer inputMenuCafe=0;

        ArrayList<Order> daftarPesananPembeli=new ArrayList();
        do{
            System.out.println("=============CAFE KU=============");
            System.out.println("          1. Pesanan");
            System.out.println("          2. Pembayaran");
            System.out.println("          3. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih [1, 2, 3] :");
            inputMenuCafe = input.nextInt();

            if(inputMenuCafe == 1){
                daftarPesananPembeli = pembelian(daftarPesananPembeli);

            } else if(inputMenuCafe==2){
                //View Pesanan
                daftarPesananPembeli = pembayaran(daftarPesananPembeli);
                int totalBayar = grandTotal;
                if(totalBayar > 0){
                    System.out.println("MASUKAN JUMLAH UANG PEMBAYARAN:");
                    Integer jmlUang = input.nextInt();
                    if (jmlUang < totalBayar){
                        do {
                            System.out.println("JUMLAH UANG YANG DIMASUKAN KURANG DARI HARGA TAGIHAN");
                            System.out.println("MASUKAN JUMLAH UANG PEMBAYARAN :");
                            jmlUang = input.nextInt();

                        }while (jmlUang < totalBayar);

                        System.out.println("Kembalian : "+(jmlUang-totalBayar));
                    }else{
                        System.out.println("Kembalian : "+(jmlUang-totalBayar));
                    }
                    daftarPesananPembeli.clear();
                } else {
                    System.out.println("INPUT UANG TIDAK BOLEH MINUS");
                }
            }
        }while (inputMenuCafe != 3);
    }

    private static ArrayList<Order> pembelian(ArrayList<Order> listPesan) {
        String drinkName,gula;
        Integer harga,qty;
        Scanner input=new Scanner(System.in);

        System.out.println("[americano, latte, arabika] ");
        System.out.println("INPUT NAMA MINUMAN : ");
        drinkName = input.nextLine();
        if(!drinkName.equalsIgnoreCase("americano") && !drinkName.equalsIgnoreCase("latte") && !drinkName.equalsIgnoreCase("arabika")){
            do{
                System.out.println("NAMA MINUMAN TIDAK SESUAI DARI DAFTAR MENU");
                System.out.println("[americano, latte, arabika] ");
                System.out.println("INPUT NAMA MINUMAN : ");
                drinkName = input.nextLine();
            }while(!drinkName.equalsIgnoreCase("americano") && !drinkName.equalsIgnoreCase("latte") && !drinkName.equalsIgnoreCase("arabika"));
        }
        System.out.println("LEVEL GULA :");             gula = input.nextLine();
        System.out.println("PRICE : ");                 harga = input.nextInt();
        System.out.println("JUMLAH YANG DIPESAN : ");   qty = input.nextInt();
        if(qty <= 0){
            do{
                System.out.println("MINIMUM PEMBELIAN ADALAH 1");
                System.out.println("JUMLAH YANG DIPESAN : ");
                qty = input.nextInt();
            }while (qty <= 0);
        }
        listPesan.add(new Order(drinkName,gula,harga,qty));
        return listPesan;
    }

    private static ArrayList<Order> pembayaran(ArrayList<Order> listPesan) {
        Scanner sc=new Scanner(System.in);
        grandTotal = 0;
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("| %-10s | %-5s | %-7s | %-7s | %-7s |",
                "Nama",
                "Gula",
                "Harga",
                "Jumlah Barang",
                "Total" );
        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < listPesan.size(); i++) {
            System.out.printf("| %-7s  | %-5s  | %-7s  | %-7s  | %-7s |",
                    listPesan.get(i).getNama(),
                    listPesan.get(i).getGula(),
                    listPesan.get(i).getHarga(),
                    listPesan.get(i).getQty(),
                    (listPesan.get(i).getHarga()*listPesan.get(i).getQty()));
            grandTotal = grandTotal +(listPesan.get(i).getHarga()*listPesan.get(i).getQty());
            System.out.println();
            System.out.println("---------------------------------------------------------------------");

        }
        System.out.println("Harga : "+ grandTotal);

        if(grandTotal ==0){
            System.out.println("Tekan Enter...");
            sc.nextLine();
        }
        return  listPesan;
        
    }
}