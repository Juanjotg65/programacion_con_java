public class NumeroPrimoConFuncion {
    public static boolean esPrimo(int x){
        for (int i = 2; i < x; i++) {
            if ((x % i == 0)) {
              return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Introduce un número entero postivo: ");
    int n = Integer.parseInt(System.console().readLine());
    
    if (esPrimo(n)) {
        System.out.println("El numero " + n + " es primo");
    }else{
        System.out.println("El numero " + n + " no es primo");
    }
    }
}