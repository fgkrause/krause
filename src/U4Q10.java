import java.util.Scanner;

public class UQ10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva a idade de Marquinhos, Zezinho e Luluziha respectivamente");
        int filho1 = teclado.nextInt();
        int filho2 = teclado.nextInt();
        int filho3 = teclado.nextInt();
        if((filho1 < filho2) && (filho1 < filho3)){
            System.out.println("Marquinhos é o caçula");
        }else if((filho2 < filho1) && (filho2 < filho3)){
            System.out.println("Zezinho é o caçula");
        }else System.out.println("Luluzinha é a caçula");
        teclado.close();
    }
}
