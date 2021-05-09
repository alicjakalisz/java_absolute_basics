package pl.sda.javalon4.kalisz.dzien4;

import java.util.Objects;

public class DataV2 {// we dont need to put main here
    // attributes
    private int dzien;
    private int miesiac;
    private int rok;


    // constructor
    public DataV2(int dzien, int miesiac, int rok){
        this.dzien=dzien;        // this jest obligatoryjne
        this.miesiac=miesiac;
        this.rok=rok;
    }

    public DataV2(){} // pusty konstruktor - jesli nie podamy arguemtnow to ten bedzie wybrany

    //SETTER METHODS
    // the setters are used after the object is initalised with contrcutor, in case we want to modify the value of attributes
    // they are void as you get a  DataV2 object2= new DataV2();
    // they are void because you dont return anythgin, you change the value
    public void setDzien(int dzien){
        this.dzien=dzien;
    }

    public void setMiesiac(int miesiac){
        this.miesiac=miesiac;
    }

    public void setRok(int rok){
        this.rok=rok;
    }

    //GETTER METHODS

    public int getDzien(){
        return dzien;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public int getRok() {
        return rok;
    }

    //method
    public String przerobNaTekst(){// metoda niestatyczna, dziala tylko na instancjach utworzonych z tej klasy (Data)
        return this.dzien+ "."+ this.miesiac+ "."+ this.rok; // jak dajesz this to zaznaczasz ze uzywasz tych atributow z gory ALE bez this WCIAZ bedzie dzialac!

    }
    //Stwórz w klasie Data metodę instancji do porównywania jej z inną datą.
//Metoda powinna zwrócić:
//• -1, jeśli nasza data jest wcześniejsza niż podana data
//• 0, jeśli nasza data jest taka sama jak podana data
//• 1, jeśli nasza data jest późniejsza niż podana data
    public int porownaj(Data innaData){

        if(this.rok!=innaData.rok){ // jak rok nie jest taki sam - jak rok jest taki sam to konczy sie metoda
            return this.rok < innaData.rok ? -1:1; //jezeli nasz rok jest mniejsze od podanej daty to -1 a jak wiekszy to 1
        }
        else if(this.miesiac!=innaData.miesiac){
            return this.miesiac<innaData.miesiac ? -1:1;
        }
        else if(this.dzien!=innaData.dzien){
            return this.dzien<innaData.dzien ? -1:1;
        }
        else{
            return 0;
        }
    }
    //Pola daty takie jak miesiąc czy dzień nie mogą przyjmować dowolnych
    //wartości:
    //• ani dni, ani miesiące nie mogą być równe zero ani ujemne
    //• każdy rok ma 12 miesięcy
    //• każdy miesiąc ma określoną długość
    //Stwórz na klasie Data metodę instancji sprawdzającą, czy jest to
    //poprawna data


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

    @Override
    public boolean equals(Object o) {// Equal method is checking if two objects have the value. It is done by:
        if (this == o) return true;// checking if they have the same address in memory- if they are in the same address it means they are the same objects
        if (o == null || getClass() != o.getClass()) return false; //method getClass - is a method that gives me the name of the class alll classes have it
        DataV2 dataV2 = (DataV2) o; // at the time of the casting you know that they belong to the same class and you can cast the object that you have as parameter
        //... to the same class
        return getDzien() == dataV2.getDzien() && // you use == as attributes of these class are int so you can compare value using == , if the attribut was object,
                //... you need to use equals
                getMiesiac() == dataV2.getMiesiac() &&
                getRok() == dataV2.getRok();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDzien(), getMiesiac(), getRok());
    }
}

