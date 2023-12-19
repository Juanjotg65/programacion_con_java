package EXAMEN;

import java.util.Scanner;

public class examen02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.println("introduzca la base imponible");
        double baseImponible = Double.parseDouble(sc.nextLine());

        System.out.println("Introduce el tipo de IVA (general, reducido o familiaNumerosa)");
        String IVA = (sc.nextLine());d

        double importeIVA = 0;

        if (IVA  .equals("general")) {
            importeIVA = 0.21;
            
        }else if (IVA.equals("reducido")) {
            importeIVA = 0.1;
        }else{
            importeIVA = 0.02;
        }

        System.out.println("¿Quiere que realicemos el envio? (S o N)");
        String envio = (sc.nextLine());

        double precioEnvio = 0;

        if (envio.equals("S")) {
            precioEnvio = 3;
        }else{
            precioEnvio = 0;
        }
        
        System.out.println("¿Querra utilizar algun cupon de descuento?");
        String codigo = (sc.nextLine());

        double descuentoPromo = 0;
        double precioTotal = 0;

        switch (codigo) {
            case "NoPromo":
                descuentoPromo = 0;
                System.out.printf("  Base Imponible             %5.2f $  \n", baseImponible );
                System.out.printf("  IVA (%.2f%%)    %5.2f     \n", importeIVA, importeIVA*baseImponible);
                System.out.printf("  Precio con IVA           %5.2f $    \n",importeIVA*baseImponible+baseImponible );
                System.out.printf("  Precio envio    %5.2f $   \n", precioEnvio );
                System.out.printf("  Promocion (%s)    %5.2f $   \n", codigo, descuentoPromo );
                System.out.printf("  Total            %5.2f $     \n", importeIVA*baseImponible+baseImponible+precioEnvio-descuentoPromo+precioEnvio);
                break;
            case "50off":
            descuentoPromo =0.5;
            precioTotal = baseImponible+baseImponible*importeIVA+precioEnvio;
            System.out.printf("  Base Imponible             %5.2f $  \n", baseImponible );
                System.out.printf("  IVA (%.2f%%)    %5.2f     \n", importeIVA, importeIVA*baseImponible);
                System.out.printf("  Precio con IVA           %5.2f $    \n",importeIVA*baseImponible+baseImponible );
                System.out.printf("  Precio envio    %5.2f $   \n", precioEnvio );
                System.out.printf("  Promocion (%s)    %5.2f $   \n", codigo, precioTotal*descuentoPromo );
                System.out.printf("  Total            %5.2f $     \n", precioTotal*descuentoPromo);  
                break;  
            case "enviogratis":
            descuentoPromo = -3;
            precioTotal = baseImponible+baseImponible*importeIVA;
            System.out.printf("  Base Imponible             %5.2f $  \n", baseImponible );
                System.out.printf("  IVA (%.2f%%)    %5.2f     \n", importeIVA, importeIVA*baseImponible);
                System.out.printf("  Precio con IVA           %5.2f $    \n",importeIVA*baseImponible+baseImponible );
                System.out.printf("  Precio envio    %5.2f $   \n", precioEnvio );
                System.out.printf("  Promocion (%s)    %5.2f $   \n", codigo, descuentoPromo );
                System.out.printf("  Total            %5.2f $     \n", precioTotal-descuentoPromo);    
            case "menos10":
                descuentoPromo = 0.1;
                precioTotal = baseImponible+baseImponible*importeIVA+precioEnvio;
                System.out.printf("  Base Imponible             %5.2f $  \n", baseImponible );
                System.out.printf("  IVA (%.2f%%)    %5.2f     \n", importeIVA, importeIVA*baseImponible);
                System.out.printf("  Precio con IVA           %5.2f $    \n",importeIVA*baseImponible+baseImponible );
                System.out.printf("  Precio envio             %5.2f $   \n", precioEnvio );
                System.out.printf("  Promocion (%s)    %5.2f $   \n", codigo, precioTotal*descuentoPromo );
                System.out.printf("  Total            %5.2f $     \n", precioTotal-precioTotal*descuentoPromo);    
        }


        
    }
}
