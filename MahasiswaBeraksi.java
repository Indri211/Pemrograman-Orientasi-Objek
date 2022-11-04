public class MahasiswaBeraksi {
    public static void main(String[] args){
        //membuat object
        Mahasiswa anton = new Mahasiswa();

        /*memanggil atribut dan memberi nilai */
        anton.setnim(nim:"101020201");
        anton.setnama(nama:"Anton Santoso");
        anton.setjenisKelamin(jenisKelamin:"Laki-laki");
        anton.setUmur(Umur:"28");
        anton.setalamat(alamat:"Bekasi Kota");
        anton.setjurusan(jurusan:"Informatika");

        anton.cetakInfo();
    }
}