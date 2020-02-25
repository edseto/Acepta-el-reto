//362 - El Día de Navidad
import java.util.Scanner;
public class DiaNavidad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, dia, mes, i;

        nCasos = sc.nextInt();

        for(i=0;i<nCasos;i++){
            dia = sc.nextInt();
            mes = sc.nextInt();

            if(dia==25 && mes==12){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}