import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;
        int numGal = 0;
        int fuelEff = 0;
        do {
            System.out.println("Enter the # of gallons of gas in the tank: ");
            if (in.hasNextInt()) {
                numGal = in.nextInt();
                in.nextLine();
                done1 = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said " + trash);
                System.out.println("That's not quite right. Try again.");
            }
        }while(!done1);

        do {
            System.out.println("Enter the fuel efficiency in MPG: ");
            if (in.hasNextInt()) {
                fuelEff = in.nextInt();
                in.nextLine();
                done2 = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said " + trash);
                System.out.println("That's not quite right. Try again.");
            }
        }while (!done2);

        do {
            System.out.println("Enter the price per gallon: ");
            if (in.hasNextDouble()) {
                double ppg = in.nextDouble();
                in.nextLine();
                double distance = numGal * fuelEff;
                double costHundred = (100 / fuelEff) * ppg;
                System.out.println("It costs $" + df.format(costHundred) + " to have 100 miles worth of gas.");
                System.out.println("Currently, you can go " + distance + " miles in your vehicle.");
                done3 = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said " + trash);
                System.out.println("That's not quite right. Try again.");
            }
        }while (!done3);
    }
}