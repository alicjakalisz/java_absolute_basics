package pl.sda.javalon4.kalisz.dzien2;

public class DrugiIf {
    public static void main(String[] args) {

        int wiek=50;


        // TUTAJ KOLEJNOSC MA ZNACZENIE I to JEST ROZWIAZANIE PREFEROWANE
        if(wiek>60){
            System.out.println("Emeryt");
        }else if(wiek>=18){ // else If (alternatywny warunek jesli powyszy nie zostal spelniony)
            System.out.println("Pelnoletni, nie emeryt");
        } else { // samo else w {} wykonuje cod jezeli powyzsze warunki nie zostaly spelnione
            System.out.println("Dziecko");
        }


/*        Mozna tak zrobic ale latwiej o blad
        if(wiek>60){
            System.out.println("Emeryt");
        }if(wiek<=60 && wiek>=18){
            System.out.println("Pelnoletni, nie emeryt");
        } if(wiek<18){
            System.out.println("Dziecko");
        }

        */
    }
}
