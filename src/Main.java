import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
       String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio",
               "junho", "julho", "agosto", "setembro", "outrubro",
               "novembro", "dezembro"
       };

       int diasMes[] = {31,28,31,30,30,31,31,30,30,31,30,31};

       for(int i = 0; i <=mes.length-1; i++){
           System.out.println(mes[i] + "tem "  + diasMes[i] + " dias");
       }
    }
}
