//474 - Tu amigable vecino
import java.util.Scanner;
public class Spiderman{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos, i, Spiderman, distancia, bombaA, bombaB;

        numCasos = sc.nextInt();
        for(i=0;i<numCasos;i++){
            distancia=0;
            Spiderman = sc.nextInt();
            bombaA = sc.nextInt();
            bombaB = sc.nextInt();
            distancia = Math.min(Math.abs(Spiderman-bombaA), Math.abs(Spiderman-bombaB))+Math.abs(bombaB-bombaA);
            System.out.println(distancia);
        }
    }
}
