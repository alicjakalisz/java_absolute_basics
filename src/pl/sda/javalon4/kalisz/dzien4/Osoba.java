package pl.sda.javalon4.kalisz.dzien4;

import java.util.Objects;

public class Osoba {
// atrybuty
    public String imie;
    public String nazwisko;
    public Data dataUrodzenia; // korzystamy z klasy Data -


//konstruktory
    public Osoba(String imie, String nazwisko, Data dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }
    public Osoba(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        //these two lines below are equivalent , this is an example of return value a few lines below
        boolean equivalentResult = this.getImie()!=null && this.getImie().equals(osoba.getImie());
        boolean equivalentLine = Objects.equals(this.getImie(), osoba.getImie());
    //As the attributes they are objects, we dont use like before witn int ==, we need to check with equals method of the class. There is a utlity class Objects
        //... that compares the equality of two objects
        //For doing that it checks that the object that calls the equals method is different than null adn then it checks that the two objects there are equals
        return Objects.equals(this.getImie(), osoba.getImie()) &&
                Objects.equals(this.getNazwisko(), osoba.getNazwisko()) &&
                Objects.equals(this.getDataUrodzenia(), osoba.getDataUrodzenia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getNazwisko(), getDataUrodzenia());
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Data getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Data dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
