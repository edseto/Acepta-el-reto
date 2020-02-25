//407 - Rebotando en el Parchís
import java.util.Scanner;
public class Parchis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fin, posicio, move, result;

        do {
            fin = sc.nextInt();
            posicio = sc.nextInt();
            move = sc.nextInt();
            if(fin>0 && posicio>0 && move>0){
                result = posicio + move;
                if(result>fin){
                    result -= fin;
                    result = fin - result;
                }
                System.out.println(result);
            }
        } while (fin>0 && posicio>0 && move>0);
    }
}