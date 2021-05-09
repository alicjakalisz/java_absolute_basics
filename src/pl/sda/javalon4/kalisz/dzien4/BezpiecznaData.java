package pl.sda.javalon4.kalisz.dzien4;

public class BezpiecznaData {
// Atrybuty
    private int dzien; // zadna klasa poza BezpiecznaDAta nie jest w stanie na instancjach Bezpiecznej, chcemy je udos
    private int miesiac;
    private int rok;

// Contructor

public BezpiecznaData(int dzien, int miesiac, int rok){
    this.dzien=dzien;
    this.miesiac=miesiac;
    this.rok=rok;
    boolean jestPoprawna=poprawna(); // tworzymy zmienna aby przechowywala wynik metody niestatycznej poprawna
    if(!jestPoprawna){
        throw new RuntimeException();
    }
}



// metoda
    public boolean poprawna(){
        if(miesiac<1 || miesiac>12){
            return false;
        }
        int maxDni=MetodyDlaDat.dniWMiesiacu(rok, miesiac);// max dni dla danego miesiaca w roku
        if(dzien<1 || dzien>maxDni){
            return false; // jak dzien nie jest pomiedzy 1 i 28/29/30
        }
        else{
            return true;
        }

    }

    public String przerobNaTekst(){// metoda niestatyczna, dziala tylko na instancjach utworzonych z tej klasy (Data)
        return this.dzien+ "."+ this.miesiac+ "."+ this.rok; // jak dajesz this to zaznaczasz ze uzywasz tych atributow z gory ALE bez this WCIAZ bedzie dzialac!

    }
    //  w momencie kiedy przestawilismy atrybuty na z public do private to musimy wprowadzic metode getter aby wystwierlic ja bez mozeliwosci zmiany
    public int getDzien(){
    return dzien;
    }
/*    public void setDzien(int dzien){
    int maxDni = DniWMiesiacu.dniWMiesiacu(rok,miesiac);
    if(dzien>=1 && dzien <= maxDni){
        this.dzien=dzien;
    }
    else if
    }*/






}
