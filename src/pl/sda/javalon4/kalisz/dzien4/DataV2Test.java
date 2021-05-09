package pl.sda.javalon4.kalisz.dzien4;

public class DataV2Test {
    public static void main(String[] args) {

        DataV2 object= new DataV2();

        object.setDzien(21);
        object.setMiesiac(5);
        object.setRok(1987);

        System.out.println(object.przerobNaTekst());

        // before we could access attributes by sout(object.dzien) but now the attribures are private so we cannot access them directly,
        //we need to use get method

        System.out.println(object.getDzien() + " " + object.getMiesiac()+ " " + object.getRok());


        DataV2 object2= new DataV2();

        object2.setDzien(21);
        object2.setMiesiac(5);
        object2.setRok(1987);

        DataV2 object3= new DataV2();

        object3.setDzien(5);
        object3.setMiesiac(6);
        object3.setRok(1987);

        System.out.println(object.equals(object2));
        System.out.println(object.equals(object3));
        System.out.println(object.equals(object));

        Data oldData= new Data();


        System.out.println("this is " + object.equals(oldData) + " because you are comparing 2 objects of different classes");

        Data notInitialized= null;

        System.out.println("this is "+ object.equals(notInitialized) + " because the object passed as parameter has null value. It is not initialized.");

    }
}
