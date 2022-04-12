import java.util.Scanner;

public class U4Q16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva a idade de 2 homens");
        int homem1 = teclado.nextInt();
        int homem2 = teclado.nextInt();
        System.out.println("Digite a idade de 2 mulheres");
        int muie1 = teclado.nextInt();
        int muie2 = teclado.nextInt();

        if((homem1>homem2)&&(muie1>muie2)){
            int produto1 = homem1 + muie2;
            int produto2 = homem2 * muie1;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é de " + produto1);
            System.out.println("O produto do homem mais novo com a mulher mais velha é de " + produto2);

        }else if((homem1>homem2)&&(muie2>muie1)){
            int produto1 = homem1 + muie1;
            int produto2 = homem2 * muie2;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é de " + produto1);
            System.out.println("O produto do homem mais novo com a mulher mais velha é de " + produto2);

        }else if((homem2>homem1)&&(muie2>muie1)){
            int produto1 = homem2 + muie1;
            int produto2 = homem1 * muie2;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é de " + produto1);
            System.out.println("O produto do homem mais novo com a mulher mais velha é de " + produto2);

        }else if((homem2>homem1)&&(muie1>muie2)){
            int produto1 = homem1 + muie2;
            int produto2 = homem2 * muie1;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é de " + produto1);
            System.out.println("O produto do homem mais novo com a mulher mais velha é de " + produto2);
        }else System.out.println("Error");
        
        teclado.close();
    }
}
