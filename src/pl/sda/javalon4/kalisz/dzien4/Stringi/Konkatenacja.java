package pl.sda.javalon4.kalisz.dzien4.Stringi;

public class Konkatenacja {

    public static void main(String[] args) {
        String imie = "Bob";
        String nazwisko= "Marley";
        System.out.println(imie);
        System.out.println(nazwisko);
        String polaczenie = imie.concat(nazwisko);// bez przerwy
        System.out.println(polaczenie);
        System.out.println(imie);
        System.out.println(nazwisko);
        String polaczenie2=String.join(" ",imie, nazwisko);
        System.out.println(polaczenie2);



    }
}
