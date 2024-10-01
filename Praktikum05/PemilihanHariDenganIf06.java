//package Praktikum05;

import java.util.Scanner;

public class PemilihanHariDenganIf06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int angka;
        String dayType;

        System.out.println(",");
        System.out.print("Input number: ");
        angka = sc.nextInt();

        switch (angka) {
            case 1:
            case 2:
            case 3: 
            case 4:
            case 5:
                dayType = "weekday";
                break;
            case 6:
            case 7:
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }

        System.out.println(angka + " is a " + dayType);

        sc.close();
    }
}
