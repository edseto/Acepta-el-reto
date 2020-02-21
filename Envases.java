//532 - Reduciendo envases
import java.util.Scanner;
public class Envases{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, i, pesoNeto, pesoTotal, peso;

        nCasos = sc.nextInt();
        for(i=0;i<nCasos;i++){
            pesoNeto = sc.nextInt();
            pesoTotal = sc.nextInt();
            peso = Math.abs(pesoTotal-pesoNeto);
            System.out.println(peso);
        }
    }
}
