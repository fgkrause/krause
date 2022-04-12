import java.util.Scanner;

public class U4Q17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a renda anual");
        float renda = teclado.nextFloat();
        System.out.println("Digite o numero de dependentes");
        int dependentes = teclado.nextInt();
        float desconto = 2f*dependentes;
        float rendaLiquida = renda-((renda/100f)*desconto);
        int imposto = 0;
        if(rendaLiquida<=2000){
            System.out.println(rendaLiquida + " Não paga imposto de renda");
        }else if((rendaLiquida>2000)&&(rendaLiquida<5000)){
            imposto = 5;
            float rendaInt = rendaLiquida-((rendaLiquida/100f)*imposto);
            System.out.println(String.format("%.2f",rendaInt) + " Imposto de 5%");
        }else if((rendaLiquida>5000)&&(rendaLiquida<10000)){
            imposto = 10;
            float rendaInt = rendaLiquida-((rendaLiquida/100f)*imposto);
            System.out.println(String.format("%.2f",rendaInt) + " Imposto de 10%");
        }else if(rendaLiquida>10000){
            imposto = 15;
            float rendaInt = rendaLiquida-((rendaLiquida/100f)*imposto);
            System.out.println(String.format("%.2f",rendaInt) + " Imposto de 15%");
            teclado.close();
        }

    }
}
