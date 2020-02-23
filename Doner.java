//512 - Döner Sospechoso
import java.util.Scanner;
public class Doner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, i, conejo, caballo, total;

        nCasos = sc.nextInt();

        for(i=0;i<nCasos;i++){
            conejo = sc.nextInt();
            caballo = sc.nextInt();
            total = (conejo*100) / (conejo+caballo);
            System.out.println(total);
        }
    }
}