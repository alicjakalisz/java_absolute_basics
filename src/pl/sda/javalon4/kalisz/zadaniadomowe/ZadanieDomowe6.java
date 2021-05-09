package pl.sda.javalon4.kalisz.zadaniadomowe;

/*     Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'. Przypisz do nich jakieś wartości.
Stwórz instrukcję warunkową ('if') który sprawdza czy osoba (np. taka która na
kolejkę/rollercoaster) jest wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg*/

public class ZadanieDomowe6 {

    public static void main(String[] args) {

        float waga = 190;
        float wzrost = 190;

        if (wzrost >= 150 && waga <= 180) {
            System.out.println("mozesz wejsc");
        } else {
            if (wzrost < 150) {
                System.out.println("Nie wejsc na rollercoaster z powodu wzrostu");
            }
            if (waga > 180) {
                System.out.println("Nie mozesz wejsc z powodu wagi");
            }


        }
    }
}
