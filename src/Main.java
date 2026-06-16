import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
       // Sistema de votação pessoas de 16 a menor de 18 podem votar opcionalmente
        // pessoas de 18 até 70 sao obrigadas a votar
        // pessomas acima de 70 votam opcionalmente

        int idade = 19;
        String eleitor;

        eleitor = (idade >= 16 && idade < 18 || idade >= 70)?"pode votar se quiser":"voto obrigatorio";
        System.out.println(eleitor);
    }
}