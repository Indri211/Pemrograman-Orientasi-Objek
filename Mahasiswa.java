public class Mahasiswa extends Manusia {
    private String nim;
    private String jurusan;

    public void setnim(String nim){
        this.nim = nim;
    }
    public void setjurusan(String jurusan){
        this.jurusan = jurusan;
    }    

    public String getnim(){
        return this.nim;
    }
    public String getjurusan(){
        return this.jurusan;
    }
    public void cetakInfo() {
        //memanggil methode super class.
        super.cetakInfo();

        System.out.println("NIM           : " + this.getnim());
        System.out.println("Jurusan       : " + this.getjurusan());
    }
}