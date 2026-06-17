import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
      // Estruturas Condicionais
        System.out.println("********************************");
        System.out.println("Resultado escolar final de ano");
        System.out.println("********************************");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a media do primeiro semestre: ");
        float notaPrimeiroSemestre = teclado.nextFloat();
        System.out.println("Digite a media do segundo semestre: ");
        float notaSegundoSemestre = teclado.nextFloat();
        float media = (notaPrimeiroSemestre + notaSegundoSemestre) / 2;

        if (media >= 7)
        {
            System.out.println("Aprovado media: " + media);
        } else if (media >= 5 && media <= 6) {
            System.out.println("Recuperação media: " + media);
        } else
        {
            System.out.println("Reprovado media: " + media);
        }

    }
}