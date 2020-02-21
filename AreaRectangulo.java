//164 - Área de un rectángulo
import java.util.Scanner;
public class AreaRectangulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horitzontal1, horitzontal2, vertical1, vertical2; 
        int base, altura, area;
       
        while(true){
            horitzontal1 = sc.nextInt();
            vertical1 = sc.nextInt();
            horitzontal2 = sc.nextInt();
            vertical2 = sc.nextInt();
            base = horitzontal2 - horitzontal1;
            altura = vertical2 - vertical1;
            if(base<0||altura<0){break;}
            area = base*altura;
            System.out.println(area);
        }
        
    }
}
