package pl.sda.javalon4.kalisz.dzien3.TablicaArray;
//stworz tablice rodzina z czlonkam rodzin min 3, max 4 i wydrukuje zawartosc tablicy
// przyklad deklaracji tablicy z zawartosci:
//double[] nazwa=new double[]{1.0,2.7};
public class Rodzina {
    public static void main(String[] args) {
        String[] rodzina= new String[]{"Lucyna", "Grzegorz", "Piotr", "Kasia"};

  /*      for(int i=0;i<rodzina.length;i++){
            System.out.println(rodzina[i]);
        }
        // wydrukuje Roger:
        String[] imiona={"Krzysztof", "Bob", "Roger", "Krystian"};
        System.out.println(imiona[2]);
    }
    */
    //Wczytaj do tablicy 10 liczb wprowadzonych przez uzytkownika.
    //Nastepnie popros go o podanie 2 indeksow i wydrukuje sume elemenetow o podanych indeksach


    for( String imie: rodzina){
        System.out.println("imie "+ imie);
    }
}}
