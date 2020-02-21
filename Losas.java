//Claras y oscuras
import java.util.Scanner;
public class Losas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ncasos, amplada, altura, total, fosc, clar;

        ncasos = sc.nextInt();
        while(ncasos!=0){
            amplada = sc.nextInt();
            altura = sc.nextInt();
            if((amplada>0&&amplada<1000)&&(altura>0&&amplada<1000)){
                total = amplada*altura;
                fosc = total/2;
                if(total%2==0){
                    clar = total/2;
                }else{
                    clar = (total/2)+1;
                }
                System.out.print(clar+" ");
                System.out.println(fosc);
                ncasos--;
            }
        }
        sc.close();
    }
}
