package pl.sda.javalon4.kalisz.dzien2;

public class Konwersje {
    public static void main(String[] args) {

        short b1 = 100;
        long b2 = b1;
        System.out.println(b1);
        System.out.println(b2);

        int c1=300000;
        float c2=c1; // najwieksz mozliwy int zawsze zmiesci sie do float bo float jest tylko ograniczony do miejsc po przecinku
        System.out.println(c1);
        System.out.println(c2);

        int d1=50000; // 50000
        double d2=d1;  // 50000.0



        long e1= 100000000000000L;
        int e2=(int)e1; // system would flag us that it is impossible and then you need to confirm you are putting bucket into small glass and put (int) before

        int z1= 1172910572;
        float z2=z1;

        System.out.println(z1);
        System.out.println(z2); // notacja naukowa 1.17291059E9 - musisz przesunac przecinek o 9 aby wiedzeic jaka to liczba

        short f1= 10000;
        byte f2=(byte)f1; // znowu musimy dac w nawias bo przelewamy do mniejszego kubka i albo bedzie ok albo wyjdzie syf

        // KONWERSJA CHAR to Integer

        char g1='s';
        int g2=g1; // przejdzie bo char mniejszy od int ale da ci kod ASCII , integer jest wiekszy od char ( z wiekszego do mniejszego)

        // KONWERSJA INTEGER to char

        int h1= 97;
        char h2=(char)h1; // musimy kastowac bo char nie ma takiej rozpietosci, wiec przerzucamy z mniejszego do wiekszego



        double j1=0.1234567891234;
        float j2=(float)j1;

        System.out.println(j1);
        System.out.println(j2); // obetnie koncowke


    }
}
