package pertemuan_2;

public class PesawatTelfon {
    String nama_pesawat;
    String jenis_pesawat;
    float harga_pesawat;

    void setNewPesawat(String nama, String jenis, float harga) {
        nama_pesawat = nama;
        jenis_pesawat = jenis;
        harga_pesawat = harga;
    }

    void getDataPesawat(){
        System.out.println("Nama    : " + nama_pesawat);
        System.out.println("Jenis   : " + jenis_pesawat);
        System.out.println("harga   : " + harga_pesawat);
        System.out.println();
    }

}
