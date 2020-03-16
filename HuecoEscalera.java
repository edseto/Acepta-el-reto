//540 - Por el hueco de la escalera
import java.util.Scanner;
public class HuecoEscalera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, piso, escalonesPiso, pisoSubido, escalonesExtra, bajado, subido;

        nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            piso = sc.nextInt();
            escalonesPiso = sc.nextInt();
            pisoSubido = sc.nextInt();
            escalonesExtra = sc.nextInt();
            bajado = (escalonesPiso * pisoSubido) + escalonesExtra;
            subido = (piso * escalonesPiso) + bajado;
            System.out.println(bajado+" "+subido);
        }
    }
}