import javax.swing.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

    static void soma (int a, int b){
        int soma = a + b;
        System.out.println("A soma é: " + soma);
        System.out.println("Método que criei e executado depois");
    }

    public static void main(String[] args) {
        System.out.println("Método Main é executado primeiro");
        soma(10,2);
    }
}
