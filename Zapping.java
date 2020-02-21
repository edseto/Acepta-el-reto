import java.util.Scanner;
public class Zapping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inici, fi, clicsOptims, clics;

        while(true){
            clics=99;
            inici = sc.nextInt();
            fi = sc.nextInt();
            if(inici==0||fi==0){break;}
            clicsOptims = fi-inici;
            if(inici<fi){
                clics+=inici;
                clics-=fi;
            }else{
                clics+=fi;
                clics-=inici;
            }
            clicsOptims = Math.abs(clicsOptims);
            if(clicsOptims>clics){
                clicsOptims = clics;
            }
            System.out.println(clicsOptims);
        }
    }
}