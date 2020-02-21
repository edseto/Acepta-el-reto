import java.util.Scanner;
public class Ascensor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int planta, plantaInicial, total, anterior, totalTemp;

        do {
            total=0;totalTemp=0;anterior=-1;
            plantaInicial = sc.nextInt();
            planta = plantaInicial;
            if(plantaInicial>=0){
                do {
                    if(planta>=0){
                        if(anterior!=-1){
                            totalTemp = planta-anterior;
                            if(totalTemp<0) totalTemp= Math.abs(totalTemp);
                            total +=totalTemp;
                        }
                        anterior = planta;
                    }
                    planta = sc.nextInt();
                } while (planta>=0);
                System.out.println(total);
            }
        } while (plantaInicial>=0);
    }
}