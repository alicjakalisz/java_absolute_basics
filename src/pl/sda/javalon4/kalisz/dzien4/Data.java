package pl.sda.javalon4.kalisz.dzien4;

public class Data {// we dont need to put main here
   // attributes
     public int dzien;
     public int miesiac;
     public int rok;


  // constructor
  public Data(int dzien, int miesiac, int rok){
      this.dzien=dzien;        // this jest obligatoryjne
      this.miesiac=miesiac;
      this.rok=rok;
  }

  public Data(){} // pusty konstruktor - jesli nie podamy arguemtnow to ten bedzie wybrany





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



}
