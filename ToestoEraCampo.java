//538 - Toesto era Campo
import java.util.Scanner;
public class ToestoEraCampo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int añosAbuelo, añosIglesia;

        añosAbuelo = sc.nextInt();
        añosIglesia = sc.nextInt();
        while (añosAbuelo!=0||añosIglesia!=0) {
            if(añosIglesia>añosAbuelo) System.out.println("SENIL");
                else System.out.println("CUERDO");
            añosAbuelo = sc.nextInt();
            añosIglesia = sc.nextInt();
        }
    }
}