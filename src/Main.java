import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        System.out.println("**************************");
        System.out.println("-------Calculadora--------");
        System.out.println("-------- + - = x ---------");
        System.out.println("**************************");
        System.out.print("Informe um valor: ");
        Scanner numeroRecebido = new Scanner(System.in);
        float numeroDaCalculadora = numeroRecebido.nextFloat();

        int restoDivisao = (int) numeroDaCalculadora % 2;
        float raizQuadrada = (float) Math.sqrt(numeroDaCalculadora);
        float raizCubica = (float) Math.cbrt(numeroDaCalculadora);
        float elevadoAocubo = (float) Math.pow(numeroDaCalculadora,3);
        float valorAbsoluto =  (float) Math.abs(-numeroDaCalculadora);

        System.out.println("Resto da divisão por 2 é: " + restoDivisao);
        System.out.println("Raiz Quadrada: " + raizQuadrada);
        System.out.println("Raiz cúbica: " + raizCubica);
        System.out.println("Elevado ao cubo: " + elevadoAocubo);
        System.out.println("Valor absoluto: " + valorAbsoluto);
    }
}