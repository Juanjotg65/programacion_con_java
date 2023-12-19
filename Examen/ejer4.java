import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VOLUMEN DEL TRONCO DE CONO");
        System.out.println("============================");
       
        System.out.print("Introduce el radio mayor (cm): ");
        double radioMayor = sc.nextDouble();

        System.out.print("Introduce el radio menor (cm): ");
        Float radioMenor = sc.nextFloat();

        System.out.print("Introduce la altura (cm): ");
        double Altura = sc.nextDouble();

    double volumen = (Math.PI * Altura * ((radioMayor*radioMayor)*(radioMenor*radioMenor)+(radioMayor*radioMenor))/3);
    System.out.printf("El volumen del toroide es de \u001B[31m%.4f cm\u00B3\u001B[0m.\n", volumen);

    }
}
