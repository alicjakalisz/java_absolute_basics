package pl.sda.javalon4.kalisz.dzien1;

public class Operatory {

    public static void main(String[] args) {


        int x =5;
        System.out.println(x);

        x=x+3;
        System.out.println(x);
        x=x+3;
        System.out.println(x);
        System.out.println(x+3); // wydrukujemy ale nie przypiszemy wartosci wiec x nie zmieni wartosci (to dzialanie jest tylko wewnatrz do drukowania, x nie zmienia wartosci poza.
        System.out.println(x);
        System.out.println("****************");

        int y=5;
        y++;
        System.out.println(y); // 6
        y--;
        y--;
        System.out.println(y);// 4
        y*=5;
        System.out.println(y);
        y/=10;
        System.out.println(y);
        y/=4;

        System.out.println("*******************");
        // logiczne operatory
        boolean a=false;
        boolean b = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(true|| false);
        System.out.println(true && false);
        System.out.println("**************");
        // operatory relacji - wyniki falsz albo prawda
        System.out.println(3>5);
        System.out.println(3>3);

        int c= 3;
        System.out.println(c>=3);
        c--;
        System.out.println(c>=3);
        System.out.println("*****************");

        System.out.println(false==false); // true
        System.out.println(false!=true); // true
        System.out.println(!true);// false // zaprzecza
        System.out.println(2>4);// false
        System.out.println(3>5); // false
        System.out.println(3==3 && 3==4);// false  jedno i drugie musi byc prawdzie inaczej falsz
        System.out.println(3!=5 || 3==5); //TRUE!!!!! wystarczy aby jedno bylo prawdziwe, lub oba tez
        System.out.println((2+4)>(1+3));// true
        System.out.println("cos".equals("cos")); // true - always with string use equals as it compares the content not the address
        System.out.println("cos"=="cos"); // you are comparing if the adress in memory is the same , not the  content



    }

}
