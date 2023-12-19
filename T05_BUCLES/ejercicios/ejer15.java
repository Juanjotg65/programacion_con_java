import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();
    
        System.out.print("Introduzca el exponente: ");
        int exponente = sc.nextInt();

        double potencia;
        int exponenteInicial;
        for (int i = 1; i <= exponente; i++) {
        potencia = 1;
        exponenteInicial = i;
        for (int j = 0; j < exponenteInicial; j++) {
        potencia *= base;
}
        System.out.println(base + "^" + i + " = " + potencia);
        }
        }   
}
