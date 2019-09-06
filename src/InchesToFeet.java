import java.util.Scanner;

public class InchesToFeet {
    public static void main(String[] args){

        int numFeet;
        int numInches;
        double inchesRemaining ;
        final int NUM_INCHES_IN_FOOT = 12;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your height in inches>>> ");
        numInches = keyboard.nextInt();
        numFeet =  numInches / NUM_INCHES_IN_FOOT;
        inchesRemaining = numInches % NUM_INCHES_IN_FOOT;
        System.out.print(" Your height is " + numFeet + " feet and " + inchesRemaining + " inches ");

    }
}
