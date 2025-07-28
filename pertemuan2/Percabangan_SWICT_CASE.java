package pertemuan2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus 
 */
public class Percabangan_SWICT_CASE {
    public static void main(String[] args) {        
        
        char menu = '2';
        System.out.println("Menu Makanan : ");
        System.out.println("1. Lele");
        System.out.println("2. Pecel");
        System.out.println("3. Tempe Penyet");
        System.out.println("4. Puyuh Goreng");
        System.out.println("terimakasih snda memilih menu no : " + menu);
        
        switch(menu){
            case '1':
            System.out.println("Pilihan Anda : " + menu + ". Lele (Rp.15.000)");
            break;
            case '2':
            System.out.println("Pilihan Anda : " + menu + ". Pecel (Rp.13.000)");
            break;
            case '3':
            System.out.println("Pilihan Anda : " + menu + ". Tempe penyet (Rp.20.000)");
            break;
            case '4':
            System.out.println("Pilihan Anda : " + menu + ". Puyuh Goreng (Rp.25.000)");
            break;
        }
    }
}

