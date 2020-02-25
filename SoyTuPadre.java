//427 - Yo soy tu...
import java.util.Scanner;
public class SoyTuPadre{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, i;
        String pj, parentesco;

        nCasos = sc.nextInt();
        for(i=0;i<nCasos;i++){
            pj = sc.next();
            parentesco = sc.next();
            if(pj.equals("Luke")&&parentesco.equals("padre")){
                System.out.println("TOP SECRET");
            }else{
                System.out.println(pj+", yo soy tu "+parentesco);
            }
        }
    }
}