import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        int cambalhota = 0;
        while (cambalhota < 10){
            cambalhota++ ;
            if (cambalhota == 2 || cambalhota == 3 || cambalhota == 4) {
                continue;
            }

            if(cambalhota == 7){
                break;
            }
            System.out.println("Dando uma cambolha pela vez: " + cambalhota);
        }
    }
}
