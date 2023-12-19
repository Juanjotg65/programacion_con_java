import java.util.Scanner;

public class ejemplo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int numeroint = 0;
        int numeropositivo = 0;
        int suma = 0;


        System.out.println("Introduce numeros enteros positivos");
        // int numero = sc.nextLine();

        while (numeroint >= 0) {
            System.out.println("Numero: ");
            numeroint = sc.nextInt();
            if (numeroint >0) {
                numeropositivo++;
                suma += numeropositivo;
                
            }
        }
        sc.close();
        
    }
}
