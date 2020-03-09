//520 - ¿Dónde está la bolita?
import java.util.Arrays;
import java.util.Scanner;
public class DondeEstaLaBolita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cubiletes = new int [100000];
        int posBolita, numCubiletes, i;
        int intercanvi1, intercanvi2, aux;
        boolean trobat;

        numCubiletes = sc.nextInt(); posBolita = sc.nextInt();
        while (numCubiletes != 0 && posBolita != 0) {
            Arrays.fill(cubiletes, 0); trobat = false; i = 0;
            cubiletes[posBolita-1] = 1;
            do {
                intercanvi1 = sc.nextInt(); intercanvi2 = sc.nextInt();
                if (intercanvi1 != 0 && intercanvi2 != 0) { 
                    if (cubiletes[intercanvi1-1] == 1 || cubiletes[intercanvi2-1] == 1) { 
                        // Si un valor dels intercanvis conté la boleta
                        // Si un valor del intercambio contiene la bolita
                        aux = cubiletes[intercanvi1-1];
                        cubiletes[intercanvi1-1] = cubiletes[intercanvi2-1];
                        cubiletes[intercanvi2-1] = aux;
                    }
                }
            } while (intercanvi1 != 0 && intercanvi2 != 0);
            // Busqueda de on esta la bolita
            // Buscar la bolita
            while (!trobat && i < numCubiletes) {
                if (cubiletes[i] == 1) {
                    trobat = true;
                } else {
                    i++;
                  }
            }
            System.out.println(i+1);
            numCubiletes = sc.nextInt(); posBolita = sc.nextInt();
        }
    }
}