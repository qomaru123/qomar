/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Asus 
 */
public class methodprosedureparameter {
    public static void main(String[] args) {
        methodprosedureparameter mahasiswa = new methodprosedureparameter();
        mahasiswa.simpan_nilai("Baruddin", 90, 80, 100);
        mahasiswa.simpan_nilai("Sugeng", 89, 90, 100);
        mahasiswa.simpan_nilai("Riadi", 96, 50, 100);
    }
    
    public void simpan_nilai(String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        String[] matkul = {"IPA ", "MTK ", "Struktuk Data "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
    
}
