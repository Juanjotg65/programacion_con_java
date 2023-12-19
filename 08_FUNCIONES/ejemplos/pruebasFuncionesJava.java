import Matematicas.Volumen;
import Matematicas.varias;
import Matematicas.varias.Varias;


public class pruebasFuncionesJava {
    public static void main(String[] args) {
     int n;
     
   //   System.out.println("Introduce un numero entero positivo");
   //   n = Integer.parseInt(System.console().readLine());

   //   if((Varias.esPrimo(n))){
   //      System.out.println("El numero "+ n + " es primo");;
   //   }else{
   //      System.out.println("El numero "+ n + " no es primo");
   //   }

   //   System.out.println("introduce un numero positivo: ");
   //   n = Integer.parseInt(System.console().readLine());

   //   int numDigitos = Varias.digitos(n);
   //   System.out.println(n + " tiene"+ numDigitos +" digitos");

   //   double r;
   //   double h;
   //   System.out.println("Introduce el radio del cilindro: ");
   //   r = Double.parseDouble(System.console().readLine());

   //   System.out.println("Introduce el radio del cilindro: ");
   //   h = Double.parseDouble(System.console().readLine());

   //   System.out.println("El volumen del cilindro es "+ Volumen.volumenCilindro(r, h)+ "cm^3");

     System.out.println("Introduce un numero ");
     long x = Long.parseLong(System.console().readLine());
     System.out.println("El número introducido "+ x + " volteado es: " + Varias.voltear(x));
    

     System.out.println("Numero entero: ");
     int z =Integer.parseInt(System.console().readLine());
     System.out.println("El siguiente primo de "+ x + "es " + varias.siguientePrimo(z));
   }

}
