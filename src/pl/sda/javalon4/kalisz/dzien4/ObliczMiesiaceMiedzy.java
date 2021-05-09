package pl.sda.javalon4.kalisz.dzien4;

public class ObliczMiesiaceMiedzy {

    public static void main(String[] args) {


        int dzienData1=10;
        int miesiacData1=5;
        int rokData1=1990;
        int dzienData2=1;
        int miesiacData2=3;
        int rokData2=2020;

        int wynik= obliczMiesiace(rokData1,rokData2,miesiacData1,miesiacData2);
        System.out.println(wynik);
    }


    public static int obliczMiesiace(int rokData1, int rokData2, int miesiacData1, int miesiacData2){

        return (rokData2-rokData1)*12 + (miesiacData2-miesiacData1);
    }
}
