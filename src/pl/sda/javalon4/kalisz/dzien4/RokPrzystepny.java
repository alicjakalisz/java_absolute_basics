package pl.sda.javalon4.kalisz.dzien4;

public class RokPrzystepny {

    public static void main(String[] args) {

        boolean przystepny2019 = jestPrzystepny(2019);// tworzymy boolean zmienna i sprawdzamy czy rok jest przystepny metoda na dole
        boolean przesteony2020=jestPrzystepny(2020);

        System.out.println("Czy rok 2019 jest przystepny? " + przystepny2019);
        System.out.println("Czy rok 2019 jest przystepny? " + przesteony2020);


    }

    public static boolean jestPrzystepny (int rok){

        if(rok%4==0 && rok%100!=0){
            return true;
        }
        else if(rok%400==0){
            return true;
        }
        else {
            return false;
        }
    }

   /* public static boolean jestPrzystepny2 (int rok){

        return (rok % 4==0 && rok % 100!=0) || rok%400==0);

    } */
}
