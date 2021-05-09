package pl.sda.javalon4.kalisz.zadaniadomowe;

import java.security.AllPermission;
import java.util.Scanner;

/*
Write an application which counts the average of the few subjects
math, chemiststry, selfdefence, IT, polish , english

average of all the subcject
average of only math, chemistty, it
average of polish , englis, selfdefence
 print them out on the console
 if average 1 - from the subject or from the average - write :Mark - not satisfying
 */
public class ZadanieDomowe8b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mark for Math: ");
        int math=scanner.nextInt();
        System.out.println("Mark for Chemistry: ");
        int chemistry=scanner.nextInt();
        System.out.println("Mark for Selfdefence: ");
        int selfdefence=scanner.nextInt();
        System.out.println("Mark for english: ");
        int english=scanner.nextInt();
        System.out.println("Mark for polish: ");
        int polish=scanner.nextInt();
        System.out.println("Mark for IT: ");
        int iT=scanner.nextInt();

        checkSubjectMark(math, "math");
        checkSubjectMark(chemistry, "chemistry");
        checkSubjectMark(selfdefence, "selfdence");
        checkSubjectMark(english, "english");
        checkSubjectMark(polish, "polish");
        checkSubjectMark(iT, "infomatika");

        int[] allTheSubjects={math, chemistry, selfdefence, english, polish, iT};
        printAverage(allTheSubjects, "All");

        int[] strict={math, chemistry, iT};
        printAverage(strict, "Strict");

        int[] rest={selfdefence, english, polish};
        printAverage(rest, "Rest");

    }

    public static void checkSubjectMark(int mark, String subject){
        if(mark==1){
            System.out.println("Your mark from " + subject + " is not satisfying");
        }
    }
    public static void printAverage(int[] subjects, String category){
        float average=0;
        int total= 0;
        for(int i=0; i<subjects.length;i++){
            total = total + subjects[i];
        }
        average=(float)total/(float)subjects.length;
        if(average==1){
            System.out.println("The average of " + category + " is not satisfying");
        } else{


        }
    }
}
