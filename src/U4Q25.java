import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class U4Q25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = teclado.nextInt();
        System.out.println("Digite 2 numeros");
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        switch(opcao){
            case 1:
            int produto = x+y;
            System.out.println(produto);
            break;
            
            case 2:
            int produto2 = x-y;
            System.out.println(produto2);
            break;

            case 3:
            int produto3 = x*y;
            System.out.println(produto3);
            break;
            
            case 4:
            int produto4 = x/y;
            System.out.println(produto4);
        }
             teclado.close();
 
    }
}
