import java.util.Scanner;

public class U4Q24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com 3 valores");
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int z = teclado.nextInt();
        System.out.println("Escreva a ordem usando numeros de 1 até 3");
        int ordem = teclado.nextInt();
        
        switch(ordem){
            case 1:
            if((x>y)&&(x>z)&&(y>z)){
                System.out.println(z +" " + y +" "+ x);
            }else if((x>y)&&(x>z)&&(z>y)){
                System.out.println(y+" "+z+" "+x);
            }else if((y>x)&&(y>z)&&(z>x)){
                System.out.println(x+" "+z+" "+y);
            }else if((y>x)&&(y>z)&&(x>z)){
                System.out.println(z+" "+x+" "+y);
            }else if((z>x)&&(z>y)&&(x>y)){
                System.out.println(y+" "+ x+ " "+z);
            }else if((z>x)&&(z>y)&&(y>x)){
                System.out.println(x+" "+ y+ " "+z);
            }
            break;
            case 2:
            if((x>y)&&(x>z)&&(y>z)){
                System.out.println(x +" " + y +" "+ z);
            }else if((x>y)&&(x>z)&&(z>y)){
                System.out.println(x+" "+z+" "+y);
            }else if((y>x)&&(y>z)&&(z>x)){
                System.out.println(y+" "+z+" "+x);
            }else if((y>x)&&(y>z)&&(x>z)){
                System.out.println(y+" "+x+" "+z);
            }else if((z>x)&&(z>y)&&(x>y)){
                System.out.println(z+" "+ x+ " "+y);
            }else System.out.println(x+" "+z+" "+y);
            break;
            case 3:
            if((x>y)&&(x>z)){
                System.out.println(y +" " + x +" "+ z);
            }else if((y>x)&&(y>z)){
                System.out.println(z+" "+y+" "+x);
            }else if((z>x)&&(z>y)){
                System.out.println(y+" "+z+" "+ x);
            }
            teclado.close();
        }
    }
}
