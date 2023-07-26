package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int ust,alt,deg=1,val2;
        System.out.println("Altı Giriniz: ");
        alt=input.nextInt();

        System.out.println("Üssü giriniz : ");
        ust=input.nextInt();


        for(int i=1; i<=ust; i++){
            deg=deg*alt;
        }
        System.out.print(deg);
    }
}