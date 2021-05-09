package pl.sda.javalon4.kalisz.dzien4.Stringi;

public class SlowaWZdaniu {
    //Korzystając z indexOf() i substring() stwórz funkcję, która wypisuje po kolei wszystkie
    //słowa w podanym stringu. Jeśli w stringu występują dwie spacje pod rząd, rzuć
    //wyjątek.

    public static void main(String[] args) {
        drukujSlowa("Java jest super a ja mlody");

    }


    public static void drukujSlowa(String tekst){
        int fromIndeks =0;
        while(true){
            int nextSpace=tekst.indexOf(" ",fromIndeks);
            if(nextSpace!=-1){
                System.out.println(tekst.substring(fromIndeks, nextSpace));
                fromIndeks=nextSpace+1;
            }
            else{
                System.out.println(tekst.substring(fromIndeks));
                return;
            }


        }


    }
}
