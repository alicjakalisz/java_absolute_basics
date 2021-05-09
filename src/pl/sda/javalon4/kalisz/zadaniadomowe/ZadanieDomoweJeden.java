package pl.sda.javalon4.kalisz.zadaniadomowe;

public class ZadanieDomoweJeden {


    public static void main(String[] args) {

        boolean isHot = true;
        boolean isWindy = true;
        boolean isSunny = false;


        if (isWindy && !isSunny && !isHot) {
            System.out.println("Ubieram kurtke");
        } else if (!isHot || isWindy) {
            System.out.println("I am dressing up warmly");
        } else if (!isSunny && !isWindy) {
            System.out.println("I am taking umbrella");
        }

    }
}

