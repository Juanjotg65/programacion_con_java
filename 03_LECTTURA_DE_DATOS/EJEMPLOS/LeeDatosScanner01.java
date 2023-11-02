import java.util.Scanner;

public class LeeDatosScanner01 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in, "windows-1252");

System.out.print("Introduce tu nombre: ");
String nombre = sc.nextLine();

System.out.print("Introduce tu edad: ");
int edad = sc.nextInt();

System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
}
}
