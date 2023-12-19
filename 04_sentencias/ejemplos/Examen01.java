package examen;
import java.util.Scanner;

public class Examen01 {
  public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  //Declaraciones globales
  int pisoDestino = 0;
  int pisoActual = 0;
  int numPersonas = 0;
  double peso = 0;
  final int limitePersonas = 4;
  final int pesoMaximo = 300;

  //Bucle para ejecutar el programa hasta que el usuario desee finalizar.
  while (pisoDestino != -1) {
  System.out.print("¿A que piso deséa viajar?: ");
  pisoDestino = sc.nextInt();
  System.out.print("Introduce el número de personas que van en el ascensor: ");
  numPersonas = sc.nextInt();
  System.out.print("Introduce el peso al total al que se sometera el ascensor: ");
  peso = sc.nextDouble();

  if ( (pisoDestino != (pisoActual + 1)) && (pisoDestino != (pisoActual - 1)) && (pisoDestino <= 10) && (pisoDestino >= 0) && ( peso <= pesoMaximo) && (numPersonas <= limitePersonas) ) {

  if (pisoDestino > pisoActual) {
  System.out.println("Subiendo...");
  System.out.println("Ha llegado al piso numero " + pisoDestino);
  pisoActual = pisoDestino;  
  } else if (pisoDestino < pisoActual) {
  System.out.println("Bajando...");
  System.out.println("Ha llegado al piso numero " + pisoDestino);
  pisoActual = pisoDestino;  
  }  

  } else if( (pisoDestino == (pisoActual + 1)) || (pisoDestino == (pisoActual - 1)) || (pisoDestino >= 11) || (pisoDestino < 0)  ){
  System.out.println("Su solicitud ha sido rechazada."); 
  }else if ((peso > pesoMaximo)){
  System.out.println("Su solicitud ha sido rechazada ya que se ha superado el peso maximo.");
  }else if ((numPersonas > limitePersonas)){
  System.out.println("Su solicitud ha sido rechazada ya que se ha superado el limite de personas.");
  }
  
  

  
   }
  sc.close();
 }
}
