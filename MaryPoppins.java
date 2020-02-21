import java.util.Scanner;
public class MaryPoppins{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, casos, index;
        int[] majus;
        String paraula;
        String[] paraules;
        char[] reves;

        casos = sc.nextInt();
        paraules = new String[casos];
        for(i=0;i<casos;i++){
            paraula = sc.next();
            index = paraula.length()-1;
            reves = new char[paraula.length()];
            majus = new int[paraula.length()];
            for(j=0;j<paraula.length();j++){
                if(Character.isUpperCase(paraula.charAt(j))){
                   majus[j] = 1;
                }
            }
            for(j=0;j<paraula.length();j++){
                reves[j] = paraula.charAt(index);
                index--;
            }
            for(j=0;j<paraula.length();j++){
                if(majus[j]==1){
                    reves[j] = Character.toUpperCase(reves[j]);
                }else{
                    reves[j] = Character.toLowerCase(reves[j]);
                }
            }
            paraula = String.valueOf(reves);
            paraules[i] = paraula;
        }
        for(i=0;i<casos;i++){
            System.out.println(paraules[i]);
        }
    }
}