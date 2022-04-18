import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
		int hInicial = leitor.nextInt();
		int hFinal = leitor.nextInt();

        if (hInicial > hFinal) { 
	    System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
        } else if (hFinal > hInicial) {
	    System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
        } else {
	    System.out.println("O JOGO DUROU 24 HORA(S)");
       }

    }
    
}