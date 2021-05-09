package pl.sda.javalon4.kalisz.dzien1;

public class Dodawanie {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a=1;
        b=2;
        c=3;

        System.out.println(a+2);
        System.out.println(a+b);
        System.out.println(1+1);
        System.out.println(a+(b+c));
        System.out.println(a+b+b);

        c=a+b;
        System.out.println(c);
        c=c+8;
        System.out.println(c);
        System.out.println(c+100);// 13+100 ale nie podstawiamy wartosci wiec co zostaje takie same !!
        System.out.println(c);// jak teraz sprawdzimy czym jest c

    }
}
