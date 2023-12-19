package EXAMEN;

public class examen03 {
    public static void main(String[] args) {

        System.out.println("1 Programador junior");
        System.out.println("2 Prog. senior");
        System.out.println("3 Jefe de proyecto");
        System.out.print("Seleccione su cargo (1-3): ");
        int trabajo = Integer.parseInt(System.console().readLine());
        
        System.out.print("¿Cuantas visitas se han realizado? ");
        int Visitas = Integer.parseInt(System.console().readLine());
    
        System.out.print("Introduzca su estado civil 1)Soltero 2)Casado: ");
        int estadoCivil = Integer.parseInt(System.console().readLine());
    
        double sueldoBase = 0;
    
        switch(trabajo) {
          case 1: 
            sueldoBase = 950;
            break;
          case 2: 
            sueldoBase = 1200;
            break;
          case 3: 
            sueldoBase = 1600;
            break;
          default:
            System.out.println("Elija una opcion valida.");
        }
    
        double sueldoDietas = Visitas * 30;
    
        double sueldoBruto = sueldoBase + sueldoDietas;
    
        double irpf = 0;
    
        if (estadoCivil == 1) { 
          irpf = 25;
        } else if (estadoCivil == 2) { 
          irpf = 20;
        } else {
          System.out.println("Elija una opcion correcta.");
        }
        
        double totalIrpf = (sueldoBruto * irpf) / 100;
    
        System.out.println("-----------------------------------");
        System.out.printf(" Sueldo base             %5.2f       \n", sueldoBase);
        System.out.printf("  Dietas (%2d viajes)     %5.2f     \n", Visitas, sueldoDietas);
        System.out.println("-----------------------------------");
        System.out.printf("  Sueldo bruto           %5.2f      \n", sueldoBruto);
        System.out.printf("  Retención IRPF (%.0f%%)   %5.2f    \n", irpf, totalIrpf);
        System.out.println("-----------------------------------");
        System.out.printf("  Sueldo neto            %5.2f      \n", sueldoBruto - totalIrpf);
        System.out.println("-----------------------------------");
      }
    
}
