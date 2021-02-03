package lt.itacademy.java.basics;

import java.util.Scanner;
import java.lang.Math;

public class Operators {
    public static void main(String[] args) {
        System.out.println("+++++++++Task 6+++++++++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle side values: ");
        String values = scanner.nextLine();
        String[] elements = values.split(" ");
        System.out.println("Triangle is "+ checkTriangle(Double.parseDouble(elements[0]), Double.parseDouble(elements[1]), Double.parseDouble(elements[2])) + ". Sides: "+ values);
        System.out.println("+++++++++Task 7++++++++");
        System.out.println("Enter Car data: ");
        String carData = scanner.nextLine();
        String[] arrCarData = carData.split(" ");
        System.out.println(canCarReach(Double.parseDouble(arrCarData[0]),Double.parseDouble(arrCarData[1]),Double.parseDouble(arrCarData[2]),Double.parseDouble(arrCarData[3])));


    }
    static String checkTriangle(double a, double b, double c){
        if(a==b && b==c){
            return "Equilateral";
        } else if(a==b || b==c || c==a){
            return"Isosceles";
        }
        return"Scalene";
    }
    static String canCarReach(double dist, double fuel, double usage, double price){
        if( fuel < dist/100*usage){
            double needToFill = dist/100*usage - fuel;
            return "Destination is in "+dist+ "km. Car is not able to reach the destination. It needs " + needToFill + " liter of fuel more. It will cost "+needToFill*price;
        }else{
            double leftFuelTimes = Math.round((fuel - dist/100*usage)*100);
            double leftFuel= leftFuelTimes/100;
            return "Destination is in "+dist+ "km Car is able to reach the destination. It will have "+leftFuel +" liters of fuel left.";
        }
    }
}
