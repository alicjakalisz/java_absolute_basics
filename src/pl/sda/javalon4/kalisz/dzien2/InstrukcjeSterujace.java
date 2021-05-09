package pl.sda.javalon4.kalisz.dzien2;

// instrukcje sterujace- fragment codu ktory umozliwia zmiane kolejnosci wykonanina instrukcji (cyzli nie jednak linijka po drugiej)
// instrukcje warunkowe
// petle


//**************** INSTRUKCJE WARUNKOWE IF******************************//
public class InstrukcjeSterujace {

    public static void main(String[] args) {

        int wiek = 15;
        if(wiek>=18){
            System.out.println("Jestes pelnoletni");
            System.out.println("mozesz robic prawo jazdy");
        }else { // else zawiera kod ktory jest wykonywany w przypadku gdy warunek z if nie jest spelniony
            System.out.println("niestety nie jestes jeszcze pelnoletni");

        }

    // to znajduje sie poza If'sem , dalsza czesc kodu
        System.out.println("kod poza if'em kontunuje");


        //SLAJD nr 62


        if(2>3){
            System.out.println("przyklad a= :)"); // cod zignorowany bo warunek nie spelniony
        }else {
            System.out.println("przyklad a= ;-(");
        }
        if(4<5) {
            System.out.println("przyklad b= :)");
        }else{
            System.out.println("przyklad b= :-(");
        }
        if((2-2)==0){
            System.out.println("przyklad c= :)");
        }else {
            System.out.println("przyklad c= :-(");
        }

        if(true){
            System.out.println("przklad d= :)");
        } else{
            System.out.println("przyklad d= :-(");
        }
        if(9%2==0){ // ten kod sprawdza czy 9 jest parzysta czy nie, bo jak reszta 0 to znaczy ze bylaby parzysta
            System.out.println("przyklad e= :)");// cod zignorowany bo warunek nie spelniony
        }else {
            System.out.println("przyklad e= :-(");
        }
        if(9%3==0){
            System.out.println("przyklad f= :)");
        } else{
            System.out.println("przyklad f= :-(");
        }






    }
}
