public class Manusia {
    private String nama;
    private String jenisKelamin;
    private String Umur;
    private String alamat;

    public void setnama(String nama){
        this.nama = nama;
    }
    public void setjenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setUmur(String Umur){
        this.Umur = Umur;
    }
    public void setalamat(String alamat){
        this.alamat = alamat;
    }

    public void cetakInfo() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Umur          : " + this.Umur);
        System.out.println("Alamat        : " + this.alamat);
    }
}