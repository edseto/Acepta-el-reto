import java.util.Scanner;
public class FinMes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ncasos, i, inicial, fin, resultat;

        ncasos = sc.nextInt();
        for(i=0;i<ncasos;i++){
            inicial = sc.nextInt();
            fin = sc.nextInt();
            resultat = fin + inicial;
            if(resultat>=0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}