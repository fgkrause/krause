import java.util.Scanner;

public class U4Q12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 valores");
        float lado1 = teclado.nextFloat();
        float lado2 = teclado.nextFloat();
        float lado3 = teclado.nextFloat();
        if((lado1 == lado2) && (lado2 == lado1)){
            System.out.println("TRIANGULO EQUILATERO");
        }else if((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)){
            System.out.println("TRIANGULO ISOCELES");
        }else 
        System.out.println("TRIANGULO ESCALENO");
        teclado.close();
       
    }
}