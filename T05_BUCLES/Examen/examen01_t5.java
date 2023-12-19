import java.util.Scanner;

public class examen01_t5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
    
        System.out.println("Introduce tu Apellido1");
        String Apellido1 = (sc.nextLine());
        
        System.out.println("Introduce tu Apellido2");
        String Apellido2 = (sc.nextLine());

        System.out.println("Introduce tu nombre");
        String nombre = (sc.nextLine());

        System.out.println("Introduce la nota de tu 1º trimestre");
        int Nota1 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce la nota de tu 2º trimestre");
        int Nota2 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce la nota de tu 3º trimestre");
        int Nota3 = Integer.parseInt(sc.nextLine());
        
        if (Nota1 < 0 && Nota2 < 0 && Nota3 < 0 && Nota1 > 10 && Nota2 > 10 && Nota3 > 10) {
            System.out.println("Debe introducir una nota entre 1 y 10");
            System.out.println("Introduce la nota de tu 1º trimestre");
            Nota1 = Integer.parseInt(sc.nextLine());

            System.out.println("Introduce la nota de tu 2º trimestre");
            Nota2 = Integer.parseInt(sc.nextLine());

            System.out.println("Introduce la nota de tu 3º trimestre");
            Nota3 = Integer.parseInt(sc.nextLine());
        }else{
            

            int longitudNombre;

            int numeroLetras1 = nombre.length();
            int numeroLetras2 = Apellido1.length();
            longitudNombre= numeroLetras1 + numeroLetras2;

            for( int casillaNombre = 0; casillaNombre == longitudNombre; casillaNombre++){
                System.out.println("-");
            }
        }

        double media = (Nota1+Nota2+Nota3)/3;

        System.out.println(Apellido1+" " + nombre+" " + Nota1+" " + Nota2+" " +" " + Nota3+" "+ media  );
    }
}
