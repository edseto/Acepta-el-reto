//424 - Ahorro Infantil
import java.util.Scanner;
public class Ahorro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, dinero, total, i, max;

        do {
            nCasos = sc.nextInt();
            total=0;max=0;
            if(nCasos>0){
                for(i=0;i<nCasos;i++){
                    dinero = sc.nextInt();
                    total+=dinero;
                    if(total>max){
                        max = total;
                    }
                }
                System.out.println(total+" "+max);
            }
        } while (nCasos>0);
    }
}