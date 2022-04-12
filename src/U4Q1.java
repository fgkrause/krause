import java.util.Scanner;

public class U4Q1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com as horas trabalhadas no mês");
        int horasMes = teclado.nextInt();
        System.out.println("Enre com o valor pago por hora");
        int horasValor = teclado.nextInt();
        int salarioTotal = horasMes * horasValor;
        if (horasMes>160){
            int salarioExtra = (horasMes-160)*(horasValor/2);
            int salarioTutal = salarioTotal + salarioExtra;
            System.out.println("O salário total é " + salarioTutal);
        }else System.out.println("O salário total é " + salarioTotal);
        teclado.close();
    }
    
}
