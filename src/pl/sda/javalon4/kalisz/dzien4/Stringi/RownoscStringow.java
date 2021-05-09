package pl.sda.javalon4.kalisz.dzien4.Stringi;

public class RownoscStringow {

    public static void main(String[] args) {
        String a = "abc";
        String b="abc";// short way of creating String objects, we are no creating with new ,new object that takes space in the memeory,
        //...instead if we use the same string, it points to the same place in the memory so a==b-true . This is a trick of the computer.
        String c= new String(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a==b); //true as pointing to the same place in the memory, we are checking if location is the same with == for objects
        System.out.println(a.equals(b)); //true, with equals we are comparing value of the objects so values are the same
        System.out.println(a==c);//false dwa osobny pudelka, this is false as they sit in two different places in memory as new object c has been created
        System.out.println(a.equals(c));//true// although they are in two different places in memory, their value is the same

    }

}
