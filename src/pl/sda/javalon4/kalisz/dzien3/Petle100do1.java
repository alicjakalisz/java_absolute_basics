package pl.sda.javalon4.kalisz.dzien3;

public class Petle100do1 {
    public static void main(String[] args) {

/*
        for (int i = 100; i>=1; i=i-2) {

            System.out.println(i);
        } */


        int i=100;
        while(i>=1){
            System.out.println(i);
            i--;
        }


        int y =100;
        while(true){
            if(y<0){
                break;
            }
            System.out.println(y);
            y--;
        }
        System.out.println("Koniec");
    }
}
