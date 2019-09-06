import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final double PRICE_OF_DOZEN = 3.25;
        final double PRICE_OF_INDIVIDUAL = .45;
        int numberOfEggs;
        int numberOfDozen;
        int numberOfIndividuals;
        double costOfDozens;
        double costOfIndividuals;
        double totalCost;
        final int EGGS_IN_A_DOZEN = 12;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount of eggs >>>");
        numberOfEggs = keyboard.nextInt();
        numberOfDozen = numberOfEggs / EGGS_IN_A_DOZEN;
        numberOfIndividuals = numberOfEggs % numberOfDozen;

        costOfDozens = PRICE_OF_DOZEN * numberOfDozen;
        costOfIndividuals = PRICE_OF_INDIVIDUAL * numberOfIndividuals;

        totalCost = costOfDozens + costOfIndividuals;

        System.out.print("You ordered " + numberOfEggs +  " eggs. That's " + numberOfDozen + " dozen at $3.25 per dozen and "
                + numberOfIndividuals + " at 45 cents a piece. For a total of " + totalCost );






    }
}
