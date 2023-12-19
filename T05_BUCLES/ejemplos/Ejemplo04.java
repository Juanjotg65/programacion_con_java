public class Ejemplo04 {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        while (i < 7) {
            while (j < 11) {
                System.out.println(i + "*" + j + "=" + i*j );
                j++;
            }
            i = i +2;
        }
    }
}
