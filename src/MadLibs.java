import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        String color;
        String WordEst;
        String bodyPart;
        



        int a = 2;
        int b = 1;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.print("enter a color >>> ");
        color = input.nextLine();
        System.out.print("enter a word ending in EST >>> ");
        WordEst = input.nextLine();
        System.out.print("enter a plural body part >>> ");
        bodyPart = input.nextLine();


        c = a%b;

        System.out.println("The " + color + " Dragon is the " + WordEst + " Dragon of all. ");
        System.out.println("");


    }
}
