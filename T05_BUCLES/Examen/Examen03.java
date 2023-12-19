import java.util.Scanner;

public class Examen03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        
        int totalDiv = 1 ;

        System.out.println("Introduzca un numero entero positivo: ");
        int numero = Integer.parseInt(sc.nextLine());
        
        System.out.printf("Los numeros propios de " + numero +" son: ");
        for( int i = 2; i<numero; i++){
            if (numero % i == 0) {
                System.out.printf(i + " ");
                totalDiv += i;
            }else{
                System.out.printf("");
            }
            
            
        }
        System.out.printf("\n");
        System.out.println("La suma de los divisores propios y el 1 es: " +  totalDiv);

        if (numero == totalDiv) {
            System.out.println("El numero es perfecto");
        }else{
            System.out.println("El numero no es perfecto");
        }
    }    
}
