package pertemuan_2;

public class main {
    public static void main(String[] args){

        PesawatTelfon pesawat = new PesawatTelfon();
        pesawat.setNewPesawat("Pesawat Boing", "F-15", 1200000);
        pesawat.getDataPesawat();

        Manusia orang = new Manusia();
        orang.setNewManusia("Jhoni", "Cewo");
        orang.getDataManusia();

    }
}
