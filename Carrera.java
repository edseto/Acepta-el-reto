//169 - Carrera Popular
import java.util.Scanner;
public class Carrera{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, i, contador, germans, total;
        String cognom, finish = "====", familia;
        String[] nom;

        nCasos = sc.nextInt();
        cognom = sc.nextLine();

        for(i=0;i<nCasos;i++){
            familia="";
            germans = 0;contador = 0;total = 0;
            do {
                cognom = sc.nextLine().toLowerCase();
                if(!cognom.equals(finish)){
                    nom = cognom.split(",");
                    if(nom[0].equals(familia)){
                        if(germans==0){
                            germans=2;
                        }else{
                            germans++;
                        }
                    }else{
                        familia = nom[0];
                        total +=germans;
                        germans = 0;
                    }
                    contador++;
                }
            } while (!cognom.equals(finish));
            total +=germans;
            System.out.println(contador+" "+total);
        }
    }
}