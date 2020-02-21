import java.util.Scanner;
public class UltimoFactorial{
    public static int Factorial(int numero){

        if(numero==0){
            return 1;
        }else{
            return numero*Factorial(numero-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, numero, result, i, j;

        //Si el número és més gran de 5 l'últim dígit del seu factorial sempre és 0

        nCasos = sc.nextInt();
        for(i=0;i<nCasos;i++){
            result = 1;
            numero = sc.nextInt();
            if(numero>4){
                result = 0;
            }else{
                result = Factorial(numero)%10;
            }
            System.out.println(result);
        }
    }
}