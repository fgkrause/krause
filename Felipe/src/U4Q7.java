import java.util.Scanner;

public class U4Q7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o peso da carta");
        int peso = teclado.nextInt();
        int pesoExcedido = peso-50;
        float qtAdicional = (pesoExcedido/20f)+1f;
        float valoraPagar = 0.45f + 0.45f * qtAdicional;
        if(peso<=50){
            float valorPagar = 0.45f;
            System.out.println("Custo do selo " + valorPagar);

        }else System.out.println("Custo do selo " + String.format("%.2f",valoraPagar)); 
        teclado.close();
    }
    
}
