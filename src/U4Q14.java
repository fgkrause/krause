import java.util.Scanner;

public class U4Q14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia");
        int dia = teclado.nextInt();
        System.out.println("Digite o mes");
        int mes = teclado.nextInt();
        System.out.println("Digite o ano");
        int ano = teclado.nextInt();

        if(dia>0 && dia<32 && mes>0 && mes<13 && ano>1){
           if(mes==1||mes==2||mes==3||mes==4||mes==5||mes==6||mes==7||
           mes==8||mes==9||mes==10||mes==11||mes==12){
              System.out.println("VALIDA");
           } else if(mes !=2 && dia<31){
              System.out.println("VALIDA");
           }else if(mes == 2 && dia<29){
              System.out.println("VALIDA");
           }else if(dia==29 && ano%4==0 && !(ano%100==0 && ano%400!=0)){
              System.out.println("VALIDA");
           }else System.out.println("NÃO VALIDA");
        }else System.out.println("NÃO VALIDA");
           teclado.close();
    }
}
