//506 - Tensión Descompensada
import java.util.Scanner;
public class Tension{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, num1, num2, i;
        String separador;

        nCasos = sc.nextInt();

        for(i=0;i<nCasos;i++){
            num1 = sc.nextInt();
            separador = sc.next();
            num2 = sc.nextInt();

            if(num1>=num2){
                System.out.println("BIEN");
            }else{
                System.out.println("MAL");
            }
        }
    }
}
