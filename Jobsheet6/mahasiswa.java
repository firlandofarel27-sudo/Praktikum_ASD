package Jobsheet6;

public class mahasiswa {
     String NIM;
    String Nama;
    String Kelas;
    double IPK;

   mahasiswa(String NM, String Name, String Kls, double Ip){
        NIM=NM;
        Nama= Name;
        IPK= Ip;
        Kelas=Kls;
    }

    void TampilInformasi(){
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Kelas: " + Kelas);
        System.out.println("IPK: " + IPK);
        
    }
}
