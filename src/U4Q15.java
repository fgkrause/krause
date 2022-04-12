import java.util.Scanner;

public class U4Q15 {
    public static void main(String[] args) {
        Scanenr teclado = new Scanner(System.in);
        System.out.println("Digite a sua quantidade de meses");
        int mes = teclado.nextInt();
        
        if(mes<12){
            System.out.println("5% de reajsute");
        }else if(mes>12 && mes<49){
            System.out.println("7% de reajuste");
        }else System.out.println("Invalido");
        teclado.close();
    }
}
