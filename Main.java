import java.text.DecimalFormat;
import java.io.*;
import java.util.Scanner;
 

public class Main {
    private static Object tanyalagi;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
        int jamKerja, jumlah, golongan, Lembur, lamaKerja, gajiPokok, jamLembur ;
        float gajiBersih;
        
        String namaKaryawan;
        String nama = "";
        String tanya;
        String tanyalagi;
 
        System.out.print("\n\tMasukan Nama : ");
        namaKaryawan=in.next();
   
        System.out.print("\tMasukan Golongan : ");
        golongan=in.nextInt();
   
        System.out.print("\tMasukan Jam Kerja : ");
        jamKerja=in.nextInt();
       
       
        if (jamKerja>135){
            jamLembur=jamKerja-135;
        }else{
            jamLembur=0;
        }
        switch(golongan){
          case 1 :
                    gajiPokok=1500000;
                    lamaKerja=250000;
                    break;
            case 2 :
                    gajiPokok=1850000;
                    lamaKerja=280000;
                    break;
            case 3 :
                    gajiPokok=2000000;
                    lamaKerja=320000;
                    break;
            default :
                    gajiPokok=0;
                    lamaKerja=0;
        }
 
        Lembur=jamLembur*20000;
        gajiBersih=((Lembur+gajiPokok+lamaKerja));
 
        System.out.println("\n\t========================\n");
        System.out.println("\tNama Karyawan        : "+namaKaryawan);
        System.out.println("\tGaji Pokok 1 Bulan   : "+gajiPokok);
        System.out.println("\tGaji Lembur          : "+Lembur);
        System.out.println("\tTunjangan Lama Kerja : "+lamaKerja);
        System.out.println("\tGaji Bersih          : "+gajiBersih);
        
        
        System.out.print("Apakah Data sudah benar (y/t) : ");
   tanya=in.next();
   
   if (tanya.equalsIgnoreCase("y")){
    Terimakasih();
    }
   else {
    ulang();
   }
   
}private static void Terimakasih(){  
   System.out.println();
   System.out.println("=================================================");
   System.out.println("                  TERIMAKASIH");
   System.out.println("=================================================");
}private static void ulang(){
  Scanner in = new Scanner(System.in);
  System.out.print("Apakah ingin di ulang? (y/t) : ");
  Main.tanyalagi = in.next();
  if (((String)tanyalagi).equalsIgnoreCase("y")){
   main(null);
  }
  else { 
   Terimakasih();
}}}