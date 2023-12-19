package ejercicios;

import java.util.Scanner;

public class ejer_06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final double G = 9.81;    //Como g es un valor constante (gravedad), lo declaramos como tal
    double h;

    System.out.println("Cálculo del tiempo de caída de un objeto.");
    System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
    h = sc.nextDouble();
    
    double t = Math.sqrt(2*h/G);
    
    System.out.printf("El objeto tarda %.2f\" en caer.\n", t);
    
    sc.close();
  }
}
