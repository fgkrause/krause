import java.util.Scanner;

public class U4Q21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu peso em kg");
        int peso = teclado.nextInt();
        System.out.println("Digite a sua altura em metros");
        float altura = teclado.nextFloat();
        float imc = peso/(altura*2f);
        if(imc<18.5){
            System.out.println("Magreza");
        }else if((imc>=18.5)&&(imc<=24.9)){
            System.out.println("Saudável");
        }else if((imc>=25)&&(imc<=29.9)){
            System.out.println("Sobrepeso");
        }else if((imc>=30.0)&&(imc<=34.9)){
            System.out.println("Obesidade Grau 1");
        }else if((imc>=35.0)&&(imc<=39.9)){
            System.out.println("Obesidade Grau 2 (severa)");
        }else System.out.println("Obesidade Grau 3 (mórbida)");
        teclado.close();
    }
}
