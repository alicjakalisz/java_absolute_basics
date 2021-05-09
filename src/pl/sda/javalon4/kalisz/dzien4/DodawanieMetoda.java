package pl.sda.javalon4.kalisz.dzien4;

public class DodawanieMetoda {

    public static void main(String[] args) {

        int a =200; // ta zmienna nie jest zwiazana z metoda i ze zmienna z metody dodawanie. Jak ja zadeklarujemy tutaj to ona ginie na koncu tej metody, nie jest przekazywana dalej.

        int wynik= dodawanie(6099, 208);
        System.out.println(wynik);


    }

    public static int dodawanie (int a, int b ){
        System.out.println("Dodawanie " + a + " " + b);
        return a+b;
    }
}
