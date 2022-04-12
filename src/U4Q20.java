import java.util.Scanner;

public class U4Q20 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Digite a nota de suas 3 provas");
         int prova1 = teclado.nextInt();
         int prova2 = teclado.nextInt();
         int prova3 = teclado.nextInt();
         System.out.println("Digite a media dos exercicios");
         int exer = teclado.nextInt();
         int media = (prova1+prova2*2 + prova3*3 + exer)/7;
         if(media>=9.0){
             System.out.println("A");
         }else if((media>=7.5)&&(media<9)){
             System.out.println("B");
         }else if((media>=6.0)&&(media<7.5)){
             System.out.println("C");
         }else if((media>=4.0)&&(media<6.0)){
             System.out.println("D");
         }else System.out.println("E");
         teclado.close();
    }
}
