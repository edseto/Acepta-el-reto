import java.util.Scanner;
public class Mario{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long casos, nSalts, salt, amunt, baix, temp;
        int i, j;

        casos = sc.nextInt();
        for(i=0;i<casos;i++){
            amunt=0;baix=0;temp=0;
            nSalts = sc.nextInt();
            for(j=0;j<nSalts;j++){
                salt = sc.nextInt();
                if(j>0&&temp<salt){
                    amunt++;
                }else if(temp>salt){
                    baix++;
                }
                temp = salt;
            }
            System.out.println(amunt+" "+baix);
        }
    }
}