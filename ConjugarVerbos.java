//123 - Conjugar verbos
import java.util.Scanner;
public class ConjugarVerbos{
    public static void Presente(String paraula, String[] conjugado){
        int index = 0;
        char letra;

        if(paraula.charAt(paraula.length()-2)=='e'||paraula.charAt(paraula.length()-2)=='i'){
            letra = 'e';
        }else{
            letra = 'a';
        }

        conjugado[index] = "yo "+paraula.substring(0,paraula.length()-2)+"o";
        index++;
        conjugado[index] = "tu "+paraula.substring(0,paraula.length()-2)+letra+"s";
        index++;
        conjugado[index] = "el "+paraula.substring(0,paraula.length()-2)+letra;
        index++;
        conjugado[index] = "nosotros "+paraula.substring(0,paraula.length()-1)+"mos";
        index++;
        if(paraula.charAt(paraula.length()-2)=='i'){
            conjugado[index] = "vosotros "+paraula.substring(0,paraula.length()-1)+"s";
        }else{
            conjugado[index] = "vosotros "+paraula.substring(0,paraula.length()-1)+"is";
        }
        index++;
        conjugado[index] = "ellos "+paraula.substring(0,paraula.length()-2)+letra+"n";
    }
    public static void Preterito(String paraula, String[] conjugado){
        int index = 0;
        char letra, segunda;

        if(paraula.charAt(paraula.length()-2)=='e'||paraula.charAt(paraula.length()-2)=='i'){
            letra = 'i';
            segunda = 'i';
        }else{
            letra = 'e';
            segunda = 'a';
        }

        conjugado[index] = "yo "+paraula.substring(0,paraula.length()-2)+letra;
        index++;
        conjugado[index] = "tu "+paraula.substring(0,paraula.length()-2)+segunda+"ste";
        index++;
        if(paraula.charAt(paraula.length()-2)=='a'){
            conjugado[index] = "el "+paraula.substring(0,paraula.length()-2)+"o";
            conjugado[index+1] = "nosotros "+paraula.substring(0,paraula.length()-1)+"mos";
            conjugado[index+2] = "vosotros "+paraula.substring(0,paraula.length()-1)+"steis";
            conjugado[index+3] = "ellos "+paraula+"on";
        }else{
            conjugado[index] = "el "+paraula.substring(0,paraula.length()-2)+"io";
            conjugado[index+1] = "nosotros "+paraula.substring(0,paraula.length()-2)+"imos";
            conjugado[index+2] = "vosotros "+paraula.substring(0,paraula.length()-2)+"isteis";
            conjugado[index+3] = "ellos "+paraula.substring(0,paraula.length()-2)+"ieron";
        }
    }
    public static void Futuro(String paraula, String[] conjugado){
        int index = 0;

        conjugado[index] = "yo "+paraula+"e";
        index++;
        conjugado[index] = "tu "+paraula+"as";
        index++;
        conjugado[index] = "el "+paraula+"a";
        index++;
        conjugado[index] = "nosotros "+paraula+"emos";
        index++;
        conjugado[index] = "vosotros "+paraula+"eis";
        index++;
        conjugado[index] = "ellos "+paraula+"an";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paraula;
        String[] conjugado = new String[6];
        char conjugar;
        int i;

        do {
            paraula = sc.next();
            conjugar = sc.next().charAt(0);
            switch (conjugar){
                case 'A': Presente(paraula, conjugado);
                break;
                case 'P': Preterito(paraula, conjugado);
                break;
                case 'F': Futuro(paraula, conjugado);
                break;
            }
            if(conjugar!='T'){
                for(i=0;i<6;i++){
                    System.out.println(conjugado[i]);
                }
            }
        } while (conjugar!='T');
    }
}
