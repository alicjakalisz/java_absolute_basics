package pl.sda.javalon4.kalisz.dzien2;

import java.util.Scanner;

public class NowePrawaSwitch {
/* w przypadku if'a warunek albo prawidzy albo falszywy i potem else if, zamiast tego mozemy uzyc switcha ktory dostaje jakas libcze i moze miec nieskonczenie wiele przypadkow
* chodzi o to zeby przy takiej ilosc przypadkow nie robic tysiac rzy if else tylko case-y , jest jeszcze wartosc domyslna default
* default oznacza ze jezeli zaden warunek nie zostal spelniony z case-ow to wtedy wpada nam to do default
* NIE MA WARUNKOW LOGICZNYCH (jak IF ><-) np podaje tylko INT , jakas liczbe i piszemy jakie sa KONKRETNE opcje (nie ze jak cos jest wieksze czy mniejsze to wtedy cos) ,
*  nie ma PRAW LOGICZNYCH tylko OPJCE KTORE WYPISUJEMY MY, jak uzytkwonik nie wybierze zadnej z opcji to idzie to do default
* Nie ma zadnych nawiasow w switchow, break jest uzywany jako wyjscie z kod bo inaczej by przeszedl i sprawdzil reszte kodu
* KAZDY SWITCH MUSI MIEC BREAKA PO KAZDYM CASE-ie I DEFAULT-cie*/
    public static void main(String[] args) {

        System.out.println("Prosze podac ktore masz urodziny");
        Scanner scanner= new Scanner(System.in);
        int wiek= scanner.nextInt(); // zczytujemy wiek

        switch(wiek){
            case 18:
                System.out.println("Mozesz robic prawo jazdy");
                break; // kaze wskoczyc na sam dol poza switcha
            case 35:
                System.out.println("Mozesz startowac na prezydenta");
                break;
            case 60:
                System.out.println("Mozesz isc na emeryture");
                break;
            default:
                System.out.println(" Nie nabywasz zadnych nowych praw");
                break;

        }// wpisujemy number - 35, switch przeskakuje case 18 i wskakuje do 35 , wykonuje kod i opuszcza switcha
        // jak by nie bylo breakow to kod by nadal przeskoczyl do 35 i wykonal reszte kod w dol.


    }
}
