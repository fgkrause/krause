import java.util.Scanner;

public class U4Q19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o valo de x");
        int x = teclado.nextInt();
        System.out.println("Entre com o valor de y");
        int y = teclado.nextInt();
        if((x==0)&&(y==0)){
            System.out.println("Quadrante 0");
        }else if((x>0)&&(y<0)){
            System.out.println("Quadrante 1");
        }else if((x<0)&&(y<0)){
            System.out.println("Quadrante 2");
        }else if((x<0)&&(y>0)){
            System.out.println("Quadrante 3");
        }else System.out.println("Quadrante 4");
        teclado.close();
    }
}
