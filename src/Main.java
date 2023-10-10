import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userMeasure;
        boolean done = false;
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;
        System.out.println("Give me a measurement in meters:");
        do {
            if (scan.hasNextDouble()) {
                userMeasure = scan.nextDouble();
                if (userMeasure > 0) {
                    System.out.println("Miles: " + METERS_TO_MILES*userMeasure);
                    System.out.println("Feet: " + METERS_TO_FEET*userMeasure);
                    System.out.println("Inches: " + METERS_TO_INCHES*userMeasure);
                }else{
                    System.out.println("You have entered a measurement below zero.");
                }
            }else{
                System.out.println("You have entered something invalid!");
                scan.nextLine();
            }
        } while (!done);
    }
}