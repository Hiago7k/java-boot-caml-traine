import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);
        System.out.println("Digite o ano que voces naceu: ");
        int nasc = data.nextInt();
        int idade = 2026 - nasc;

        if (idade < 16)
        {
            System.out.println("Não pode votar " + idade);
        }else {
            if ((idade >= 16 && idade < 18) || (idade > 70))
            {
                System.out.println("Voto opcional " + idade + " anos");
            }else {
                System.out.println("Voto obrigatorio " + idade  + " anos");
            }
        }
    }
}
