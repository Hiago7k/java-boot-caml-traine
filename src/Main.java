import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = teclado.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = teclado.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = teclado.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("O valor de delta é " +  d);

        if (d < 0){
            System.out.println("Não existem raizes reais");
        }else {
            System.out.println("Existem raizes reais");
            double raizdeDelta =  Math.sqrt(d / 2);
        }

    }
}
