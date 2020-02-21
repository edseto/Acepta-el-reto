import java.util.Scanner;
public class Moda{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nvalors, i, j, introduits, repeticions;
        long nombre;
        boolean trobat;
        long[][] processatTotal;
        
        nvalors = sc.nextInt();
        processatTotal = new long[2][25001];

        while (nvalors!=0) {
            for(i=0;i<25001;i++) {processatTotal[1][i]=0;}
            
            repeticions=0;introduits=1;

            nombre = sc.nextLong();
            processatTotal[0][0]=nombre;
            processatTotal[1][0]=1;
                        
            for(i=1;i<nvalors;i++){
                nombre = sc.nextLong();
                trobat=false;
                j=0;
                while(j<introduits&&trobat==false){
                    if(nombre==processatTotal[0][j]){
                        trobat=true;
                    }else {j++;}
                }

                if(!trobat){
                    processatTotal[0][j]=nombre;
                    introduits++;
                }
                processatTotal[1][j]++;
                    
            }
            for(i=0;i<processatTotal[1].length;i++){
                if(processatTotal[1][repeticions]<processatTotal[1][i]){
                    repeticions=i;
                }
            }
            // for(i=0;i<17;i++) {System.out.print(processatTotal[1][i]+" ");}
            System.out.println(processatTotal[0][repeticions]);
            nvalors = sc.nextInt();
        } 
        sc.close();
    }
}