package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++++++Task 4+++++++++");
        System.out.println("Enter value");
        String elementsLine = scanner.nextLine();
        int value = Integer.parseInt(elementsLine);

        System.out.println("Cube’s volume: " + (value*value*value)+"cm3");
        System.out.println("Cube’s perimeter: " + (value*12)+"cm");
        System.out.println("+++++++++Task 5+++++++++");
        System.out.println("Enter length in feet and inches: ");
        String values = scanner.nextLine();
        String[] elements = values.split(" ");
        float feets = Float.parseFloat(elements[0]);
        float inches = Float.parseFloat(elements[1]);
        System.out.println(feets + " feet and " + inches + " inches = " + calcCentimetres(feets, inches )+"cm" );

    }
static float calcCentimetres(float feets, float inches ){
        return (float) ((feets * 12 + inches)*2.54);
}

}
