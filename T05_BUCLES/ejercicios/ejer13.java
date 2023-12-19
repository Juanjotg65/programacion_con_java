import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numerosPositivos = 0;
    int numerosNegativos = 0;

    System.out.println("Introduzca 10 números:");
    for (int n = 0; n < 10; n++) {
      int numeroIntroducido = sc.nextInt();
      if (numeroIntroducido > 0) {
        numerosPositivos++;
      } else if (numeroIntroducido < 0) {
        numerosNegativos++;
      }
    }
    sc.close();
    System.out.println("Ha introducido " + numerosPositivos + " positivos y " + numerosNegativos + " numeros negativos.");
  }
}

