//155 - Perímetro de un rectángulo
import java.util.Scanner;
public class PerimetroRectangulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amplada, altura, result;
        
        do {
            amplada = sc.nextInt();
            altura = sc.nextInt();

            if(amplada>=0 && altura>=0){
                result = (amplada*2) + (altura*2);
                System.out.println(result);
            }
        } while (amplada>=0 && altura>=0);
    }
}