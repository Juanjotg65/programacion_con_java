package Examen;

import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        año=6;

        System.out.println("VIDA UTIL SSD");
        System.out.println("===============");

        System.out.println("Introduzca el factor TBW de tu disco duro SSD: ");
        double  TWB = sc.nextDouble();

        double TBxdia = TWB /(año*360);
        double GB = TBxdia * 100;

        System.out.printf("La cantidad maxima de TB que puedes escribir por dia es: %4f TB  (%2f GB)", TBxdia, GB);
    }
}
