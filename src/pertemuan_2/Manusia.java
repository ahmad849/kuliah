package pertemuan_2;

public class Manusia {
    String nama_manusia;
    String jenis_kelamin;

    void setNewManusia(String nama, String jenis) {
        nama_manusia = nama;
        jenis_kelamin = jenis;
    }

    void getDataManusia(){
        System.out.println("Nama Manusia    : " + nama_manusia);
        System.out.println("Jenis Kelamin   : " + jenis_kelamin);
    }

}

