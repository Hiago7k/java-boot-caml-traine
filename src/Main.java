import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
       // Comparando Strings
        String nome1 = "Hiago";
        String nome2 = "Hiago";
        String nome3 = new String("Hiago");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        //a variavel res vai receber ou a palavra igual ou a palavra diferente
        System.out.println(res);
    }
}