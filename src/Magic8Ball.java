import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){

        Scanner keyboard;
        int testing;
        String question;



        keyboard=new Scanner(System.in);

        System.out.println("ask the magic 8 ball a question  ");
        question=keyboard.nextLine();
        System.out.println("Write a number from 0-100 ");
        testing=keyboard.nextInt();
        if (testing<11) {
            System.out.println("you're the man ");
        }
        if (testing<21) {

            System.out.println("looking good");
        }

        if (testing<31) {

            System.out.println("not happening ");

        }
        if (testing<41) {

            System.out.println("yes sir");
        }
        if (testing<51) {

            System.out.println("Luck is on your side");

        }

        if (testing<61) {
            System.out.println("you hit the jackpot");
        }


        if (testing<71) {
            System.out.println("doesn't look good ");
        }

        if (testing<81) {
            System.out.println("never ");
        }

        if (testing<91) {
            System.out.println("error");
        }

        if (testing<101) {
            System.out.println("the future doesn't look bright for you");
        }

























































    }























































}
















