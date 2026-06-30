import javax.swing.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {


    // Método sem retorno
    static void soma (int a, int b){
        int soma = a + b;
        System.out.println("A soma é: " + soma);
    }

    static int somaComRetorno (int a, int b){
        int soma = a + b;
        return soma;
    }

    public static void main(String[] args) {
        soma(10,2); // soma sem retonro
        int resposta = somaComRetorno(10,50);
        System.out.println(resposta);
    }
}
