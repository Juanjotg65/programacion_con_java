import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Articulo;
        double Subtotal, descuento, SubtotalDescuento, IVA, ahorro, total, Precio;
        int cantidad;

        System.out.println("Introduce el articulo que desea: ");
        Articulo = sc.next();

        System.out.println("Introduce el precio del articulo: ");
        Precio = sc.nextDouble();

        System.out.println("Introduce la cantidad de articulos: ");
        cantidad = sc.nextInt();

        descuento = 0.15;

        Subtotal = (Precio*cantidad);
        ahorro = Subtotal * (descuento);
        SubtotalDescuento = Subtotal - ahorro;
        IVA = SubtotalDescuento * 0.21;
        total = SubtotalDescuento + IVA;
        
        System.out.println("\u001B[1mFactura\u001B[0m");
        System.out.println("=======================0================");
        System.out.printf("%-30s %10s€\n", "Articulo", Articulo);
        System.out.printf("%-30s %10s€\n", "Precio" , Precio );
        System.out.printf("%-30s %10s€\n", "Cantidad" ,cantidad);
        System.out.printf("%-30s %10s€\n", "Subtotal" ,Subtotal);
        System.out.printf("%-30s %10s€\n", "Descuento(15%)", descuento);
        System.out.printf("%-30s %10s€\n", "Subtotal con descuento", ahorro);
        System.out.printf("%-30s %10s€\n", "IVA",IVA);
        System.out.println("========================================");
        System.out.println("\u001B[1m\u001B[47mTOTAL" + String.format("%30s€\u001B[0m", String.format("%.2f", total)));
    }
}
