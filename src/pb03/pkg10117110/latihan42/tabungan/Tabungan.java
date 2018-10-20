
package pb03.pkg10117110.latihan42.tabungan;

import java.util.Scanner;


public class Tabungan {
    private int saldo,ambil,jumlah;
    
    Scanner scan = new Scanner(System.in);
    
    public Tabungan (){
        System.out.print("Masukan Saldo Awal : ");
        saldo = scan.nextInt();
        System.out.print("Jumlah Uang Yang di ambil : ");
        ambil = scan.nextInt();
        System.out.println("Saldo Anda Sekarang : "+ambilUang());


       
        
    }
    
    public int ambilUang(){
        jumlah = saldo-ambil;
        return jumlah;

       
    }
    
}
