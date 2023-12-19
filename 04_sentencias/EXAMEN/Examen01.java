package EXAMEN;

import java.util.Scanner;

public class Examen01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.println("COMPETICION DE PIEDRA, PAPEL y TIJERA");
        System.out.println("Nombre jugador 1: ");
        String jugador1 = sc.nextLine();

        System.out.println("Nombre jugador 2: ");
        String jugador2 = sc.nextLine();
        
        System.out.println("¿" + jugador1 + " que querrias utilizar? (piedra, papel o tijera)");
        String eleccion1 = (sc.nextLine());

        System.out.println("¿" + jugador2 + " que querrias utilizar (piedra, papel o tijera)?");
        String eleccion2 = (sc.nextLine());
        switch (eleccion1) {
            case "papel":
                if (eleccion2.equals("papel")) {
                    System.out.println("EMPATE");
                }else if (eleccion2.equals("tijera")) {
                    System.out.println("GANA "+ jugador2);
                }else{
                    System.out.println("GANA " + jugador1);
                }break;
            case "piedra":
                if (eleccion2.equals("piedra") ) {
                    System.out.println("EMPATE ");
                
                }else if (eleccion2.equals("tijera")) {
                    System.out.println("GANA "+ jugador1);
                }else{
                    System.out.println("GANA " + jugador2);}
                break;

                case "tijera":
                if (eleccion2.equals("tijera") ) {
                    System.out.println("EMPATE");
                
                }else if (eleccion2.equals("piedra")) {
                    System.out.println("GANA "+ jugador2);
                }else{
                    System.out.println("GANA " + jugador1);}
                break;
            default:
            System.out.println("ERROR.Debe de introducir un valor que concuerde con el juego");
                break;
        }

    }
}
