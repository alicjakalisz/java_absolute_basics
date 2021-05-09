package pl.sda.javalon4.kalisz.dzien4.Stringi;

public class WielkosciLiter {

    public static void main(String[] args) {
        System.out.println(maSameMale("Mam wielkiego KOKOSA"));
        System.out.println(maSameMale("mam malego kokosa"));
    }
    public static boolean maSameMale(String x){
        String a =x.toLowerCase();
       return a.equals(x);
    }
}
