import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 1;

    System.out.print("Introduzca la base: ");
    int base = sc.nextInt();

    System.out.print("Introduzca el exponente: ");
    int exponente = sc.nextInt();

    if (exponente == 0) {
      resultado = 1;
    } else if (exponente > 0) {
      for (int i = 1; i <= exponente; i++) {
        resultado *= base;
      }
    } else {
      for (int i = 1; i <= -exponente; i++) {
        resultado *= base;
      }
      resultado = 1 / resultado;
    }
    System.out.println(base + "^" + exponente + " = " + resultado);

    }
}
