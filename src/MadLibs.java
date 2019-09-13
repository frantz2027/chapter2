import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        String color;
        String WordEst;
        String bodyPart;
        String animal;
        String noun;
        String pluralNoun;



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
        System.out.print()


        c = a%b;

        System.out.println("The " + color + " Dragon is the " + WordEst + " Dragon of all. ");
        System.out.println("It has " + c + bodyPart + ", and a " + animal + "shaped like a " + noun + "."
        "It loves to eat" + pluralNoun + ", although it will feast on nearly anything.");


    }
}
