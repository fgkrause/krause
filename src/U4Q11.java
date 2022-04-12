import java.util.Scanner;

public class U4Q11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva a idade dos 3 irmãos");
        int irmao1 = teclado.nextInt();
        int irmao2 = teclado.nextInt();
        int irmao3 = teclado.nextInt();
        if((irmao1 == irmao2) && (irmao2 == irmao3)){
            System.out.println("TRIGEMIOS");
        }else if((irmao1 == irmao2) && (irmao2 != irmao3)){
            System.out.println("GEMEOS");
        }else System.out.println("APENAS IRMÃOS");
        teclado.close();
    }
    
}
