/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grenais1131beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Grenais1131Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int N = 0;
        int grenal = 0;
        int inter = 0;
        int gremio = 0;
        int empate = 0;
        String maiorVencedor = "";
        
        while (N != 2){
            int placarInter = teclado.nextInt();
            int placarGremio = teclado.nextInt();
            grenal ++;
            
            if (placarInter > placarGremio) {
                inter ++;
            } else if (placarInter < placarGremio) {
                gremio ++;
            } else {
                empate ++;
            }
            
            if (inter > gremio) {
                maiorVencedor = "Inter";
            } else if (inter < gremio) {
                maiorVencedor = "Gremio";
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            N = teclado.nextInt();
        }
        System.out.printf(grenal + " grenais\n");
        System.out.printf("Inter:" + inter + "\n");
        System.out.printf("Gremio:" + gremio + "\n");
        System.out.printf("Empates:" + empate + "\n");
        System.out.printf(maiorVencedor + " venceu mais\n");
    }
    
}
