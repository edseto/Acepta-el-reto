//Número HyperPar
import java.util.Scanner;
public class NumHyperPar{
    public static int Comprovar(int numero){
        int parell = 1; //0 par 1 impar
        
        if(numero<10){
            if(numero%2==0){
                parell = 0;
            }else{
                parell = 1;
            }
        }else{
            if(numero%2==0){
                parell = 0;
                return Comprovar(numero/10);
            }else{
                parell = 1;
            }
        }

        return parell;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int parell;

        do {
            numero = sc.nextInt();
            parell = Comprovar(numero);
            if(numero>=0){
                if(parell==0){
                    System.out.println("SI");
                }else if (parell==1){
                    System.out.println("NO");
                }
            }
        } while (numero>=0);
    }
}
