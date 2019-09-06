import java.util.Scanner;

public class NauticalMiles {
    public static void main(String[]args){

        double nauticalMiles;
        final double NM_TO_KILOMETERS = 1.852;
        final double NM_TO_MILES = 1.150779;
        double kilometers;
        double miles;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of nautical miles>>> ");
        nauticalMiles = keyboard.nextInt();
        kilometers = nauticalMiles * NM_TO_KILOMETERS;

        miles = nauticalMiles * NM_TO_MILES;
        System.out.println(" The number of kilometers is " + kilometers);
        System.out.println(" the number of miles is " + miles);

    }
}
