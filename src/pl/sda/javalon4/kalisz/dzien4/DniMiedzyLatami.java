package pl.sda.javalon4.kalisz.dzien4;

public class DniMiedzyLatami {

    public static void main(String[] args) {

    }

    public static int dniMiedzy(int rok1, int rok2){
        int suma=0;
        for (int i = rok1; i <rok2; i++) {
            suma+=RokPrzystepny.jestPrzystepny(i) ?
                    366:365;

        }
        return suma;
    }
}
