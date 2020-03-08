//217 - ¿Qué lado de la calle?
import java.util.Scanner;
public class LadoCalle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCasa;

        numeroCasa = sc.nextInt();
        while(numeroCasa>0){
            if(numeroCasa%2==0){
                System.out.println("DERECHA");
            }else{
                System.out.println("IZQUIERDA");
            }
            numeroCasa = sc.nextInt();
        }
    }    
}