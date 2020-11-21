/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan52.siapakamu;

/**
 *
 * @author Acer
 * Nama  : HANDRIAN RIVALDI
 * Kelas : PBOIF2
 * NIM   : 10119074
 * Deskrifsi :
 */
public class IF210119074Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa objMahasiswa = new Mahasiswa();
        Dosen objDosen  = new Dosen();

        objDosen.setNip("41227829930");
        System.out.println("NIP DOSEN   : "+objDosen.getNip());
        objDosen.siapaKamu();
        objDosen.mengajarApa();
        System.out.println("");
        objMahasiswa.setNim("10110269");
        objMahasiswa.setKelas("PBO2");
        System.out.println("NIM MAHASISWA : "+objMahasiswa.getNim());
        objMahasiswa.siapaKamu();
        objMahasiswa.kelasApa();
    }
    
}
