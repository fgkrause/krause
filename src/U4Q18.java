import java.util.Scanner;

public class U4Q18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o valor da prestação");
        float prestacao = teclado.nextFloat();
        System.out.println("Digite a data de pagamento");
        int dia = teclado.nextInt();
        System.out.println("Digite a data do vencimento");
        int data = teclado.nextInt();

        if(data == dia){
            float valorfinal = prestacao - (prestacao*10f/100f);
            System.out.println("R$" + valorfinal + " pagamento em dia");
        }else if((data>dia)||(data<dia)){
            float valorfinal = prestacao + ((prestacao*2f/100f)+dia);
            System.out.println("R$"+valorfinal+" pagamento atrasado");
        }else;
        teclado.close();
    }
}
