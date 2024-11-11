//package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("...");
        System.out.print("Tahun sekarang: ");
        int tahun = sc.nextInt();

       //if ((tahun % 4) == 0) {
         //   if ((tahun % 500) != 0)
           // System.out.println("Tahun Bukan Kabisat");
        //} else
          //  System.out.println(" Tahun Kabisat");

         if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0)
                    System.out.println("Tahun Kabisat");
                else
                    System.out.println("Bukan Tahun Kabisat");
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }

            sc.close();
    }
    
}
