package ejercicios;
import java.util.Scanner;

public class Ejer_01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca un día de la semana y te diré qué módulo toca a primera hora: ");
    String dia = sc.nextLine();

    switch (dia) {
      case "lunes":
        System.out.println("FOL");
        break;
      case "martes", "viernes":
        System.out.println("Programación");
        break;
      case "miércoles", "miercoles":
        System.out.println("Entornos de Desarrollo");
        break;
      case "jueves":
        System.out.println("Bases de Datos");
        break;
      case "sábado", "sabado", "domingo":
        System.out.println("Los fines de semana no hay clase");
        break;
      default:
        System.out.println("El día introducido no es correcto.");
        break;
    }
    sc.close();
  }
}
