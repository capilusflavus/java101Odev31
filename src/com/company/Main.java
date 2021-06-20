package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz : ");
        int sayi=scanner.nextInt();
        int birinci=0;
        int ikinci=1;
        int ucuncu=birinci+ikinci;
        System.out.println("Fibonacci Sayıları ");
        System.out.println(birinci+" + "+ikinci+" "+"= "+birinci);
        System.out.println(birinci+" + "+ikinci+" "+"= "+ikinci);
        while(sayi>0){
            sayi--;
            birinci=ikinci;
            ikinci=ucuncu;
            ucuncu=birinci+ikinci;
            System.out.println(birinci+" + "+ikinci+" "+"= "+ucuncu);

        }

    }
    }

