import java.util.Scanner;
public class Romans{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int romans=1, escutsL=2, escuts, costatQuadrat;
        int numCostats=4, escutsSolitari = 5;
        while(true){
            romans = sc.nextInt();
            if(romans==0){break;}
            escuts=0;
            while(true){
                if(romans==0){break;}
                if (romans<4){
                    escuts += romans*escutsSolitari;break;
                }else{
                    costatQuadrat = (int)Math.sqrt(romans);
                    romans -= (costatQuadrat * costatQuadrat);
                    escuts+= (costatQuadrat-2)*(costatQuadrat-2);
                    escuts += (((costatQuadrat-2)*numCostats)*escutsL)+12;
                }
            }
            System.out.println(escuts);
        }
        sc.close();
    }
}