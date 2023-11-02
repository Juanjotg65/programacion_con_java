/**
 * SalidaFormateada01 utilizando enteros, decimales y decimales con precision
 * 
 * @author
 */
public class SalidaFormateada01 {
    public static void main(String[] args) {
        System.out.printf("El numero %d no tiene decimales.\n", 21);
        System.out.printf("El numero %f tiene decimales.\n", 21.0);
        System.out.printf("El %.3f sale exaactamente coo %d decimales.\n", 50.0, 3);
        System.out.printf("La letra: %c.\n",83);

        //Para ver el orden
        System.out.printf("Mostramos el segundo argumeto: %2$ \nY despues el primero: %1$", 23.0, 56);

    }
    
}