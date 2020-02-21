import java.util.Scanner;
public class Nochevieja{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minuts, minutsTotal, mitjanit = 24*60, tempsRestant;
        sc.useDelimiter(":|\\s+"); 
        //Per delimitar a l'hora d'agafar el temps, és a dir agafarà fins els ':'
        do {
            hora = sc.nextInt();
            minuts = sc.nextInt();
            minutsTotal = hora*60+minuts;
            if(minutsTotal==0){
                minutsTotal = mitjanit;
            }else{
                tempsRestant = mitjanit - minutsTotal;
                System.out.println(tempsRestant);
            }
        } while (minutsTotal!=mitjanit);
    }
}