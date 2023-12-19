
public class ejer10 {
    public static void main(String[] args) {
        double numeroIntroducido = 0;
        int cantidadPositivos = 0;
        double media = 0;
        double suma = 0;
        System.out.println("Este programa calcula la media de numeros positivos.");
        System.out.println("El programa para cuando haya un numero negativo. ");
        

        while (numeroIntroducido >= 0) {
            numeroIntroducido = Double.parseDouble(System.console().readLine());
            if (numeroIntroducido > 0) {
                suma += numeroIntroducido;
                cantidadPositivos++;
            }
        }
        media = suma / cantidadPositivos;
    }
}
