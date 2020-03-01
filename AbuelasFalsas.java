//446 - Abuelas Falsas
import java.util.Scanner;
public class AbuelasFalsas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomVeritat, nom;
        int nCasos, intents, i, j, contador;
        boolean veritat;

        nCasos = sc.nextInt();
        for ( i = 0; i < nCasos; i++) {
            veritat = false;contador=0;
            nomVeritat = sc.next();
            intents = sc.nextInt();
            for ( j = 0; j < intents; j++) {
                nom = sc.next();
                if(nom.equals(nomVeritat)){
                    contador++;
                }
                if(j==intents-1 && nom.equals(nomVeritat) && contador==1){
                    veritat = true;
                }
            }
            if(veritat&&intents>1){
                System.out.println("VERDADERA");
            }else{
                System.out.println("FALSA");
            }
        }
    }
}