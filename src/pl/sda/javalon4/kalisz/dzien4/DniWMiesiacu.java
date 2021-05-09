package pl.sda.javalon4.kalisz.dzien4;

public class DniWMiesiacu {
    public static void main(String[] args) {
        int dniwCzerwcu= dniWMiesiacu(2019,6);
        int dniWLutym= dniWMiesiacu(2020,2);
        System.out.println(dniwCzerwcu);
        System.out.println(dniWLutym);

    }


    public static int dniWMiesiacu(int rok, int miesiac){ // podaje ile jest dni w danym miesiacu z uwzglednieniem lutego - bada czy luty jest dniem przystepnym, dlatego potzebujemy dwoch int
        //musimy  podac rok tylko dlatego bo w casie 2 , w lutym uzyjemy go aby sprawdzic czy rok jest przystepny

        switch (miesiac){

            case 1:
                return 31;
            case 2:
                return (RokPrzystepny.jestPrzystepny(rok))? // korzystamy z klasy RokPrzystepny, z jej metody jestPrzystepny ;  if(expression) ? true: false;
                     29 : 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;

        }
    }
}
