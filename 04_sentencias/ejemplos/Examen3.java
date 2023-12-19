package examen;

import java.util.Scanner;

public class Examen3 {
    public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);

 int tipoProducto = 0;
 int tipoAlimento = 0;
 int iva = 0;
 String nombreProducto = "";
 int cantidadProductos = 0;
 double precioProductos = 0;
 double total = 0;
 double precioIva = 0;
 double totalConIva = 0;
 String codPromo = "";


  System.out.println("Introduzca el tipo de producto: ");
  System.out.println("1. Alimentación");
  System.out.println("2. Farmacia");
  System.out.println("3. Electrónica");
  System.out.println("4. Moda");
  System.out.print("Opcion: ");
  tipoProducto = sc.nextInt();

  switch (tipoProducto) {
    case 1:
    System.out.println("Introduzca el tipo de alimento: ");
    System.out.println("1. Huevos");
    System.out.println("2. Pan");
    System.out.println("3. Leche");
    System.out.println("4. Fruta");
    System.out.println("5. Carne");
    System.out.println("6. Agua");
    System.out.println("7. Verdura");
    System.out.println("8. Otros");
    System.out.print("Opcion: ");
    tipoAlimento = sc.nextInt(); 

    if ((tipoAlimento == 5) || (tipoAlimento == 6) || (tipoAlimento == 8) ) {
    iva = 10;
    } else if ((tipoAlimento != 5) && (tipoAlimento != 6) && (tipoAlimento != 8)){
    iva = 4;  
    }
      break;

    case 2:
    iva = 4;
      break;

    case 3, 4:
    iva = 21;
      break;
  
    default:System.out.println("ERROR* Tipo de producto introducido incorrecto");
      break;
  }
  
  if ((tipoProducto <= 4) && (tipoProducto >= 1)){

    System.out.print("Introduzca el nombre del producto: ");
    nombreProducto = System.console().readLine();
    System.out.print("Introduzca la cantidad de productos: ");
    cantidadProductos = sc.nextInt();
    System.out.print("Introduzca el precio por unidad del producto: ");
    precioProductos = sc.nextDouble();
    System.out.print("Introduzca el codigo promocional: ");
    codPromo = System.console().readLine();

    switch (codPromo) {
      case "SINIVA":
        if (tipoProducto == 1){
        iva = 0;
        total = precioProductos * cantidadProductos;
        precioIva = (precioProductos * iva) / 100;
        totalConIva = total + precioIva;
        System.out.println("FACTURA");
        System.out.println("---------------------------------------------------");
        System.out.println("Articulo:                         " + nombreProducto);
        System.out.printf("Precio:              %.2f $/unidad \n",precioProductos);
        System.out.println("Cantidad:                         " + cantidadProductos);
        System.out.printf("Total:                      %.2f $",total);
        System.out.printf("IVA al %f%%:                     %.2f $",iva, precioIva);
        System.out.println("---------------------------------------------------");
        System.out.printf("Total con IVA:                   %.2f $",totalConIva);

        break;
        } else {
        total = precioProductos * cantidadProductos;
        precioIva = (total * iva) / 100;
        totalConIva = total + precioIva;
        System.out.println("FACTURA");
        System.out.println("---------------------------------------------------");
        System.out.println("Articulo:                         " + nombreProducto);
        System.out.printf("Precio:              %.2f $/unidad \n",precioProductos);
        System.out.println("Cantidad:                         " + cantidadProductos);
        System.out.printf("Total:                      %.2f $ \n",total);
        System.out.printf("IVA al %f:                     %.2f $\n",iva, precioIva);
        System.out.println("---------------------------------------------------");
        System.out.printf("Total con IVA:                   %.2f $",totalConIva);  
        }

        break;
      case "PROMO50":
        if (tipoProducto == 3){
        total = (precioProductos / 2) * cantidadProductos;
        precioIva = (total * iva) / 100;
        totalConIva = total + precioIva;
        System.out.println("FACTURA");
        System.out.println("---------------------------------------------------");
        System.out.println("Articulo:                         " + nombreProducto);
        System.out.printf("Precio:              %.2f $/unidad \n",precioProductos);
        System.out.println("Cantidad:                         " + cantidadProductos);
        System.out.printf("Total:                      %.2f $",total);
        System.out.printf("Descuento (50%%):                      -%.2f $",(total/2));
        System.out.printf("Total con Descuento:                    %.2f $",(total/2));
        System.out.printf("IVA al %f%%:                     %.2f $",iva, precioIva);
        System.out.println("---------------------------------------------------");
        System.out.printf("Total con IVA:                   %.2f $",totalConIva);
        } else {
        total = precioProductos * cantidadProductos;
        precioIva = (total * iva) / 100;
        totalConIva = total + precioIva;
        System.out.println("FACTURA");
        System.out.println("---------------------------------------------------");
        System.out.println("Articulo:                         " + nombreProducto);
        System.out.printf("Precio:              %.2f $/unidad \n",precioProductos);
        System.out.println("Cantidad:                         " + cantidadProductos);
        System.out.printf("Total:                      %.2f $",total);
        System.out.printf("IVA al %f:                     %.2f $",iva, precioIva);
        System.out.println("---------------------------------------------------");
        System.out.printf("Total con IVA:                   %.2f $",totalConIva);
        }
         break;
      case "PROMO3X2":
      if (tipoProducto == 4){
        total = precioProductos * cantidadProductos;
        precioIva = (total * iva) / 100;
        totalConIva = total + precioIva;
        System.out.println("FACTURA");
        System.out.println("---------------------------------------------------");
        System.out.println("Articulo:                         " + nombreProducto);
        System.out.printf("Precio:              %.2f $/unidad ",precioProductos);
        System.out.printf("Cantidad:                        %f " , cantidadProductos);
        System.out.printf("Total:                      %.2f $",total);
        System.out.printf("IVA al %f:                     %.2f $",iva, precioIva);
        System.out.println("---------------------------------------------------");
        System.out.printf("Total con IVA:                   %.2f $",totalConIva);
      }else {
        total = precioProductos * cantidadProductos;
        precioIva = (total * iva) / 100;
        totalConIva = total + precioIva;
        System.out.println("FACTURA");
        System.out.println("---------------------------------------------------");
        System.out.println("Articulo:                         " + nombreProducto);
        System.out.printf("Precio:              %.2f $/unidad \n",precioProductos);
        System.out.println("Cantidad:                         " + cantidadProductos);
        System.out.printf("Total:                      %.2f $",total);
        System.out.printf("IVA al %f%%:                     %.2f $",iva, precioIva);
        System.out.println("---------------------------------------------------");
        System.out.printf("Total con IVA:                   %.2f $",totalConIva);
      }
       break;
      case "NO":
        total = precioProductos * cantidadProductos;
        precioIva = (total * iva) / 100;
        totalConIva = total + precioIva;
        System.out.println("FACTURA");
        System.out.println("---------------------------------------------------");
        System.out.println("Articulo:                         " + nombreProducto);
        System.out.printf("Precio:              %.2f $/unidad \n",precioProductos);
        System.out.println("Cantidad:                         " + cantidadProductos);
        System.out.printf("Total:                      %.2f $",total);
        System.out.printf("IVA al %f%%:                     %.2f $",iva, precioIva);
        System.out.println("---------------------------------------------------");
        System.out.printf("Total con IVA:                   %.2f $",totalConIva);
     
        default:
        total = precioProductos * cantidadProductos;
        precioIva = (total * iva) / 100;
        totalConIva = total + precioIva;
        System.out.println("FACTURA");
        System.out.println("---------------------------------------------------");
        System.out.println("Articulo:                         " + nombreProducto);
        System.out.printf("Precio:              %.2f $/unidad \n",precioProductos);
        System.out.println("Cantidad:                         " + cantidadProductos);
        System.out.printf("Total:                      %.2f $",total);
        System.out.printf("IVA al %f%%:                     %.2f $",iva, precioIva);
        System.out.println("---------------------------------------------------");
        System.out.printf("Total con IVA:                   %.2f $",totalConIva);
          break;
      
     
    }

  }


  sc.close();
  }
}
