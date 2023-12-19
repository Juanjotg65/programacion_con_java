import java.util.Scanner;

public class ejer11 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int numero;
    
    System.out.print("Introduce el numero base: ");
    numero = sc.nextInt();
    

    for (int i = numero; i < numero + 5; i++) {
      System.out.printf("%5d %10d %15d \n", i, i * i, i * i * i);
   } 
}
}
//
