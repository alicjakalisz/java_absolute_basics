package pl.sda.javalon4.kalisz.dzien3.TablicaArray;

public class Array {
    // int [] liczby=new int[5]; liczba to dlugo tablicy ktorej tworzymy, WARTOSCI DOMYSLENE//  5 liczb i one maja wartosc 0
    public static void main(String[] args) {

        int[] liczby= new int[5];// ta tablica ma 5 elemetnow 0 0 0 0 0
        // dwie rzeczy: zajrzec w konkretne miejsce i odczytac wartosc i wpisac wartosc w konkretnre miejsce
        int x=liczby[0]; // przypisac wartosc z indeksu do int i(bedzie 0 jak nic nie jest przypisane)
        System.out.println(liczby[0]); // odczytuje wartosc z indeksu 0
        System.out.println(liczby[4]);
       // System.out.println(liczby[5]); -- wywali sie program bo indeks od 0-4

        int index=0;
        System.out.println(liczby[index]);//== liczby[0] - odczytywanie z indeksu

        System.out.println(liczby.length);// odczytywanie dlugosci tablicy (ilosc elemenotw)
        //ta petla powtorzy sie tyle razy ile jest elemenotw  wtablicy
        for(int i=0; i<liczby.length; i++){
            System.out.println(liczby[i]);
        }

        liczby[0]=666;
        System.out.println(liczby[0]);




    }
}
