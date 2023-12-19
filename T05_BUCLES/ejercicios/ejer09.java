import java.util.Scanner;

public class ejer09 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long numeroIntroducido;
    int numeroCifras = 1; 

    System.out.print("Introduzca un número y te diré cuantos dígitos tiene: ");
    numeroIntroducido = sc.nextLong();
    long n = numeroIntroducido;
    sc.close();
    
    while (0 >= 10) {
        n /=10;
        numeroCifras = 1;

         System.out.print("Introduzca un número y te diré cuantos dígitos tiene: ");
    numeroIntroducido = sc.nextLong();
    long n = numeroIntroducido;
    sc.close();
    }


  }
}

