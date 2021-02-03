package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("+++++++++Task 8+++++++++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int days = Integer.parseInt(scanner.nextLine());
        System.out.println(calcHoursMinutes(days));
        System.out.println("+++++++++Task 9+++++++++");
        System.out.println(calcHoursMinutesRefactored(days));
        System.out.println("+++++++++Task 10+++++++++");
        System.out.println("Enter number to calculate Factorial: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(calcFactorial(number));
        }

        static String calcHoursMinutes(int days){
            int hours = 0;
            int minutes = 0;
            for(int i = 0; i< days; i++){
                hours += 24;
                minutes += 1440;
            }
            return "There are "+hours+" hours or "+minutes+" minutes in one year.";
        }

        static String calcHoursMinutesRefactored(int days){
            int hours = 0;
            int minutes = 0;
            int i = 0;
                while (i< days){
                 hours += 24;
                 minutes += 1440;
                i++;
                }

        return "There are "+hours+" hours or "+minutes+" minutes in one year.";
        }
    static String calcFactorial(int number){
        int factorial = 1;
        for (int i = number; i>0;i--){
            factorial*=i;
        }
        return "Factorial of number "+ number +" is "+factorial;
    }
}
