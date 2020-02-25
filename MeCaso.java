//380 - ¡Me Caso!
import java.util.Scanner;
public class MeCaso{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, total, gasto, i;

        do {
            total = 0;gasto=0;
            nCasos = sc.nextInt();
            for(i=0;i<nCasos;i++){
                gasto = sc.nextInt();
                total+=gasto;
            }
            if(nCasos>0){System.out.println(total);}
        } while (nCasos>0);
    }
}