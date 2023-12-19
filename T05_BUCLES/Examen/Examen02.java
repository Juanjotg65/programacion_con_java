import java.util.Scanner;

public class Examen02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Introduce jugador 1");
        String jug1 = sc.nextLine();

        System.out.println("Introduce jugador 2");
        String jug2 = sc.nextLine();

        int numeroLetras1 = jug1.length();
        int numeroLetras2 = jug2.length();

        if (numeroLetras1 > numeroLetras2) {
            int numeroLetras = numeroLetras1;
        }else{
            int numeroLetras = numeroLetras2;
        }

        int contadorVjug1 = 0;
        int contadorVjug2 = 0;
        

            while (contadorVjug1 < 3 && contadorVjug2<3) {
                System.out.println(jug1 +" que quieres jugar: ");
                String jugada1 = sc.nextLine();
           
                System.out.print("\033[H\033[2J"); 
                System.out.flush();

                System.out.println(jug2 +" que quieres jugar: ");
                String jugada2 = sc.nextLine();
            switch (jugada1) {
                case "tijera":
                    if (jugada2.equals("tijera")) {
                        System.out.println("");
                    }
                        else if (jugada2.equals("papel")) {
                            contadorVjug1++;
                            System.out.println(jug1 + "  " + contadorVjug1 + "  " + contadorVjug2 + "  " +  jug2);
                        }
                        else{
                            contadorVjug2++;
                            System.out.println(jug1 + "  " + contadorVjug1 + "  " + contadorVjug2 + "  " +  jug2);
                        }
                break;
                case "papel":
                     if (jugada2.equals("papel")) {
                        System.out.println("");
                    }
                        else if (jugada2.equals("piedra")) {
                            contadorVjug1++;
                            System.out.println(jug1 + "  " + contadorVjug1 + "  " + contadorVjug2 + "  " +  jug2);
                        }
                        else{
                            contadorVjug2++;
                            System.out.println(jug1 + "  " + contadorVjug1 + "  " + contadorVjug2 + "  " +  jug2);
                        }
                break;
                case "piedra":
                     if (jugada2.equals("piedra")) {
                        System.out.println("");
                    }
                        else if (jugada2.equals("tijera")) {
                            contadorVjug1++;
                            System.out.println(jug1 + "  " + contadorVjug1 + "  " + contadorVjug2 + "  " +  jug2);
                        }
                        else{
                            contadorVjug2++;
                            System.out.println(jug1 + "  " + contadorVjug1 + "  " + contadorVjug2 + "  " +  jug2);
                        }
                break;
            }
            
        }
            
        
        
    }
    

}
