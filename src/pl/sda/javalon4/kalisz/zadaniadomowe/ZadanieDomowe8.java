package pl.sda.javalon4.kalisz.zadaniadomowe;

public class ZadanieDomowe8 {
    /* Write an application which counts the average of the few subjects
    math, chemiststry, selfdefence, IT, polish , english

    average of all the subcject
    average of only math, chemistty, it
    average of polish , englis, selfdefence
     print them out on the console
     if average 1 - from the subject or from the average - write :Mark - not satisfying


     */


    public static void main(String[] args) {

        int math=6;
        int chemistry=1;
        int selfdefence=3;
        int english=5;
        int polish=2;
        int iT=1;

        if(math==1){
            System.out.println("Your mark from math is not satisfying");
        }
        if(chemistry==1){
            System.out.println("Your mark  from chemistry is not satisfying");
        }
        if(selfdefence==1){
            System.out.println("Your mark from selfdefence is not satisfying");
        }
        if(english==1){
            System.out.println("Your mark  from english is not satisfying");
        }
        if(polish==1){
            System.out.println("Your mark from polish not satisfying");
        }
        if(iT==1){
            System.out.println("Your mark from iT is not satisfying");
        }


        float averageOfAll=(math + chemistry + selfdefence + english + polish + iT)/6;
        if(averageOfAll==1){
            System.out.println("Your mark is not satisying");
        } else{
            System.out.println("Your average is of all subjects is " + averageOfAll);
        }
        float averageofStrict=(math+ chemistry+ iT)/3;
        if(averageofStrict==1){
            System.out.println("Your average is not satisfiny");
        }else {
            System.out.println("Your average of the strict subjects is " +averageofStrict);
        }
        float averageRest=(polish+english+selfdefence)/3;
        if(averageRest==1){
            System.out.println("Your average is not satysying");
        }else {
            System.out.println("Your average is " + averageRest);
        }

    }
}
