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
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();
        if((B>C)&&(D>A)&&(C+D>A+B)&&(C>0)&&(D>0)&&(A % 2 == 0)){
            System.out.println("Valores aceitos");
        }else System.out.println("Valores nao aceitos");
        teclado.close();
 
    }
 
}