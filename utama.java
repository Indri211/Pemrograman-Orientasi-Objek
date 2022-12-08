public class utama{
    public static void main(String[] args){

    //membuat object
    manager gaklengkap = new manager ("INDRI LESTARI");
    manager sedang = new manager ("INDRI LESTARI", 500000);
    manager lengkap = new manager("INDRI LESTARI", 6000000, 2000000);

    programmer gaklengkapprogrammer = new programmer ("FAUZI BIN HANA");
    programmer sedangprogrammer = new programmer ("FAUZI BIN HANA", 500000);
    programmer lengkapprogrammer = new programmer("FAUZI BIN HANA", 6000000, 500000);

    gaklengkap.cetakInfo();
    sedang.cetakInfo();
    lengkap.cetakInfo();

    gaklengkapprogrammer.cetakInfo();
    sedangprogrammer.cetakInfo();
    lengkapprogrammer.cetakInfo();



    }
}