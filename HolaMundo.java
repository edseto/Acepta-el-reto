import java.util.Scanner;
public class HolaMundo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, casos;
        
        casos = sc.nextInt();
        for(i=0;i<casos;i++){
            System.out.println("Hola mundo.");
        }
    }
}