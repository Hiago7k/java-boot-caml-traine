import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
      // Par ou impar
        Scanner teclado = new Scanner(System.in);
        System.out.println("Par ou impar");
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();


        if(numero % 2 == 0){
            System.out.println("é par");
        }else {
            System.out.println("Impar");
        }
    }
}