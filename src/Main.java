import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {

//        int numero = 10;
//        int valor = 4 + numero--;
//        System.out.println(valor); // 14 pos incremento
//        System.out.println(numero); // 9

        //Operadoras de Atribuicao
//
//       int x = 4;
//       x += 2; // x = x + 2
//        System.out.println(x);


        // Arrendondamento utilizando Math
        // ceil arrendondando por artimetica
        double numero = 5.6;
        double numeroArrendondado = Math.ceil(numero);
        System.out.println(numeroArrendondado);

        // floor arrendondando para baixo
        float numerof = 8.9f;
        int numeroArrendodadoF = (int) Math.floor(numerof); // forcando o tipo
        System.out.println(numeroArrendodadoF); // saida esperada 8

    }
}