import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
      // Maior ou menor de idade
        Scanner teclado = new Scanner(System.in);
        int ano = 2026;
        System.out.println("Em que ano você nasceu: ");
        int nasc = teclado.nextInt();

        int idade = ano - nasc;

        if (idade >= 18){
            System.out.println("Maior de idade  voce tem " + idade + " anos");
        }else {
            System.out.println("Menor de idade voce tem " + idade + " anos") ;
        }
    }
}