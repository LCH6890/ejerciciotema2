package Tema2;

import java.util.Scanner;

public class tema2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double priceBase=0.0;
        int iva=21;
        double PriceFinal=0;



        System.out.println("Indique precio del artículo");
        priceBase=sc.nextDouble();

        double priceFinal=priceBase*21/100;
        System.out.println(priceFinal+priceBase+" iva incluido");

        }
    }

