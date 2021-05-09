package pl.sda.javalon4.kalisz.dzien2;
/* Petla wykonuje kod dopoki waurnek jest spleniony, jak jest to kod jest wykonany i wracam do poczatku jak nie to opuszczamy petle,
kod jest wykonywany przez skonczona albie nieskonczona ilosc razy
3 sposoby wykonaniu kodu w petli, kazda z tych petli mozna przerobic na inna petle, 3 rodzaje dla wygody:
FOR - (inicializacja (licznik- ile razy sie petla wykonala; warunek logiczny do spelniania; aktualizacja- fragment kodu ktory wykonuje sie za kazdym razem kiedy jeden obieg petli sie zakonczyl
{} pomiedzy klamerkami piszemy ilosc kodu ktory ma sie wykonac
WHILE
DO...WHILE

*/
public class PierwszyForPetla {

    public static void main(String[] args) {
       //i - licznik wykonania petlo ;
        for(int i=0; i<10; i++){ // 1)najpierw rozpoczynamy od liczby petli 0 , 2)potem sprawdzamy warunek i 3)jak ok to wykonujemy kod, 4)na koncu i zwieksza sie o 1 i petle wraca
            System.out.println("i wynosi = " + i);
            System.out.println("Hello World");// wrzucamy kod do petli
        }
        System.out.println("******************************************");

        for(int i=10; i>0; i--){ // 1)najpierw rozpoczynamy od liczby petli do zrobienia 10 , 2)potem sprawdzamy warunek i 3)jak ok to wykonujemy kod, 4)na koncu i zmniejsza sie o 1 i petle wraca
            System.out.println("i wynosi = " + i);
            System.out.println("Hello World");// wrzucamy kod do petli
        }


    }

}
