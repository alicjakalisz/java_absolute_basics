package pl.sda.javalon4.kalisz.dzien4.Stringi;

public class ZabawaStringami {
    public static void main(String[] args) {

        String x = "Przemyslaw Zawojski";
        System.out.println(x.charAt(0));
        System.out.println(x.charAt(x.length()-1));// bo x.length jest dluzsze niz indeksy liczone od 0
        System.out.println(x.length()/2);
        String przemyslaw=x.substring(0,10);
        System.out.println(przemyslaw);
        String zawojski=x.substring(11);
        System.out.println(zawojski);
        for (int i = 0; i <x.length() ; i++) {
            char ch=x.charAt(i);
            System.out.println(i);

        }

        for (char znak : x.toCharArray()){
            System.out.println(znak);
        }

        System.out.println("\uD852\uDF62");

        String a = "Szczebrzeszyn";
        if(a.length()%2==0){ // jak parzyste to bierzemy dwie srodkowe znak - Szczebrzeszyn -
            String srodkoweZnaki = a.substring(a.length() / 2 - 1, a.length() / 2 + 1); // string nie jest mutuable wiec trzeba go zapisac do nwoej zmiennej aby wydrukowac
            System.out.println(srodkoweZnaki); // dupa 4/2=2 wiec dla u, 2-1, dla p? 4/2=2 +1 =3????

        }
        else{
            System.out.println(a.charAt(a.length()/2)); // bo nieparzyste ABC  --Szczebrzeszyn - r, kotek - 5 liter 5/2=2 wiec kotem indeks 2
        }

        //indexOf()- zwraca index
        String x2="Litwa Ojczyzno Moja Ile Cie Cenic Ile Cie Kochac";
        int i1=x2.indexOf("Ile"); // kazdy przerobiony string aby go wydrukowac musi byc w kolejnej zmiennej
        int i2=x2.indexOf("Polsko");
        System.out.println(i1);// 20
        System.out.println(x2.charAt(i1));
        System.out.println(i2);
        int i3=x2.indexOf("Ile",21);
        System.out.println(i3);


    }

}
