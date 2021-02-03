package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("+++++++++Task 11+++++++++");
        Scanner scanner = new Scanner(System.in);
        boolean canCalculate = true;

        while(canCalculate) {
            System.out.println("Enter data: ");
            String values = scanner.nextLine();
            String[] entryData = values.split(" ");
            System.out.println(calcAreaPerimeter(entryData));
            System.out.println("Calculate again? (Yes/No) ");
            String answer = scanner.nextLine().toUpperCase();

                if(answer.equals("NO")){
                 canCalculate = false;
                }
        }
    }
    static String calcAreaPerimeter(String[] entryData){
        double perimeter = 0;
        double area = 0;

        switch (entryData[0]){
            case "Triangle":
                if(Double.parseDouble(entryData[1])==0 || Double.parseDouble(entryData[2])==0 || Double.parseDouble(entryData[3])==0){
                    return "Triangle line value can’t be 0";
                }
                perimeter = Double.parseDouble(entryData[1]) + Double.parseDouble(entryData[2]) + Double.parseDouble(entryData[3]);
                area = Math.sqrt(0.5*perimeter*(0.5*perimeter - Double.parseDouble(entryData[1]))*(0.5*perimeter - Double.parseDouble(entryData[2]))*(0.5*perimeter - Double.parseDouble(entryData[3])));
                break;
            case "Rectangle":
                if(Double.parseDouble(entryData[1])==0 || Double.parseDouble(entryData[2])==0 ){
                    return "Rectangle line value can’t be 0";
                }
                perimeter = (Double.parseDouble(entryData[1]) + Double.parseDouble(entryData[2]))*2;
                area = (Double.parseDouble(entryData[1]) * Double.parseDouble(entryData[2]));
                break;
            case "Square":
                if(Double.parseDouble(entryData[1])==0 ){
                    return "Square line value can’t be 0";
                }
                perimeter = 4 * Double.parseDouble(entryData[1]);
                area = Double.parseDouble(entryData[1])* Double.parseDouble(entryData[1]);
                break;
            default:
                break;
        }
        return entryData[0]+" perimeter is "+perimeter+" and area is "+area;
    }
}
