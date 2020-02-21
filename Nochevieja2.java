import java.util.Scanner;
public class Nochevieja2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ncasos, i, j, dia, mes, diesRestants;
        int[] mesos = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        ncasos = sc.nextInt();
        for(i=0;i<ncasos;i++){
            dia = sc.nextInt();
            mes = sc.nextInt();
            diesRestants = mesos[mes-1]-dia; //Dies que queden del mes
            for(j=mes;j<mesos.length;j++){
                diesRestants+=mesos[j]; //Dies que queden per cap d'any
            }
            System.out.println(diesRestants);
        }
    }
}