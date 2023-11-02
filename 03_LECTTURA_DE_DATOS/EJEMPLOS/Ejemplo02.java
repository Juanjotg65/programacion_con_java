/**
 * SalidaFormateada01 utilizando enteros, decimales y decimales con precision
 * 
 * @author
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        String linea;
        System.out.println("Introduce un numero entero: ");
        linea = System.console().readLine();

        int num1;
        num1 = Integer.parseInt(linea);

         System.out.println("Introduce un numero entero: ");
        linea = System.console().readLine();

        int num2;
        num2 = Integer.parseInt(linea);

        System.out.printf("El primer numero es: %d\n", num1);
        System.out.printf("El segundo numero es: %d", num2);

        System.out.print("Introduce un numero real");
        linea = System.console().readLine();
        float numReal = Float.parseFloat(linea);
        System.out.printf("El numero real introducido es: %.2f", numReal);
    }
}
