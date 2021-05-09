package pl.sda.javalon4.kalisz.dzien1;

public class TypyZadania {

    public static void main(String[] args) {
        //'a' - znak, "a" - tekst

        System.out.println(2+3); //5
        System.out.println(2-4);// -2
        System.out.println(5/2); // 2
        System.out.println(5.0/2);//2.5
        System.out.println(5/2.0);//2.5
        System.out.println(5.0/2.0);// 2.5
        System.out.println(100L-10);//90
        System.out.println(2f-3);//-1.0
        System.out.println(5f/2);//2.5
        System.out.println(5d/2);//2.5
        System.out.println('A'+2);//67 ------ZOBACZ KOD ASCII
        System.out.println('a'+2);//99 ASCII
        System.out.println("a"+2);//a2 " test"    ""!= ''
        System.out.println("a"+"b");//ab
        System.out.println('a'+'b');//195 DWA ZNAKI konwertuje
        System.out.println("a"+'b');//ab
        System.out.println("a"+'b'+3);//ab3
        System.out.println('b'+3+"a");//101aKlasa3
        System.out.println(9%4);//1
        System.out.println(9.0%4); // 1
        System.out.println(9/4);//2
// znak plus znak - java kowertuje na liczby
        // znak plus text =text
        //liczba plus znak = liczba
        //text plus liczba= text liczba


    }
}
