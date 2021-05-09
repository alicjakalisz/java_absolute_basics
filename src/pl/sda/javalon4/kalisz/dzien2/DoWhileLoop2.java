package pl.sda.javalon4.kalisz.dzien2;
// uzytinowik oblicza pierwiastki do momentu kiedu wpisze 0
import java.util.Scanner;

public class DoWhileLoop2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wpisz liczbe");

        int x=0;
        double pierwiastek=0;
        do{
             x=scanner.nextInt();
             pierwiastek=Math.sqrt(x);
            System.out.println(pierwiastek);
        }while(x>0);

    }
}
