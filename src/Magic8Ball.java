import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){

        Scanner keyboard;
        int testing;
        String question;
        int pickednumber;



        keyboard=new Scanner(System.in);


        pickednumber=(int)(Math.random()*100);

        System.out.println("ask the magic 8 ball a question  ");
        question=keyboard.nextLine();

        if (pickednumber<11) {
            System.out.println("not happening");
        }
        else if  (pickednumber<21) {

            System.out.println("looking good");
        }

        else if (pickednumber<31) {

            System.out.println("yeah probably ");

        }
        else if (pickednumber<41) {

            System.out.println("yes sir");
        }
        else if (pickednumber<51) {

            System.out.println("Luck is on your side");

        }

        else if (pickednumber<61) {
            System.out.println("you hit the jackpot");
        }


        else if (pickednumber<71) {
            System.out.println("doesn't look good ");
        }

        else if (pickednumber<81) {
            System.out.println("never ");
        }

        else if (pickednumber<91) {
            System.out.println("error");
        }

        else if (pickednumber<101) {
            System.out.println("the future doesn't look bright for you");
        }

























































    }























































}
















