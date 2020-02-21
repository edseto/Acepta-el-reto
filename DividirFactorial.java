//190 - Dividir Factoriales
import java.util.Scanner;
public class DividirFactorial{
    public static long Dividir(long num1, long num2){

        if(num1==num2){
            return 1;
        }else{
            return num1 * Dividir(num1-1, num2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1, num2, result;

        do {
            num1 = sc.nextLong();
            num2 = sc.nextLong();
            if(num1>num2){
                result = Dividir(num1, num2);
                System.out.println(result);
            }else if(num1==num2){
                System.out.println(1);
            }
        } while (num1>=num2);
    }
}