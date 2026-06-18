import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
      // Maior ou menor de idade
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }

    }
}