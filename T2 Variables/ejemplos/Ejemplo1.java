/**
* Variables
*
* Muestra varias palabras en el color que corresponde.
*
* @author Juan Jose Tejada
*/
public class Ejemplo1 {
    public static void main(String[] args) {
        
        //Tipo byte
        byte miNumByte = 100;
        System.out.println(miNumByte);

        //Tipo short
        short miNumShort = 5000;
        System.out.println(miNumShort);

        //Tipo Long
        long miNumLong = 15000000;
        System.out.println(miNumLong);

        //Tipo float
        float miNumFloat = 5.75f;
        System.out.println(miNumFloat);

        //Tipo boolean
        boolean esJavaDivertido = true;
        System.out.println(esJavaDivertido);

        int numero = 5;

        System.out.println("El valor de la variable es "+ numero);

        double x;
        double y;

        x = 5;
        y= 12.25;

        System.out.println("x vale " + x);
        System.out.println("y vale " + y);

        char letra1 =99;
        char letra2 = 97;
        System.out.println(letra1);
        System.out.println(""+letra1);

        //Tipo string
        String miString = "a";
        char letra3 = 'a';
        System.out.println(miString);
        System.out.println(letra3);

        //Concatenacion
        int num1 = 9;
        int num2 = 2;
        System.out.println("El resto de dividir"+ num1+"entre"+ num2 +"es =" + num1%num2);
        
        int a = 2;
        int b = 9;

        double division;

        System.out.println("El cating de la variable b es "+ (double) b);
    }
}
