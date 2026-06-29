import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        // Criando um array
        int numeros[] = {10, 232, 85, 754, 2323, 0};
        // iterando sobre o array com foreach
        System.out.println("Utilizando foreach");
        for (var valores : numeros ){
            System.out.println(valores);
        }

        // iterando sobre o array com for
        System.out.println();
        System.out.println("Utilizando for");
        for(int i = 0; i <= numeros.length -1; i ++)
        {
            System.out.println(numeros[i]);
        }
    }
}
