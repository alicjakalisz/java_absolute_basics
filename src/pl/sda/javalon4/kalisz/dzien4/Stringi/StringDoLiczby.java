package pl.sda.javalon4.kalisz.dzien4.Stringi;

public class StringDoLiczby {

    public static void main(String[] args) {
        String x = "Bob" + 1; // zanim do liczby doda Boba to przeksztalci ta liczbe w wartosc tekstowa
        System.out.println(x);
        String liczbaJakoTekst = Integer.toString(999); // robimy ze stringa int liczbe
        int liczbaJakoLiczba = Integer.parseInt(liczbaJakoTekst); // liczbe zmieniamy na liczbe jako tekst
        System.out.println(liczbaJakoTekst + 1);
        System.out.println(liczbaJakoLiczba+1);

}}
