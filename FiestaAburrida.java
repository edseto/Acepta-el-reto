//117 - La fiesta aburrida
import java.util.Scanner;
public class FiestaAburrida{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPersones, i, posicio=0;
        String presentacio, nom;
        String[] noms;
        
        numPersones = sc.nextInt();
        presentacio = sc.nextLine();
        noms = new String[numPersones];
        
        for(i=0;i<numPersones*2;i++){
            if(i<numPersones){
                presentacio = sc.nextLine();
                nom = presentacio.replace("Soy ","");
                noms[i] = nom;
            }
            else{
                System.out.println("Hola, "+noms[posicio]+".");
                posicio++;
            }
        }
        sc.close();
    }
}
