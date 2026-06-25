import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        int nums[] = {1, 2 ,3 ,4 ,5 ,6};
        for(int valor: nums){
            System.out.print(valor + "");
        }
        System.out.println();
        int posicao = Arrays.binarySearch(nums, 1);
        System.out.println("Encontrei o valor na posicao " + posicao);

    }
}
